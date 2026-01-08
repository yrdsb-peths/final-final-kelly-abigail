import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends WorldObject
{
    GreenfootImage img = new GreenfootImage("images/bee.png");
    private int worldX;
    private int leftLimit;
    private int rightLimit;
    private int speed = 1;
    private int verticalSpeed = 0;
    private boolean isDead = false;
    
    public Enemy(int startX, int left, int right){
        setImage(img);
        img.scale(20,20);
        worldX = startX;
        leftLimit = left;
        rightLimit = right;
    }
    
    public void act() {
        enemyMove();
        if(getWorld() != null){
            enemyGravity();
        }
    }
    
    public void enemyMove() {
        
        if(getX() <= 700){
            worldX += speed;
            move(speed);
            if(worldX <= leftLimit || worldX >= rightLimit){
                speed *= -1;
            }
        
            updateScreenPosition();
        }
    }
    
    public void enemyGravity(){
        
        GroundTile tile =  (GroundTile)getOneIntersectingObject(GroundTile.class);
        
        
        if(tile == null){
            verticalSpeed = 5;
            setLocation(getX(), getY() + verticalSpeed);
        }else if(tile != null ){
            int tileTop = tile.getY() - tile.getImage().getHeight()/2;
            int playerHalf = getImage().getHeight()/2;
            
            verticalSpeed = 0;
        }
    }
    
    private void updateScreenPosition() {
        if(getX() < -50){

            die();
        }
    }
    
    public void die() {
        if (isDead) {
            return;
        }
        
        isDead = true;
        
        MyWorld world = (MyWorld) getWorld();
        world.removeObject(this);
    }
}
