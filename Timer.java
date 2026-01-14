import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Countes down from 100.
 * When the timer reaches 0, the game ends. 
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/26)
 */
public class Timer extends Actor
{
    // Start time
    int time = 100;
    
    // Counts frame to track one second
    int frameCount = 0;
    
    /**
     * Constructor for Timer.
     */
    public Timer() {
        updateImage();
    }
    
    /**
     * Decreases time once every second
     */
    public void act() {
        if (time > 0) {
           // reduces time every 60 frames
           frameCount++;
           if (frameCount == 60) {
               time--;
               frameCount = 0;
               updateImage();
           }
        } else {
            // updates the image to game over.
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    /**
     * updates the image to show the remaining amount of time.
     */
    private void updateImage() {
        setImage(new GreenfootImage("Timer: " + time, 24, Color.BLACK, Color.WHITE));
    }
}
