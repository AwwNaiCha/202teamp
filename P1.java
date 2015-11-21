import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P1 extends Player {
    /**
     * Act - do whatever the P1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        Action("jump/fall", " ", "up", " ", 10, 0);
        Action("moveL", " ", "left", "shift", 10, 5);
        Action("moveR", " ", "right", "shift", 10, 5);
        
        /*
        int hpState = getHPState();
        System.out.println("this is hpscore");
        System.out.println(hpState);
        setHPState(--hpState);
        */
        if (Player.isTouchingThorn(ThornT.class, Player.Direction.LEFT)
                || Player.isTouchingThorn(ThornD.class, Player.Direction.DOWN)
                ||Player.isTouchingThorn(ThornL.class, Player.Direction.LEFT)

                || Player.isTouchingThorn(ThornR.class, Player.Direction.RIGHT)
   {
            int hpState = getHPState();
            setHPState(--hpState);
        }
    }
}
