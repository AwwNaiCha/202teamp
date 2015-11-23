import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javafx.scene.input.Dragboard;

import java.lang.Class;
import java.lang.Integer;
import java.lang.Math;
import java.util.*;
import java.util.List;
import java.awt.Point;

/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends ScrollActor {

    public Player() {
        super();

    }

    public void initMap() {
        if (directionListMap != null) {
            return;
        }
        List<Integer> up = new ArrayList<>();
        up.add(0);
        up.add(halfWidth);
        List<Integer> down = new ArrayList<>();
        down.add(0);
        down.add(-halfWidth);
        List<Integer> left = new ArrayList<>();
        left.add(-quarterWidth);
        left.add(0);
        List<Integer> right = new ArrayList<>();
        right.add(quarterWidth);
        right.add(0);
        directionListMap = new HashMap<>();
        directionListMap.put(Direction.UP, up);
        directionListMap.put(Direction.DOWN, down);
        directionListMap.put(Direction.LEFT, left);
        directionListMap.put(Direction.RIGHT, right);
    }

    public void initThornMap() {
        if (thorndirectionMap != null) {
            return;
        }
        List<Integer> up = new ArrayList<>();
        up.add(0);
        up.add(halfWidth);
        List<Integer> down = new ArrayList<>();
        down.add(0);
        down.add(-halfWidth);
        List<Integer> left = new ArrayList<>();
        left.add(-quarterWidth);
        left.add(0);
        List<Integer> right = new ArrayList<>();
        right.add(quarterWidth);
        right.add(0);
        thorndirectionMap = new HashMap<>();
        thorndirectionMap.put(Direction.UP, up);
        thorndirectionMap.put(Direction.DOWN, down);
        thorndirectionMap.put(Direction.LEFT, left);
        thorndirectionMap.put(Direction.RIGHT, right);

    }

    /////////////// methods and attributes used for observer/////////////////////////////////
    private Map<Direction, List<Integer>> directionListMap;
    private Map<Direction, List<Integer>> thorndirectionMap;
    private List<Observer> observers = new ArrayList<Observer>();
    private int healthpoint_state = 5; // 

    public int getHPState() {
        return healthpoint_state;
    }

    public void setHPState(int hpState) {
        this.healthpoint_state = hpState;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }


    //////////////////////////////////////////////////////////////////////////////////////

    public int JPower = 15;
    public int VSpeed = 0;
    public int Drag = VSpeed - 2;
    public int keyPressed = 0;
    public int bounce = 0;
    public int eighthWidth = getImage().getWidth() / 8;
    public int quarterWidth = getImage().getWidth() / 4;
    public int halfWidth = getImage().getWidth() / 2;


    //set JPower
    public void JPower(int Power) {
        JPower = Power;
    }


    public boolean isTouching(Class c, Direction d) {

        initMap();

        List<Integer> direction = directionListMap.get(d);
        int dx = direction.get(0);
        int dy = direction.get(1);
        Actor actor = getOneObjectAtOffset(0 + dx, 0 + dy, c);
        return actor != null;

    }

    public Actor getTochingObject(Class c, Direction d) {
        initMap();

        List<Integer> direction = directionListMap.get(d);
        int dx = direction.get(0);
        int dy = direction.get(1);
        Actor actor = getOneObjectAtOffset(0 + dx, 0 + dy, c);
        if (actor != null) {
            return actor;
        }
        return null;
    }


    public boolean isTouchingThorn(Class c, Direction d) {

        initThornMap();
        List<Integer> direction = thorndirectionMap.get(d);
        int dx = direction.get(0);
        int dy = direction.get(1);
        Actor actor = getOneObjectAtOffset(0 + dx, 0 + dy, c);
        if (actor == null) return false;
        int height = actor.getImage().getHeight();
        int width = actor.getImage().getWidth();
        if (Math.abs(getY() - actor.getY()) + Math.abs(getX() - actor.getX()) > width) return false;
        if (d == Direction.RIGHT) return (getX() + quarterWidth) >= actor.getX() - width / 2;
        if (d == Direction.LEFT) return (getX() - quarterWidth) <= actor.getX() + width / 2;
        if (d == Direction.UP) return getY() - halfWidth <= actor.getY() + height / 2;
        if (d == Direction.DOWN) return getY() + halfWidth >= actor.getY() - height / 2;
        return true;
    }


    public boolean onWall() {
        Actor actor = getOneObjectAtOffset(0, getImage().getWidth() * 6 / 8, Wall.class);
        return actor != null;
    }

    public boolean belowWall() {
        Actor actor = getOneObjectAtOffset(0, 0 - halfWidth, Wall.class);
        return actor != null;
    }

    public boolean onGround() {
        Actor actor = getOneObjectAtOffset(0, halfWidth, Ground.class);
        return actor != null;
    }

    public boolean inGround() {
        Actor actor = getOneObjectAtOffset(0, eighthWidth, Ground.class);
        return actor != null;
    }

    public Actor getOneObjectAtOffset(int dx, int dy, Class c){
        return super.getOneObjectAtOffset(dx, dy, c);
    }

}
   
