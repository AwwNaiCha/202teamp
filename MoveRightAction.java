import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.lang.Exception;
import java.lang.Override;
import java.lang.System;
import java.util.*;
public class MoveRightAction extends Action{
    @Override
    public void actOn(String key, Player player){
        if (Greenfoot.isKeyDown(key) &&
                !player.isTouching(Wall.class, Direction.RIGHT)
                && !player.isTouchingThorn(ThornT.class, Direction.RIGHT)
                && !player.isTouchingThorn(ThornD.class, Direction.RIGHT)
                && !player.isTouchingThorn(ThornL.class, Direction.RIGHT)
                && !player.isTouchingThorn(ThornR.class, Direction.RIGHT)
                && !player.isTouching(Fish.class, Direction.RIGHT)
                ) {
         //   Actor p = (Actor) getWorld().getObjects(P1.class).get(0);

            player.setLocation(player.getX() + Speed, player.getY());
            player.getWorld().moveCamera(Speed);
        } else if (player.isTouching(Fish.class, Direction.RIGHT)) {

            Actor f = player.getTochingObject(Fish.class, Direction.RIGHT);
            if (f instanceof Fish) {
                player.getWorld().removeObject(f);
            }
        }
        if (player.inGround() ||player.onGround()) {
            Actor ground = player.getOneObjectAtOffset(0, player.eighthWidth, Ground.class);
            player.setLocation(player.getX(), player.getY());
        }
    }
    
}