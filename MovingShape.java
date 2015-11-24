/**
 * Write a description of class MovingShape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingShape extends ShapeDecorator 
{
    // instance variables - replace the example below with your own
    private int direction = 3; 

    /**
     * Constructor for objects of class MovingShape
     */
    public MovingShape(Shape decoratedShape, int l1, int l2)
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
        if ((direction < 0 && getGlobalY() == limit1) || (direction > 0 && getGlobalY() == limit2)) 
        {direction = -direction;} 
        setLocation(getX(), getY() + direction);
    }
}
