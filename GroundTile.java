import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundTile extends Tile
{
    int tileSize = 40;
    int screenEdge = 600;
    boolean spawnedNext = false;
    
    GreenfootImage groundTile = new GreenfootImage("images/groudTile.jpg");
    
    public GroundTile(){
        groundTile.scale(tileSize, tileSize);
        setImage(groundTile);
        
    }
    public void act()
    {
        // add to act
    }
}
