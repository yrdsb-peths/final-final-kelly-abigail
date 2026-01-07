import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor
{
    
    private int points = 0;
    
    /**
     * Act - do whatever the Points wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Points() {
        updateImage();
    }
    
    public void addPoints(int amount) {
        points += amount;
        updateImage();
    }
    
    private void updateImage() {
        setImage(new GreenfootImage("Score: " + points, 24, Color.BLACK, Color.WHITE));
    }
}
