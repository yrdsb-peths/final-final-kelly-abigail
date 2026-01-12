import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthTracker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthTracker extends Actor
{
    GreenfootImage[] healthbars = new GreenfootImage[4];
    public int hp = 3;
    
    Winnie winnie;
    
    
    public HealthTracker(Winnie w) {
        winnie = w;
        for(int i = 3; i >= 0; i--){
            healthbars[i] = new GreenfootImage("images/healthbars/hp" + i + ".png");
            healthbars[i].scale(70, 60);
        }
        setImage(healthbars[hp]);
    }
    
    public void decreaseHp(){
        if(hp > 1) {
            hp --;
            setImage(healthbars[hp]);
        } else if(hp == 1) {
            hp--;
            setImage(healthbars[0]);
            winnie.stopMoving();
            Greenfoot.setWorld(new GameOver());
        }
    }
}
