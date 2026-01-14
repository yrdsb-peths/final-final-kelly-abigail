import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ends the world and tells the player their total score.
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/25)
 */
public class EndWorldScreen extends World {

    /**
     * Constructor for objects of class EndWorldScreen.
     * 
     */
    public EndWorldScreen(int finalScore) {    
        // Create a new world with 600x300 cells with a cell size of 1x1 pixels.
        super(600, 300, 1);
        
        
        // set background image
        GreenfootImage bg = new GreenfootImage ("EndWorldScreen.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        // add labels
        Label scoreLabel = new Label("Your score is " + finalScore + "/150, congrats!", 30);
        addObject(scoreLabel, 300, 180);
    }
    
    /** 
     * Brings player to MyWorld.
     */
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    
}
