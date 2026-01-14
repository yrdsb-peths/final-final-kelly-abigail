import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Image to show players how to play.
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/25)
 */
public class InstructionScreen extends World {

    /**
     * Constructor for objects of class InstructionScreen.
     * 
     */
    public InstructionScreen() {    
        // Create a new world with 600x300 cells with a cell size of 1x1 pixels.
        super(600, 300, 1);
        
        // add background image
        GreenfootImage bg = new GreenfootImage ("InstructionScreenImage.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
    
    /**
     * Bring player to new MyWorld
     */
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
