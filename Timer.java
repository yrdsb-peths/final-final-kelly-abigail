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
    
    int time = 500;
    int frameCount = 0;
    
    public Timer() {
        updateImage();
    }
    
    public void act() {
       frameCount++;
       if (frameCount == 60 && time > 0) {
           time--;
           frameCount = 0;
           updateImage();
       }
    }
    
    private void updateImage() {
        setImage(new GreenfootImage("" + time, 30, Color.BLACK, Color.WHITE));
    }
}
