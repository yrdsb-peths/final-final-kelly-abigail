import greenfoot.*;

public class MyWorld extends World 
{
    private int wordWidth = this.getWidth();
    private int worldHeight = this.getHeight();
    HealthTracker health;
    
    Winnie winnie;
    
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
        winnie = new Winnie();
        addObject(winnie, 40, 220);
    }
    
    public void addGroundTiles(){
        int tileSize = 40;
        int numberOfTiles = 10000;
        
        for (int i  = 0; i < 10; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, tileSize/2 + (tileSize * i), worldHeight - tileSize/2);
        }
        
        for (int i  = 0; i < 20; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, tileSize * 10 + 100 + (tileSize * i), worldHeight - tileSize/2);
        }
        
        for (int i  = 0; i < 20; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, tileSize * 30 + 200 + (tileSize * i), worldHeight - tileSize/2);
        }
        
        for (int i  = 0; i < 30; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, tileSize * 50 + 350 + (tileSize * i), worldHeight - tileSize/2);
        }
        
        for (int i  = 0; i < 30; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, tileSize * 100 + 350 + (tileSize * i), worldHeight - tileSize/2);
        }
        
        for (int i  = 0; i < 30; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, tileSize * 90 + 200 + (tileSize * i), worldHeight - tileSize/2);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 100 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 800 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 2000 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 2500 + (tileSize * i), worldHeight - 130);
        }
    }
    
    public void addEnemy(){
        Enemy enemyOne = new Enemy(300, 250, 350);
        addObject(enemyOne, 300, worldHeight - 60);
        
        Enemy enemyTwo = new Enemy(500, 250, 350);
        addObject(enemyOne, 300, worldHeight - 60);
    }
    
    public void addHealthTracker(){
        health = new HealthTracker(winnie);
        addObject(health, 600 - 30, 30);
    }
    
    public void loseHp(){
        health.decreaseHp();
    } 
}
