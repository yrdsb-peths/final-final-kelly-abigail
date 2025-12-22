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
    private int worldX;
    private int leftLimit;
    private int rightLimit;
    private int speed = 1;
    public Enemy(int startX, int left, int right){
        setImage(img);
        img.scale(20,20);
        worldX = startX;
        leftLimit = left;
        rightLimit = right;
        
    }
    public void act()
    {
        enemyMove();
    }
    public void enemyMove(){
        worldX += speed;
        move(speed);
        if(worldX <= leftLimit || worldX >= rightLimit){
            speed *= -1;
        }
        
        updateScreenPosition();
    }
    private void updateScreenPosition(){
        if(getX() < -50){
            getWorld().removeObject(this);
        }
    }
}
