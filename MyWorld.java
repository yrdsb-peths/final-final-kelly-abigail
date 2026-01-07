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
            addObject (tile, 1600 +  (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 1900 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 2500 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 2800 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 3000 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 1; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 3640 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 4000 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 4400 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 4700 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 4900 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 4; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 5200 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 5400 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 5600 + (tileSize * i), worldHeight - 120);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 5750 + (tileSize * i), worldHeight - 120);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 5950 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 6150 + (tileSize * i), worldHeight - 140);
        }
        
        for (int i  = 0; i < 3; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 6350 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 6550 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 6750 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 6950 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 7150 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 7300 + (tileSize * i), worldHeight - 130);
        }
        
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 7500 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 7700 + (tileSize * i), worldHeight - 130);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 7900 + (tileSize * i), worldHeight - 150);
        }
        
        for (int i  = 0; i < 2; i++) {
            GroundTile tile = new GroundTile();
            addObject (tile, 8100 + (tileSize * i), worldHeight - 150);
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
        
        Enemy enemyFive = new Enemy(1200, 1000, 1500);
        addObject(enemyFive, 1000, worldHeight - 50);
        
        Enemy enemySix = new Enemy(1400, 1600, 1500);
        addObject(enemySix, 1200, worldHeight - 50);
        
        Enemy enemySeven = new Enemy(1600, 1900, 2000);
        addObject(enemySeven, 1500, worldHeight - 50);
        
        Enemy enemyEight = new Enemy(1800, 2000, 2100);
        addObject(enemyEight, 2000, worldHeight - 50);
        
        Enemy enemyNine = new Enemy (1900, 2000, 2300);
        addObject(enemyNine, 2200, worldHeight - 50);
        
        Enemy enemyTen = new Enemy(2000, 2300, 2400);
        addObject(enemyTen, 2300, worldHeight - 50);
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
