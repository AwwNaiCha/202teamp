import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class HealthPointObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPointObserver extends Observer
{
    int width = 400;
    int height = 100;
    
    public HealthPointObserver(Player player) {
        this.player = player;
        this.player.attach(this);
        
        //set heathpoint image
        GreenfootImage newImage = new GreenfootImage (this.width, this.height);
        setImage(newImage);
        update();
    }
    
    @Override
    public void update() {
        GreenfootImage newImage = getImage();
        newImage.clear();
        
        Font fontObj = new Font("Comic Sans MS", Font.BOLD, 32);
        newImage.setFont(fontObj);
        
        newImage.setColor(Color.blue);
        //newImage.fill();
        //newImage.scale(newImage.getWidth()+20, newImage.getHeight());
        //newImage.setColor(Color.black);
        
        newImage.drawString("fish X " + player.getHPState(), 30, 30);
        setImage(newImage);
    }
    
    /**
     * Act - do whatever the HealthPointObserver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
