import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TerminateGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    public GreenfootSound died = new GreenfootSound("died.mp3");

    Label gameOver = new Label ("Game Over", 100);
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 

        GreenfootImage bg = new GreenfootImage("GameOverScreen.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        died.setVolume(100);
        died.play();

    }

    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
