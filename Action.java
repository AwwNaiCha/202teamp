import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.lang.System;
import java.util.*;

public class Action implements Actable{
    public int getAnimationFrames() {
        return AnimationFrames;
    }

    public void setAnimationFrames(int animationFrames) {
        AnimationFrames = animationFrames;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    protected int AnimationFrames;
    protected int Speed;
    protected String actionName;
    public void actOn(String keyDown, Player player){
        System.out.println(keyDown + " is pressed");
    }
}