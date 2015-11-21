import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends ScrollActor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction = 5;  
    public void act() 
    { 
        move(); 
    }
 
    public void move() 
    { 
        // checking edges  
        if ((direction < 0 && getGlobalX() == 1325) || (direction > 0 && getGlobalX() == 1675)) 
        {direction = -direction;} 
        move(direction);
    }
}
