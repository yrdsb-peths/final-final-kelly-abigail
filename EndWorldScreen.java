import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndWorldScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndWorldScreen extends World
{

    /**
     * Constructor for objects of class EndWorldScreen.
     * 
     */
    public EndWorldScreen()
    {    
        // Create a new world with 600x300 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 
        GreenfootImage bg = new GreenfootImage ("EndWorldScreen.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
}
