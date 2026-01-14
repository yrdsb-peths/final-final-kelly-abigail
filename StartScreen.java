import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Where the player starts to play the game and see the 
 * instructions. 
 * 
 * @author (Abigail & Kelly) 
 * @version (01/13/2025)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartGame.
     * 
     */
    public StartScreen() {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 
        
        GreenfootSound bgMusic = new GreenfootSound("bg.mp3");
        
        // set background start screen
        GreenfootImage bg = new GreenfootImage("StartScreenImage.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        bgMusic.setVolume(80);
        bgMusic.playLoop();
                
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act() {
        // press "space" key to start the game
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
        
        // press "i" key to open the instruction screen
        if (Greenfoot.isKeyDown("i")) {
            Greenfoot.setWorld(new InstructionScreen());
        }
    }
}
