import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winnie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winnie extends Actor {
    /**
     * Act - do whatever the Winnie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 4;
    
    int groundY = 260;
    int jumpSpeed = 3;
    int maxJumpHeight = 400;
    boolean jumping = false;
    boolean onGround = false;
    boolean jumpKeyPressed = false;
    int ySpeed = 0;
    int gravity = 1;
    int jumpPower = -16;
    
    boolean facingRight = true;
    int animDelay = 0;
    
    GreenfootImage[] idleForward = new GreenfootImage[10];
    GreenfootImage[] idleBackward = new GreenfootImage[10];
    
    
    boolean canTakeDamage = true;
    int coolDownTimer = 0;
    int cameraX = 300;
    
    boolean canMove = true;
    
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
     * Animate winnie
     */
    
    int imageIndex = 0;
    
    public void animateWinnie() {
        animDelay++;
        if (animDelay % 6 == 0) {
            if (facingRight) {
                setImage(idleForward[imageIndex]);
            } else {
                setImage(idleBackward[imageIndex]);
            }
        }
        
        imageIndex = (imageIndex + 1) % 10;
        
    }
    
    private boolean isMoving() {
        return Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("right");
    }
    
    public void act() {
        if (!canMove) {
            return;
        }
        
        // key movement of winnie
        moveLeftRight();
        jump();
        gravity();
        collisionGround();
        
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
    
    public void stopMoving() {
        canMove = false;
    }
    
    private void moveLeftRight() {
        int newX = getX();
        
        if (Greenfoot.isKeyDown("left")) {
            newX -= speed;
            facingRight = false;
        }
        else if (Greenfoot.isKeyDown("right")) {
            newX += speed;
            facingRight = true;
            
            if(newX > 300){
                scrollWorld(speed);
                newX = 300;
            }
        }
        
        int halfWidth = getImage().getWidth()/2;
        if (newX < halfWidth) {
            newX = halfWidth;
        } else if (newX > getWorld().getWidth() - halfWidth) {
            newX = getWorld().getWidth() - halfWidth;
        }
        
        setLocation(newX, getY());
    }
    
    private void jump() {
        boolean upOnce = Greenfoot.isKeyDown("up");
        
        // can only jump on the key if it is pressed
        if (upOnce && !jumpKeyPressed && onGround) {
            ySpeed = jumpPower;
            onGround = false;
        }
        
        jumpKeyPressed = upOnce;
    }
    
    private void gravity() {
        ySpeed += gravity;
        
        // makes him fall slower
        if (ySpeed > 8) {
            ySpeed = 8;
        }
        
        setLocation(getX(), getY() + ySpeed);
    }
    
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
    
    private void collisionEnemy() {
        Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        MyWorld w = (MyWorld) getWorld();
        if(enemy != null){
            int enemyTop = enemy.getY() - enemy.getImage().getHeight() / 2;
            int playerBottom = getY() + getImage().getHeight() / 2;
            if(playerBottom <= enemyTop + 5 ){
                enemy.die();
                jumpSpeed = -8;
                jumping = true;
                
                MyWorld world = (MyWorld) getWorld();
                world.addPoints(10);
            }else if(canTakeDamage){
                w.loseHp();
                canTakeDamage = false;
                coolDownTimer = 50;
            }
        }
    }
    
    private void damageCooldown(){
        if(!canTakeDamage){
            coolDownTimer--;
            if(coolDownTimer <=0){
                canTakeDamage = true;
            }
        }
    }
    
    private void scrollWorld(int dx){
        for(WorldObject obj : getWorld().getObjects(WorldObject.class)){
            obj.move(dx);
        }
    }
    
    private void fall(){
        if(this.getY() > 280){
            Greenfoot.setWorld(new TerminateGame());
        }
    }
}

