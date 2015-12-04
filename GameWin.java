import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class GameWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWin extends ScrollActor
{
    /**
     * Act - do whatever the GameWin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("firework.gif");
    public void act() 
    {
        setImage(gifImage.getCurrentImage());// Add your action code here.
    }    
}
