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
    
    
    boolean facingRight = true;
    int animDelay = 0;
    
    GreenfootImage[] idleForward = new GreenfootImage[10];
    GreenfootImage[] idleBackward = new GreenfootImage[10];
    
    
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
    }
    
    private void moveLeftRight() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
            facingRight = false;
        }
        else if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
            facingRight = true;
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
