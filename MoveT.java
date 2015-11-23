import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoveT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveT extends ScrollActor implements Shape
{
    /**
     * Act - do whatever the MoveT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction = 3; 
    
    public void act() 
    {
        move();// Add your action code here.
    }
    
    public void move() 
    { 
        // checking edges  
        if ((direction < 0 && getGlobalY() == 525) || (direction > 0 && getGlobalY() == 624)) 
        {direction = -direction;} 
        setLocation(getX(), getY() + direction);
    }
}
