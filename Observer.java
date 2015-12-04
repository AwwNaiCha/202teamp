import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Observer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// this observer is used to observe player state
public interface Observer
{
    /**
     * Act - do whatever the Observer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void update();
    
    public void act(); 
   
}
