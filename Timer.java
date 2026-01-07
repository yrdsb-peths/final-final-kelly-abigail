import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int time = 100;
    int frameCount = 0;
    
    public Timer() {
        updateImage();
    }
    
    public void act() {
        if (time > 0) {
           frameCount++;
           if (frameCount == 60) {
               time--;
               frameCount = 0;
               updateImage();
           }
<<<<<<< HEAD
        } else if(time < 0) {
            showGameOver();
=======
        } else {
            Greenfoot.setWorld(new TerminateGame());
>>>>>>> 18b6232501787bf8c63f9b43522775a30af94e06
        }
    }
    
    private void updateImage() {
        setImage(new GreenfootImage("Timer: " + time, 24, Color.BLACK, Color.WHITE));
    }
}
