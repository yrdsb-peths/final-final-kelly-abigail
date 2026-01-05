import greenfoot.*;

public class MyWorld extends World 
{
    private int wordWidth = this.getWidth();
    private int worldHeight = this.getHeight();
    HealthTracker health;
    
    Winnie winnie;
    Points score;
    
    public MyWorld(){
        super(600, 300, 1, false);
        addWinnie();
        addGroundTiles();
        addEnemy();
        addObject(new Timer(), 60, 30);
        addHealthTracker();
        addScore();
    }
    
    public void addWinnie(){
        // adds the winnie to the screen
        winnie = new Winnie();
        addObject(winnie, 40, 220);
    }
    
    public void addGroundTiles(){
        int tileSize = 40;
        int numberOfTiles = 10000;
        
        for (int i  = 0; i < numberOfTiles; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, tileSize/2 + (tileSize * i), worldHeight - tileSize/2);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 100 + (tileSize * i), worldHeight - 130);
        }
    }
    
    public void addEnemy(){
        Enemy enemyOne = new Enemy(300, 250, 350);
        addObject(enemyOne, 300, worldHeight - 60);
    }
    
    public void addHealthTracker(){
        health = new HealthTracker(winnie);
        addObject(health, 600 - 30, 30);
    }
    
    public void loseHp(){
        health.decreaseHp();
    } 
    
    public void addScore() {
        score = new Points();
        addObject(score, 50, 55);
    }
    
    public void addPoints(int amount) {
        score.addPoints(amount);
    }
}
