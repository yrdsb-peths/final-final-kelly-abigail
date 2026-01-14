import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ends the game and allows the player to press again if
 * "space" key is pressed.
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/2026)
 */
public class GameOver extends World {

    /**
     * Constructor for objects of class TerminateGame.
     * 
     */
    Label gameOver = new Label ("Game Over", 100);
    
    public GameOver() {    
        // Create a new world with 600x300 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 

        // Add game over screen image
        GreenfootImage bg = new GreenfootImage("GameOverScreen.png");
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
