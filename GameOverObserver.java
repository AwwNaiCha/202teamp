import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
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
    
    @Override
    public void update(){
        if(player.getHPState() == 0) {
            System.out.println("Hpstate = -1");
         displayGameOver();
        }
    }
    public void act() 
    {
        // Add your action code here.
    }    
    
    
     //hjw display game over
    private void displayGameOver() {
        
           GameOver gameOver = new GameOver();
           System.out.println(player.getGlobalX());
           System.out.println(player.getXFromCamera());
           //getWorld().addObject(gameOver,getWorld().getWidth()/2,getWorld().getHeight()/2);
           GreenfootImage deadImage = new GreenfootImage("dead2.png");
           player.setImage(deadImage);
           player.getWorld().addObject(gameOver, player.getGlobalX() - player.getXFromCamera(), player.getWorld().getHeight()/2);                             
           
           Greenfoot.stop();
       
    }
}
