import greenfoot.*;

public class MyWorld extends World 
{
    private int wordWidth = this.getWidth();
    private int worldHeight = this.getHeight();
    public MyWorld(){
        super(600, 300, 1);
        addWinnie();
        addGroundTiles();
        addObject(new Timer(), 30, 30);
    }
    
    public void addWinnie(){
        // adds the winnie to the screen
        Winnie winnie = new Winnie();
        addObject(winnie, 40, 220);
    }
    
    public void addGroundTiles(){
        for(int i = 0; i < 30; i++){
            GroundTile one = new GroundTile();
            addObject(one, 20 + (20 * i), worldHeight - 20);
        }
    }
}
