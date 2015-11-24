/**
 * Write a description of class ShapeDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ShapeDecorator extends ScrollActor implements Shape 
{
    protected Shape decoratedShape;
    protected int limit1;
    protected int limit2;
    public ShapeDecorator(Shape decoratedShape, int l1, int l2)
    {
        this.decoratedShape = decoratedShape; 
        this.limit1 = l1;
        this.limit2 = l2;
    }
    public void act()
    {
        decoratedShape.act(); 
    }
}
