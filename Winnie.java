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
    
    int groundY = 300;
    int jumpSpeed = 5;
    int maxJumpHeight = 100;
    
    boolean jumping = false;
    
    public Winnie() {
        GreenfootImage img = getImage();
        img.scale(20, 40);
    }
    public void act() {
        
        // key movement of winnie
        moveLeftRight();
        jump();
        fallToGround();
        
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
        
        if (Greenfoot.isKeyDown("up") && !jumping && getY() == groundY) {
            jumping = true;
        }
        
        if (jumping) {
            if (getY() > groundY - maxJumpHeight) {
                setLocation(getX(), getY() - jumpSpeed);
            } else {
                jumping = false;
            }
        }
        
    }
    
    private void fallToGround() {
        if (!jumping && getY() < groundY) {
            setLocation(getX(), getY() + jumpSpeed);
        }
    }
}
