import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.lang.Exception;
import java.lang.Override;
import java.lang.System;
import java.util.*;
public class MoveLeftAction extends Action{
    @Override
    public void actOn(String key, Player player){
      
        if (Greenfoot.isKeyDown(key)
                && !player.isTouching(Wall.class, Direction.LEFT)
                && !player.isTouchingThorn(ThornT.class, Direction.LEFT)
                && !player.isTouchingThorn(ThornD.class, Direction.LEFT)
                && !player.isTouchingThorn(ThornL.class, Direction.LEFT)
                && !player.isTouchingThorn(ThornR.class, Direction.LEFT)
                && !player.isTouching(Fish.class, Direction.LEFT)) {
//player.getWorld().getObjects(P1.class).get(0);
       
            player.setLocation(player.getX() - Speed, player.getY());
            player.getWorld().moveCamera(-Speed);
        } else if (player.isTouching(Fish.class, Direction.LEFT)) {

            Actor f = player.getTochingObject(Fish.class, Direction.LEFT);
            if (f instanceof Fish) {
                player.getWorld().removeObject(f);
            }
        }
        if (player.inGround() || player.onGround()) {
            Actor ground = player.getOneObjectAtOffset(0, player.eighthWidth, Ground.class);
            player.setLocation(player.getX(), player.getY());
        }
    }
}