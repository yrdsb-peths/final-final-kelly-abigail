import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Moving obstacle that causes the player to lose a life
 * 
 * @author (Abigail and Kelly) 
 * @version (01/13/26)
 */
public class Enemy extends WorldObject
{
    // image for enemy
    GreenfootImage img = new GreenfootImage("images/bee.png");
    
    // horizontal position for the world
    private int worldX;
    
    // limits of horizontal movement
    private int leftLimit;
    private int rightLimit;
    
    // horizontal movement speed
    private int speed = 1;
    private int verticalSpeed = 0;
    
    // track if enemy is dead
    private boolean isDead = false;
    
    /**
     * Constructor for Enemy.
     * 
     * @param startX starting x position in the world
     * @param left left boundary of movement
     * @param right right boundary of movement
     */
    
    public Enemy(int startX, int left, int right){
        setImage(img);
        img.scale(20,20);
        worldX = startX;
        leftLimit = left;
        rightLimit = right;
    }
    
    /**
     * Called every frame and handles movement and gravity.
     */
    public void act() {
        // horizontal movement
        enemyMove();
        
        if(getWorld() != null){
            enemyGravity();
        }
    }
    
    /**
     * Moves the enemy between left and right limits
     */
    public void enemyMove() {
        // only move on screen
        if(getX() <= 700){
            worldX += speed;
            move(speed);
            // moves in reverse direction if the limit is reached
            if(worldX <= leftLimit || worldX >= rightLimit){
                speed *= -1;
                img.mirrorHorizontally();
            }
        
            // remove if offscreen
            updateScreenPosition();
        }
    }
    
    /**
     * Allows enemy to fall.
     */
    public void enemyGravity(){
        
        GroundTile tile =  (GroundTile)getOneIntersectingObject(GroundTile.class);
        
        
        if(tile == null) {
            // enemy is in the air
            verticalSpeed = 5;
            setLocation(getX(), getY() + verticalSpeed);
        } else if(tile != null ){
            // enemy is on the ground and it stops falling
            int tileTop = tile.getY() - tile.getImage().getHeight()/2;
            int playerHalf = getImage().getHeight()/2;
            
            verticalSpeed = 0;
        }
    }
    
    /**
     * Checks if the enemy is off the screen
     */
    private void updateScreenPosition() {
        // removes the enemy if its off the world 
        if(getX() < -50) {
            die();
        }
    }
    
    /**
     * Removes the enemy from the world and kills it/
     */
    public void die() {
        if (isDead) {
            return;
        }
        
        isDead = true;
        
        MyWorld world = (MyWorld) getWorld();
        world.removeObject(this);
    }
}
