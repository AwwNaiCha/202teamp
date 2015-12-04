import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class GameWinMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWinMenu extends ScrollActor
{
    public GameWinMenu() {
    
        GreenfootImage newImage = new GreenfootImage (800, 600);
        Font fontObj = new Font("Comic Sans MS", Font.BOLD, 82);
        newImage.setFont(fontObj);
        Color customColor = new Color(238, 201,	0);
        newImage.setColor(customColor);
        newImage.scale(newImage.getWidth(), newImage.getHeight());
        newImage.drawString("YOU WIN!", 200, 320);
        setImage(newImage);
    }
        /*
    /**
     * Act - do whatever the GameWinMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
