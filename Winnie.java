import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main player character
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/26)
 */
public class Winnie extends Actor {
   // speed winnie moves at
   int speed = 4;
    
   // jumping and gravity variables
   int groundY = 260;
   int jumpSpeed = 3;
   int maxJumpHeight = 400;
   boolean jumping = false;
   boolean onGround = false;
   boolean jumpKeyPressed = false;
   int ySpeed = 0;
   int gravity = 1;
   int jumpPower = -16;
    
   // direction
   boolean facingRight = true;
   
   // animation
   int animDelay = 0;
   int imageIndex = 0;
   
   GreenfootSound owSound = new GreenfootSound("ow.mp3");
    
   // animation images
   GreenfootImage[] idleForward = new GreenfootImage[10];
   GreenfootImage[] idleBackward = new GreenfootImage[10];
    
   // allows Winnie to be hit
   boolean canTakeDamage = true;
   int coolDownTimer = 0;
   
   // scrolling screen
   int cameraX = 300;
   
   // freezes the player
   boolean canMove = true;
   
   // gets distance travelled in the game
   public int distanceTravelled = 0;
    
   /**
    * Constructor for Winnie.
    */
   public Winnie() {
        for(int i = 0; i < 10; i++) {
            idleForward[i] = new GreenfootImage("winnie_idle_forwards/idle" + i + ".png");
            idleBackward[i] = new GreenfootImage("winnie_idle_backwards/idle" + i + ".png");
            
            idleForward[i].scale(40, 60);
            idleBackward[i].scale(40, 60);
        }
        
        // have default image facing right
        setImage(idleForward[0]);
    }
    
   /**
     * Animate winnie while moving.
     */    
   public void animateWinnie() {
        
       animDelay++;
       
       // change frame
       if (animDelay % 6 == 0) {
            if (facingRight) {
                setImage(idleForward[imageIndex]);
            } else {
                setImage(idleBackward[imageIndex]);
            }
       }
        
       // loop in animation frames
       imageIndex = (imageIndex + 1) % 10;
        
   }
    
   /**
    * Checks if winnie is moving left or right.
    */
   private boolean isMoving() {
        return Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("right");
   }
    
   /**
    * Manages the movement, gravity, animation and collisions
    */
   public void act() {
       // stops movement when the game ends
       if (!canMove) {
            return;
       }
        
       // key movement of winnie
       moveLeftRight();
       jump();
       gravity();
       collisionGround();
        
       // only animate when winnie is moving
       if (isMoving()) {
            animateWinnie();
       } else {
           if (facingRight) {
                setImage(idleForward[0]);
           } else {
                setImage(idleBackward[0]);
           }
           imageIndex = 0;
       }
       
       collisionEnemy();
       fall();
       damageCooldown();
       
   }
    
   /**
    * Prevents winnie from moving after the game has ended.
    */
   public void stopMoving() {
        canMove = false;
   }
    
   /**
    * Manages left and right movement while the world moves right. 
    */
   private void moveLeftRight() {
       int newX = getX();
        
       // scrolls the world when the player reaches the
       // center of the screen
       if (Greenfoot.isKeyDown("left")) {
            newX -= speed;
            facingRight = false;
       } else if (Greenfoot.isKeyDown("right")) {
            newX += speed;
            facingRight = true;
            
            if (newX > 300){
                scrollWorld(speed);
                newX = 300;
            }
       }
        
       // prevents player from leaving the screen
       int halfWidth = getImage().getWidth()/2;
       if (newX < halfWidth) {
            newX = halfWidth;
       } else if (newX > getWorld().getWidth() - halfWidth) {
            newX = getWorld().getWidth() - halfWidth;
       }
        
       setLocation(newX, getY());
   }
    
   /**
    * Manages winnie's jumping movement.
    */
   private void jump() {
        boolean upOnce = Greenfoot.isKeyDown("up");
        
        // can only jump on the key if it is pressed
        if (upOnce && !jumpKeyPressed && onGround) {
            ySpeed = jumpPower;
            onGround = false;
        }
        
        jumpKeyPressed = upOnce;
   }
    
   /**
    * Manages winnie going down and staying down
    * throughout the game.
    */
   private void gravity() {
        ySpeed += gravity;
        
        // makes him fall slower
        if (ySpeed > 8) {
            ySpeed = 8;
        }
        
        setLocation(getX(), getY() + ySpeed);
   }
    
   /**
    * Winnie's collision with the ground tiles.
    */
   private void collisionGround(){
        GroundTile tile = (GroundTile)getOneIntersectingObject(GroundTile.class);
        
        if (tile != null) {
            int tileTop = tile.getY() - tile.getImage().getHeight()/2;
            int tileBottom = tile.getY() + tile.getImage().getHeight()/2;
            
            int actorHalf = getImage().getHeight()/2;
            int actorTop = getY() - actorHalf;
            int actorBottom = getY() + actorHalf;
            
            // land only when falling
            if (ySpeed >= 0 && getY() + actorHalf <= tileTop + 10 && actorBottom <= tileTop + 10) {
                setLocation(getX(), tileTop - actorHalf);
                groundY = getY();
                ySpeed = 0;
                jumping = false;
                onGround = true;
            } else if (actorTop <= tileBottom + 5 && ySpeed < 0) {
                setLocation(getX(), tileBottom + actorHalf);
                ySpeed = 3;
                jumpSpeed = 0;
                jumping = false;
            }
            
        } else {
            onGround = false;
        }
   }
    
   /**
    * When Winnie collides with an enemy.
    */
   private void collisionEnemy() {
       
       Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);
       MyWorld w = (MyWorld) getWorld();
       
       if (enemy != null) {
           int enemyTop = enemy.getY() - enemy.getImage().getHeight() / 2;
           int playerBottom = getY() + getImage().getHeight() / 2;
           
           // jumping on enemy and removes it from screen
           if(playerBottom <= enemyTop + 5 ) {
                enemy.die();
                jumpSpeed = -8;
                jumping = true;
                
                MyWorld world = (MyWorld) getWorld();
                world.addPoints(10);
            } else if(canTakeDamage) {
                w.loseHp();
                owSound.play();
                canTakeDamage = false;
                coolDownTimer = 50;
           }
       }
   }
   
   /**
    * Prevents Winnie from losing life too fast.
    */
   private void damageCooldown() {
       
        if(!canTakeDamage) {
            coolDownTimer--;
            if(coolDownTimer <=0) {
                canTakeDamage = true;
            }
        }
   }
    
   /**
    * scrolls the world objects with the screen.
    */
   private void scrollWorld(int dx) {
       distanceTravelled += dx;
       
       for(WorldObject obj : getWorld().getObjects(WorldObject.class)){
            obj.move(dx);
       }
   }
    
   /**
    * Checks if the player has fallen off the screen
    */
   private void fall(){
       // if the winner wins
       if(distanceTravelled >= 8000) {
           canMove = false;
           
           // final score
           MyWorld world = (MyWorld)getWorld();
           int finalScore = world.getScore();
           
           Greenfoot.setWorld(new EndWorldScreen(finalScore));
           return;
       }
       
       // if the player falls into the ground and does not 
       // reach finish line
       if(this.getY() > 280 && distanceTravelled < 8000) {
            Greenfoot.setWorld(new GameOver());
        }
   }
}

