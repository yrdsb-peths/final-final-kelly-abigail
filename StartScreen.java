import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartGame.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 
        
        // set background start screen
        GreenfootImage bg = new GreenfootImage("StartScreenImage.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        prepare();
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
        
        if (Greenfoot.isKeyDown("i")) {
            Greenfoot.setWorld(new InstructionScreen());
        }
    }
}
