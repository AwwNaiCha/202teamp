import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.util.*;
import java.util.HashMap;

/**
 * Write a description of class P1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P1 extends Player  {
    /**
     * Act - do whatever the P1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private SoundEffect se; 
     
    private Map<String, ChainAction> actionMap;
    private int lastX = 0;
    private int lastY = 0;
    protected Queue<Point> lastMove = new LinkedList<Point>();
    public P1(){
        actionMap = new HashMap<>();
        //adding jump action
        ChainAction jump = new JumpAction();
        jump.setActionName("jump/fall");
        jump.setAnimationFrames(10);
        jump.setSpeed(0);
        actionMap.put("up", jump);

        ChainAction moveLeft = new MoveLeftAction();
        moveLeft.setActionName("moveL");
        moveLeft.setAnimationFrames(10);
        moveLeft.setSpeed(5);
        actionMap.put("left", moveLeft);

        ChainAction moveRight = new MoveRightAction();
        moveRight.setActionName("moveR");
        moveRight.setAnimationFrames(10);
        moveRight.setSpeed(5);
        actionMap.put("right", moveRight);

    }

    private void recordLastPosition(){
        if(!onWall())return;
        int lastX = getGlobalX();
        int lastY = getGlobalY();
        Point point = new Point(lastX, lastY);
        if(lastMove.size() >=50){
            lastMove.poll();
        }
     //System.out.println(lastX + " " + lastY);
        lastMove.add(point);
    }

    public void act() {
        for (String key: actionMap.keySet()){
           if(Greenfoot.isKeyDown(key)) {
                recordLastPosition();
            }
                ChainAction action = actionMap.get(key);
                System.out.println(key);
                action.actOn(key, this);


        }
        
        ////////Keyaction state notified to observer
       if(Greenfoot.isKeyDown("up")) {
            ifup = true;
        }
        else {
            ifup = false;
        }
        
        if(Greenfoot.isKeyDown("left")) {
            ifleft = true;
            ifright = false;
        }
        
        if(Greenfoot.isKeyDown("right")) {
           ifright = true;
           ifleft = false;
        }
       findKeyState ();
        
        
        
        
        ///////////
        int hpState = 0;

        if (isTouchingThorn(ThornT.class, Direction.LEFT) ||
        isTouchingThorn(ThornT.class, Direction.RIGHT) ||
        isTouchingThorn(ThornT.class, Direction.UP) ||
        isTouchingThorn(ThornT.class, Direction.DOWN)

                || isTouchingThorn(ThornD.class, Direction.UP)
                || isTouchingThorn(ThornD.class, Direction.DOWN)
                || isTouchingThorn(ThornD.class, Direction.LEFT)
                || isTouchingThorn(ThornD.class, Direction.RIGHT)
                || isTouchingThorn(ThornL.class, Direction.LEFT)
                 || isTouchingThorn(ThornL.class, Direction.RIGHT)
                  || isTouchingThorn(ThornL.class, Direction.UP)
                   || isTouchingThorn(ThornL.class, Direction.DOWN)
                || isTouchingThorn(ThornR.class, Direction.RIGHT)
                 || isTouchingThorn(ThornR.class, Direction.LEFT)
                  || isTouchingThorn(ThornR.class, Direction.DOWN)
                   || isTouchingThorn(ThornR.class, Direction.UP)
                ) {
                    
                        //
                    if(!lastMove.isEmpty()){
                        Point p = lastMove.peek();
                        lastX = (int)p.getX();
                        lastY = (int)p.getY();
                    }
                    
                    if(getHPState() > 1) {

                             setGlobalLocation(lastX, lastY);
                        //         addCameraFollower(getWorld().p1, 0, 0);
                            // getWorld().addObject(new FPS(), 85, 15);
                            getWorld().setCameraLocation(lastX, lastY);
                        }
                        //System.out.println("resetting to " + getX() + " " + getY());

                        hpState = getHPState();

                        setHPState(--hpState);
                   





                setHPState(--hpState);
                
                se = new KirraSE();
                se.play();



        } else
        {

            if (isTouching(Fish.class, Direction.DOWN)
                || isTouching(Fish.class, Direction.LEFT)
                || isTouching(Fish.class, Direction.RIGHT)
                || isTouching(Fish.class, Direction.UP)) {
            hpState = getHPState();
            setHPState(hpState + 1);
            se = new CoinSE();
            se.play();
        }
        }

    }
    

}
