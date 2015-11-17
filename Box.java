import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Box extends Player
{
    public int H = getImage().getHeight();
    public int halfH = H/2;
    public int W = getImage().getWidth();
    public int halfW = W/2;

    public void act() 
    {
        Action("jump/fall", "Box", "", "", 10, 0);
        Physics();
    }
    
    public boolean point1(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0-halfW, 0-halfH, clss);
        return actor != null;
    }
    
    public boolean point2(Class clss)
    {
        Actor actor = getOneObjectAtOffset(W/2, 0-halfH, clss);
        return actor != null;
    }
    
    public boolean point3(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0-halfW, H/2, clss);
        return actor != null;
    }
    
    public boolean point4(Class clss)
    {
        Actor actor = getOneObjectAtOffset(W/2, H/2, clss);
        return actor != null;
    }
    
    public void Physics()
    {
        if((point1(Ground.class) && point2(Ground.class)) || (point1(Ground.class) && point3(Ground.class)) || (point1(Ground.class) && point4(Ground.class)) || (point2(Ground.class) && point3(Ground.class)) || (point2(Ground.class) && point4(Ground.class)) || (point3(Ground.class) && point4(Ground.class)) || (point1(Wall.class) && point2(Wall.class)) || (point1(Wall.class) && point3(Wall.class)) || (point1(Wall.class) && point4(Wall.class)) || (point2(Wall.class) && point3(Wall.class)) || (point2(Wall.class) && point4(Wall.class)) || (point3(Wall.class) && point4(Wall.class))){
        }else if(point1(Ground.class)|| point1(Wall.class) || point3(Ground.class)|| point3(Wall.class)){
            turn(1);
        }else if(point2(Ground.class)|| point2(Wall.class) || point4(Ground.class)|| point4(Wall.class)){
            turn(-1);
        }
    }
}
