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
    
    public HealthTracker(){
        for(int i = 3; i >= 0; i--){
            healthbars[i] = new GreenfootImage("images/healthbars/hp" + i + ".png");
            healthbars[i].scale(40,40);
        }
        setImage(healthbars[hp]);
    }
    
    public void decreaseHp(){
        if(hp >= 0){
            hp --;
            setImage(healthbars[hp]);
        }else if(hp < 0){
            //lose game
        }
    }
}
