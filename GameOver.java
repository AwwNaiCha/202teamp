import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends ScrollActor
{
    public GameOver() {
        
        GreenfootImage newImage = new GreenfootImage (800, 600);
        Font fontObj = new Font("Comic Sans MS", Font.BOLD, 82);
        newImage.setFont(fontObj);
        //newImage.setColor(Color.yellow);
        Color customColor = new Color(238, 201,	0);
        newImage.setColor(customColor);
        newImage.scale(newImage.getWidth(), newImage.getHeight());
        newImage.drawString("GAME OVER", 200, 320);
        setImage(newImage);
        /*
        //set gameover image
        GreenfootImage newImage = new GreenfootImage (this.width, this.height);
        setImage(newImage);
        
        GreenfootImage newImage = getImage();
        newImage.clear();
        //GreenfootImage image =  new GreenfootImage("bid.png");

//        newImage = new GreenfootImage("small.png");
        Font fontObj = new Font("Comic Sans MS", Font.BOLD, 56);
        newImage.setFont(fontObj);
//
        newImage.setColor(Color.white);
//        newImage.fill();
//        newImage.scale(newImage.getWidth()+20, newImage.getHeight());
//        newImage.setColor(Color.black);
        //newImage.drawImage(image,10,25);


        newImage.drawString( "Game Over!",60, 50);
        setImage(newImage);
        */
    }
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

