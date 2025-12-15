import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundTile extends Tile
{
    GreenfootImage groundTile = new GreenfootImage("images/groudTile.jpg");
    public GroundTile(){
        groundTile.scale(40, 40);
        setImage(groundTile);
        
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
