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
    int jumpSpeed = 5;
    int maxJumpHeight = 100;
    boolean jumping = false;
    
    int animDelay = 0;
    
    GreenfootImage[] idle = new GreenfootImage[10];
    
    
    public Winnie() {
        for(int i = 0; i < idle.length; i++) {
            idle[i] = new GreenfootImage("winnie_idle/idle" + i + ".png");
            idle[i].scale(40, 60);
        }
        
        setImage(idle[0]);
    }
    
    /**
     * Animate winnie
     */
    
    int imageIndex = 0;
    
    public void animateWinnie() {
        animDelay++;
        if (animDelay % 6 == 0) {
            setImage(idle[imageIndex]);
            imageIndex = (imageIndex + 1) % idle.length;
        }
        
    }
    
    public void act() {
        
        // key movement of winnie
        moveLeftRight();
        jump();
        gravity();
        collisionGround();
        animateWinnie();
    }
    
    private void moveLeftRight() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        else if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }
    }
    
    private void jump() {
        if (Greenfoot.isKeyDown("up") && !jumping) {
            jumping = true;
        }
        
        if (jumping) {
            if (getY() > groundY - maxJumpHeight) {
                jumpSpeed = -5;
                setLocation(getX(), getY() + jumpSpeed);
            } else {
                jumping = false;
            }
        }
    }
    
    private void gravity() {
        if (!jumping && getY() < groundY) {
            jumpSpeed = 5;
            setLocation(getX(), getY() + jumpSpeed);
        }
    }
    
    private void collisionGround(){
        GroundTile tile = (GroundTile)getOneIntersectingObject(GroundTile.class);
        //only Land if falling or standing
        if(tile != null && jumpSpeed >= 0){
            
            int tileTop = tile.getY() - tile.getImage().getHeight()/2;
            int playerHalf = getImage().getHeight()/2;
            
            setLocation(getX(), tileTop - playerHalf);
            
            //updates real ground level
            groundY = getY();
            jumping = false;
        }
    }
}
