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
        Enemy enemyOne = new Enemy(250, 100, 350);
        addObject(enemyOne, 250, worldHeight - 50);
        
        Enemy enemyTwo = new Enemy(600, 500, 700);
        addObject(enemyTwo, 600, worldHeight - 50);
        
        Enemy enemyThree = new Enemy(850, 600, 900);
        addObject(enemyThree, 850, worldHeight - 200);
        
        Enemy enemyFour = new Enemy(800, 600, 900);
        addObject(enemyFour, 800, worldHeight - 50);
        
        Enemy enemyFive = new Enemy(1200,1000, 1500);
        addObject(enemyFive, 1000, worldHeight - 50);
    }
    
    public void addHealthTracker(){
        health = new HealthTracker(winnie);
        addObject(health, 600 - 50, 30);
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
