import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWinObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWinObserver extends ScrollActor implements Observer
{
    /**
     * Act - do whatever the GameWinObserver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected Player player;
        public GameWinObserver(Player player){
        this.player = player;
        this.player.attach(this);
        update();
    }
    
    @Override
    public void update(){
        if(player.isWin) {
            displayGameWin();
        }
    }
    public void act() 
    {
        // Add your action code here.
    }    
    
         // display game win
    private void displayGameWin() {
   
           
           GameWin gw = new GameWin();
           player.getWorld().addObject(gw, player.getGlobalX() - player.getXFromCamera(), player.getWorld().getHeight()/6*2); 
           
           GameWinMenu gwMenu = new GameWinMenu();
           player.getWorld().addObject(gwMenu, player.getGlobalX() - player.getXFromCamera(), player.getWorld().getHeight()/5*3); 
           
           //Greenfoot.stop();
       
    }
}
