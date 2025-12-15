import greenfoot.*;

public class MyWorld extends World {
    public int worldWidth = this.getWidth();
    public int worldHeight = this.getHeight();
    public MyWorld() {
        super(600, 300, 1, false);
        addGroundTiles();
    }
    /**
     * Creates the groud tiles
     */
    public void addGroundTiles(){
        for(int i = 0; i < 30; i++){
            GroundTile one = new GroundTile();
            addObject(one, 20 + (20 * i), worldHeight - 20);
        }
    }
}
