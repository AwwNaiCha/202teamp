import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerImageObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerImageObserver extends Observer
{
    
    public PlayerImageObserver(Player player) {
        this.player = player;
        this.player.attach(this);
        update();
    }
    
    @Override
    public void update() {
        if(player.ifup && player.ifleft) {
           GreenfootImage jumpleft = new GreenfootImage("jump-left.png");
           player.setImage(jumpleft);
        }
        else if (player.ifup && player.ifright) {
          GreenfootImage jumpright = new GreenfootImage("jump-right.png");
           player.setImage(jumpright);
        }
        else if (player.ifleft) {
           GreenfootImage standleft = new GreenfootImage("stand-left.png");
           player.setImage(standleft);
        }
        
        else if (player.ifright) {
           GreenfootImage standright = new GreenfootImage("stand-right-34x23.png");
           player.setImage(standright);
        }
    }
    /**
     * Act - do whatever the PlayerImageObserver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {     
        // Add your action code here.
    }    
}
