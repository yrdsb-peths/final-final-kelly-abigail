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
        addBackround();
    }
    
    public void addWinnie(){
        // adds the winnie to the screen
        winnie = new Winnie();
        addObject(winnie, 20, 220);
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
        
        Enemy enemyEleven = new Enemy(1950, 1930, 2000);
        addObject(enemyEleven, 1950, worldHeight - 50);
        
        Enemy enemyTwelve = new Enemy(2890, 2200, 3650);
        addObject(enemyTwelve, 2890, worldHeight - 50);
        
        Enemy enemyThirteen = new Enemy(3100, 300, 3650);
        addObject(enemyThirteen, 3100, worldHeight - 50);
        
        Enemy enemyFourteen = new Enemy(3200,3190 , 3650);
        addObject(enemyFourteen, 3200, worldHeight - 50);
        
        Enemy enemyFifteen = new Enemy(2930, 2890 , 3500);
        addObject(enemyFifteen, 2900, worldHeight - 200);
        
        Enemy enemySixteen = new Enemy(3300,3000 , 3650);
        addObject(enemySixteen, 3300, worldHeight - 50);
        
        Enemy enemySeventeen = new Enemy(3400,3200 , 3650);
        addObject(enemySeventeen, 3400, worldHeight - 50);
        
        Enemy enemyNineteen = new Enemy(3500,3100 , 3650);
        addObject(enemyNineteen, 3500, worldHeight - 50);
        
        Enemy enemyTwenty = new Enemy(3600,3500 , 3650);
        addObject(enemyTwenty, 3600, worldHeight - 50);
        
        Enemy enemyTwentyOne = new Enemy(4500 ,4300 , 4600);
        addObject(enemyTwentyOne, 4500, worldHeight - 50);
        
        Enemy enemyTwentyTwo = new Enemy(3900 ,3800 , 4400);
        addObject(enemyTwentyTwo, 3900, worldHeight - 50);
        
        Enemy enemyTwentyThree = new Enemy( 4100,4000 , 5000);
        addObject(enemyTwentyThree, 4100, worldHeight - 50);
        
        Enemy enemyTwentyFour = new Enemy(4800,4100 , 5000);
        addObject(enemyTwentyFour, 4800, worldHeight - 50);
        
        Enemy enemyTwentyFive = new Enemy( 5000,3600 , 5600);
        addObject(enemyTwentyFive, 5000, worldHeight - 50);
        
        Enemy enemyTwentySix = new Enemy(5200,5000 ,5600);
        addObject(enemyTwentySix, 5200, worldHeight - 50);
        
        Enemy enemyTwentyEight = new Enemy(5100,4900 ,5200);
        addObject(enemyTwentyEight, 5100, worldHeight - 50);
        
        Enemy enemyTwentyNine = new Enemy(5300,5200 ,5600);
        addObject(enemyTwentyNine, 5300, worldHeight - 50);
        
        Enemy enemyThirty = new Enemy(5676,5500 ,5700);
        addObject(enemyTwentyNine, 5670, worldHeight - 50);
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
    
    private void addBackround(){
        GreenfootImage bg = new GreenfootImage("bg.png");
        bg.scale(600, 300);
        setBackground(bg);
    }
}
