import greenfoot.*;

public class MyWorld extends World 
{
    public MyWorld() 
    {
        super(600, 400, 1);
        
        // adds the winnie to the screen
        Winnie winnie = new Winnie();
        addObject(winnie, 200, 300);
        
    }
    
}
