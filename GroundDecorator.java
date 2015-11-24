import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundDecorator extends Ground implements Shape 
{
    protected Shape decoratedShape;
    protected int limit1;
    protected int limit2;
    public GroundDecorator(Shape decoratedShape, int l1, int l2)
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
