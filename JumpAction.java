import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.lang.Override;
import java.lang.System;
import java.util.*;
public class JumpAction extends ChainAction{
    @Override
    public void actOn(String key, Player player){
        boolean keyPressed = false;
        if(Greenfoot.isKeyDown(key)){
            keyPressed = true;
        }
        if (player.JPower > 0 && keyPressed && !player.belowWall()
                && !player.isTouchingThorn(ThornD.class, Direction.DOWN)
                && !player.isTouchingThorn(ThornT.class, Direction.DOWN)
                && !player.isTouchingThorn(ThornL.class, Direction.DOWN)
                && !player.isTouchingThorn(ThornR.class, Direction.DOWN)
                && !player.isTouching(Fish.class, Direction.DOWN)) {
            player.setLocation(player.getX(), player.getY() - player.JPower);
            player.JPower--;
        } else if (player.onWall()
                || player.isTouchingThorn(ThornT.class, Direction.UP)
                || player.isTouchingThorn(ThornD.class, Direction.UP)
                || player.isTouchingThorn(ThornL.class, Direction.UP)
                || player.isTouchingThorn(ThornR.class, Direction.UP)
                ) {
            player.JPower = 15;
            player.VSpeed = 0;
            keyPressed = false;
        } else if(player.isTouchingThorn(Fish.class, Direction.DOWN)){

            Actor f = player.getTochingObject(Fish.class, Direction.DOWN);
            if (f instanceof Fish) {
                player.getWorld().removeObject(f);
            }
        }else if(player.isTouching(Fish.class, Direction.UP)){
            Actor f = player.getTochingObject(Fish.class, Direction.UP);
            if (f instanceof Fish) {
                player.getWorld().removeObject(f);
            }
        }else {
            player.setLocation(player.getX(), player.getY() - player.VSpeed);
            player.VSpeed--;
        }
        if (player.inGround() || player.onGround()) {
            player.JPower = 15;
            player.VSpeed = 0;
            keyPressed = false;
            Actor ground = player.getOneObjectAtOffset(0, player.eighthWidth, Ground.class);
            player.setLocation(player.getX(), player.getY());
        }
        if (player.belowWall()) {
            player.JPower = 0;
        }
    }
}