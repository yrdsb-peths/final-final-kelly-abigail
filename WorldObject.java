import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldObject extends Actor
{
    /**
     * moves the objects in the world depending on the movement of mario
     */
    public void move(int x)
    {
         setLocation(getX() - x, getY());
    }
}
