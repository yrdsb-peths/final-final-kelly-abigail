import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends WorldObject
{
    GreenfootImage img = new GreenfootImage("images/bee.png");
    private int speed = 1;
    public Enemy(){
        setImage(img);
        img.scale(20,20);
        
    }
    public void act()
    {
        enemyMove(400);
    }
    public void enemyMove(int max){
        if(this.getX() == max){
            speed = -speed;
        }
        if(this.isAtEdge()){
            speed = -speed;
        }
        move(speed);
    }
}
