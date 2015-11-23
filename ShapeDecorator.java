/**
 * Write a description of class ShapeDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ShapeDecorator implements Shape 
{
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape; 
    }
    public void act()
    {
        decoratedShape.act(); 
    }
}
