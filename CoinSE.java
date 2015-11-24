/**
 * Write a description of class CoinSE here.
 * 
 * @author Jianxin
 * @version (a version number or a date)
 */

import greenfoot.*;
public class CoinSE implements SoundEffect
{
    private GreenfootSound s = new GreenfootSound("coin.mp3");
    
    @Override
    public void play(){
        s.play();
    }
}
