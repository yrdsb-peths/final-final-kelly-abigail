import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winnie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winnie extends Actor {
    /**
     * Act - do whatever the Winnie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 4;
    
    int groundY = 260;
    int jumpSpeed = 5;
    int maxJumpHeight = 100;
    boolean jumping = false;
    boolean canTakeDamage = true;
    int coolDownTimer = 0;
    int cameraX = 300;
    public Winnie() {
        GreenfootImage img = getImage();
        img.scale(20, 40);
    }
    public void act() {
        
        // key movement of winnie
        moveLeftRight();
        jump();
        gravity();
        collisionGround();
        collisionEnemy();
        damageCooldown();
    }
    private void moveLeftRight() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        else if (Greenfoot.isKeyDown("right")) {
            if(getX() < 300){
                setLocation(getX() + speed, getY());
            }else{
                scrollWord(-speed);
            }
        }
    }
    private void jump() {
        if (Greenfoot.isKeyDown("up") && !jumping) {
            jumping = true;
        }
        
        if (jumping) {
            if (getY() > groundY - maxJumpHeight) {
                jumpSpeed = -5;
                setLocation(getX(), getY() + jumpSpeed);
            } else {
                jumping = false;
            }
        }
    }
    private void gravity() {
        if (!jumping && getY() < groundY) {
            jumpSpeed = 5;
            setLocation(getX(), getY() + jumpSpeed);
        }
    }
    private void collisionGround(){
        GroundTile tile = (GroundTile)getOneIntersectingObject(GroundTile.class);
        //only Land if falling or standing
        if(tile != null && jumpSpeed >=0){
            
            int tileTopLocation = tile.getY() - tile.getImage().getHeight();
            int halfPlayer =  this.getImage().getHeight()/3;
            
            setLocation(getX(), tileTopLocation);
            
            //updates real ground level
            groundY = getY();
            jumping = false;
        }
    }
    private void collisionEnemy(){
        Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        MyWorld w = (MyWorld) getWorld();
        if(enemy != null){
            int enemyTop = enemy.getY() - enemy.getImage().getHeight() / 2;
            int playerBottom = getY() + getImage().getHeight() / 2;
            if(playerBottom <= enemyTop + 5 && jumpSpeed > 0){
                getWorld().removeObject(enemy);
                jumpSpeed = -8;
                jumping = true;
            }else if(canTakeDamage){
                w.loseHp();
                canTakeDamage = false;
                coolDownTimer = 30;
            }
        }
        }
    private void damageCooldown(){
        if(!canTakeDamage){
            coolDownTimer--;
            if(coolDownTimer <=0){
                canTakeDamage = true;
            }
        }
    }
    private void scrollWorld(){
        for(Wor)
    }
    }
