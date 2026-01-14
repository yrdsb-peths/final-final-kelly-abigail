import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Keeps track of the players score.
 * Updated everytime player kills an enemy.
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/25)
 */
public class Points extends Actor
{
    // stores the players current score
    public int points = 0;
    
    /**
     * Constructor for Points.
     */
    public Points() {
        updateImage();
    }
    
    /**
     * Adds 10 points at a time.
     */
    public void addPoints(int amount) {
        points += amount;
        updateImage();
    }
    
    /**
     * Updates the score on the screen.
     */
    private void updateImage() {
        setImage(new GreenfootImage("Score: " + points, 24, Color.BLACK, Color.WHITE));
    }
    
    /**
     * Returns the current score value.
     */
    public int getPoints() {
        return points;
    }
}
