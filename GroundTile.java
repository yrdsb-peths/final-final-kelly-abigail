import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Single block in the game where the characters stand on.
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/26)
 */
public class GroundTile extends Tile
{
    // size of each ground tile in pixels
    int tileSize = 40;
    
    // width of the screen
    int screenEdge = 600;
    
    // track if the tile appeared or not
    boolean spawnedNext = false;
    
    // image of ground tile
    GreenfootImage groundTile = new GreenfootImage("images/groudTile.jpg");
    
    /**
     * Constructor for GroundTile.
     */
    public GroundTile() {
        groundTile.scale(tileSize, tileSize);
        setImage(groundTile);
    }
}
