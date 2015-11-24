import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingGround extends GroundDecorator
{
    /**
     * Act - do whatever the MovingGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction = 3; 

    /**
     * Constructor for objects of class MovingShape
     */
    public MovingGround(Shape decoratedShape, int l1, int l2)
    {
        super(decoratedShape, l1, l2);
    }

    public void act() 
    { 
        decoratedShape.act();
        move(decoratedShape, limit1, limit2); 
    }
    public void move(Shape decoratedShape, int limit1, int limit2)
    {
        if ((direction < 0 && getGlobalX() == limit1) || (direction > 0 && getGlobalX() == limit2)) 
        {direction = -direction;} 
        setLocation(getX() + direction, getY());
    }    
}
