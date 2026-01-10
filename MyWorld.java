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
        addObject(enemyFive, 1200, worldHeight - 50);
        
        Enemy enemySix = new Enemy(1700, 1300, 2000);
        addObject(enemySix, 1700, worldHeight - 50);
        
        Enemy enemySeven = new Enemy(1800, 1700, 2000);
        addObject(enemySeven, 1800, worldHeight - 50);
        
        Enemy enemyEight = new Enemy(1850, 1700, 2000);
        addObject(enemyEight, 2000, worldHeight - 50);
        
        Enemy enemyNine = new Enemy (1870, 1800, 2000);
        addObject(enemyNine, 1870, worldHeight - 50);
        
        Enemy enemyTen = new Enemy(1940, 1930, 2000);
        addObject(enemyTen, 1940, worldHeight - 200);
        
        Enemy enemyEleven = new Enemy(2700, 2400, 2900);
        addObject(enemyEleven, 2500, worldHeight - 50);
        
        Enemy enemyTwelve = new Enemy(2800, 2500, 3000);
        addObject(enemyTwelve, 2800, worldHeight - 50);
        
        Enemy enemyThirteen = new Enemy(2850, 2500, 3000);
        addObject(enemyThirteen, 2850, worldHeight - 50);
        
        Enemy enemyFourteen = new Enemy(2950,2900 , 3000);
        addObject(enemyFourteen, 2950, worldHeight - 50);
        
        Enemy enemyFifteen = new Enemy(2890,2800 , 3500);
        addObject(enemyFifteen, 2890, worldHeight - 200);
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
