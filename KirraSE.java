/**
 * Write a description of class KirraSE here.
 * 
 * @author Jianxin
 * @version (a version number or a date)
 */

import greenfoot.*;
public class KirraSE implements SoundEffect
{
    private GreenfootSound s = new GreenfootSound("kirra.mp3");
    
    @Override
    public void play(){
        s.play();
    }
}
