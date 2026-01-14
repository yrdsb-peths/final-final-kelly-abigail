import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Any object that needs to be made
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/26)
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
