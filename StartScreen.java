import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartGame.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Winnie The Pooh Game", 50);
        addObject(label,276,162);
        label.setLocation(330,154);
        label.setLocation(311,142);
        label.setLocation(301,132);
        Label label2 = new Label("press <<up>> key to jump", 40);
        addObject(label2,283,187);
        label2.setLocation(297,184);
        label2.setLocation(297,184);
        removeObject(label2);
        Label label3 = new Label("press <<left>> to move left", 20);
        addObject(label3,262,177);
        label3.setLocation(295,173);
        removeObject(label3);
        Label label4 = new Label("press << left >> to move left", 30);
        addObject(label4,271,175);
        label4.setLocation(304,180);
        label4.setLocation(338,184);
        label4.setLocation(292,178);
        label4.setLocation(294,178);
        Label label5 = new Label("press << up >> key to jump", 30);
        addObject(label5,260,217);
        label5.setLocation(292,209);
        Label label6 = new Label("press << right >> to move right", 30);
        addObject(label6,264,246);
        label6.setLocation(301,240);
    }
}
