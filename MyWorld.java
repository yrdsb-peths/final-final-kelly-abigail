import greenfoot.*;

public class MyWorld extends World 
{
    private int wordWidth = this.getWidth();
    private int worldHeight = this.getHeight();
    HealthTracker health;
    
    
    public MyWorld(){
        super(600, 300, 1, false);
        addWinnie();
        addGroundTiles();
        addEnemy();
        addObject(new Timer(), 30, 30);
        addHealthTracker();
    }
    
    public void addWinnie(){
        // adds the winnie to the screen
        Winnie winnie = new Winnie();
        addObject(winnie, 40, 220);
    }
    
    public void addGroundTiles(){
        int tileSize = 40;
        int numberOfTiles = 50;
        
        for (int i  = 0; i < numberOfTiles; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, tileSize/2 + (tileSize * i), worldHeight - tileSize/2);
        }
    }
    
    public void addEnemy(){
        Enemy enemyOne = new Enemy(300, 250, 350);
        addObject(enemyOne, 300, worldHeight - 60);
    }
    
    public void addHealthTracker(){
        health = new HealthTracker();
        addObject(health, 600 - 30, 30);
    }
    
    public void loseHp(){
        health.decreaseHp();
    } 
}
