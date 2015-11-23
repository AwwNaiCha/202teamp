import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverObserver extends Observer
{
    /**
     * Act - do whatever the GameOverObserver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public GameOverObserver(Player player){
        this.player = player;
        this.player.attach(this);
        update();
    }
    public void update(){
        
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
