import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThornD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThornD extends ScrollActor
{
    /**
     * Act - do whatever the ThornD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction = 3;  
    
    public void act() 
    { 
       
    }
 
    public void move() 
    { 
        // checking edges  
        if ((direction < 0 && getGlobalY() == 325) || (direction > 0 && getGlobalY() == 425)) 
        {direction = -direction;} 
        move(direction);
    }
    
    
}
