import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Updates the health image and ends the game when the 
 * players health is at 0
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/25)
 */
public class HealthTracker extends Actor
{
    // array that holds the three health bar images.
    GreenfootImage[] healthbars = new GreenfootImage[4];
    
    // player's start health points
    public int hp = 3;
    
    // reference to winnie
    Winnie winnie;
    
    /**
     * Constructor for HealthTracker.
     */
    public HealthTracker(Winnie w) {
        
        winnie = w;
        
        // change the images to show number of lives player has
        for(int i = 3; i >= 0; i--) {
            healthbars[i] = new GreenfootImage("images/healthbars/hp" + i + ".png");
            healthbars[i].scale(70, 60);
        }
        
        // add image to screen
        setImage(healthbars[hp]);
    }
    
    /**
     * Decreases the player's health by 1
     * Ends game when the health reaches to zero
     */
    public void decreaseHp() {
        if(hp > 1) {
            hp --;
            setImage(healthbars[hp]);
        } else if(hp == 1) {
            hp--;
            setImage(healthbars[0]);
            
            // stops player from playing
            winnie.stopMoving();
            
            // brings player to game over screen
            Greenfoot.setWorld(new GameOver());
        }
    }
}
