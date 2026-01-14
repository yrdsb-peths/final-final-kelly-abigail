import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartGame here.
 * 
 * @author (Abigail Yang and Kelly) 
 * @version (Jan 13 2026)
 */
public class StartScreen extends World
{
    
    GreenfootSound bgMusic = new GreenfootSound("bg.mp3");
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 
    
        
        // set background start screen
        GreenfootImage bg = new GreenfootImage("StartScreenImage.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
    
                
    }
    /**
     * Prepare the world for the start of the program and the backround music.
     * That is: create the initial objects and add them to the world.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
            
            bgMusic.setVolume(80);
            bgMusic.playLoop();
        }
        
        if (Greenfoot.isKeyDown("i")) {
            Greenfoot.setWorld(new InstructionScreen());
        }
    }
}
