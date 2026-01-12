import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TerminateGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class TerminateGame.
     * 
     */

    Label gameOver = new Label ("Game Over", 100);
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 

        addObject(gameOver, getWidth()/2, getHeight()/2);

        prepare();
    }

    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press << space >> to try again", 25);
        addObject(label,291,255);
        label.setLocation(304,257);
        label.setLocation(253,255);
        label.setLocation(230,264);
        label.setLocation(369,261);
        label.setLocation(313,260);
        label.setLocation(304,257);
        label.setLocation(338,217);
        label.setLocation(324,201);
        label.setLocation(308,200);
    }
}
