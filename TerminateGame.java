import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TerminateGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TerminateGame extends World
{
    
    /**
     * Constructor for objects of class TerminateGame.
     * 
     */
    
    Label gameOver = new Label ("Game Over", 100);
    public TerminateGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(gameOver, getWidth()/2, getHeight()/2);
        
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
