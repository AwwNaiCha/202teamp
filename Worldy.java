import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worldy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worldy extends World
{
    public Worldy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2950, 700, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     * Author: Huimin
     */
    private void prepare()
    {
        /**build the outer wall actor
         * width of wall: 50
         */
        //top wall
        for(int top = 0; top < 59; top++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(25 + top * 50, 25);
        }
        //down wall
        for(int down = 0; down < 59; down++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(25 + down * 50, 675);
        }
        //left wall
        for(int left = 1; left < 13; left++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(25, 25 + left * 50);
        }
        //right wall
        for(int right = 1; right < 13; right++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2925, 25 + right * 50);
        }
        
        /**starting point of the cat  */
        P1 p1 = new P1();
        addObject(p1, 133, 321);
        p1.setLocation(575, 125);
        
        //attach obsever to the cat
        HealthPointObserver hpObserver = new HealthPointObserver(p1);
        addObject(hpObserver, 800, 100);
        
        
        
        
        
        /**first page
         * x: 25 - 1025
         */
        //starting location
        for(int start = 0; start < 17; start++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(175 + start * 50, 175);
        }
        //page seperator
        for(int right = 1; right < 10; right++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1025, 25 + right * 50);
        }
        //jumpers
        Wall wall1 = new Wall();
        addObject(wall1, 32, 382);
        wall1.setLocation(175, 625);
        for(int jump = 0; jump < 2; jump++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(275, 575 + jump * 50);
        }
        for(int jump = 0; jump < 4; jump++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(375, 475 + jump * 50);
        }
        for(int jump = 0; jump < 4; jump++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(525, 475 + jump * 50);
        }
        //set ThornT
        ThornT ThornT1 = new ThornT();
        addObject(ThornT1, 32, 382);
        ThornT1.setLocation(625, 625);
        ThornT ThornT2 = new ThornT();
        addObject(ThornT2, 32, 382);
        ThornT2.setLocation(775, 625);
        ThornT ThornT3 = new ThornT();
        addObject(ThornT3, 32, 382);
        ThornT3.setLocation(825, 625);
        
        /**second page  
         * x: 1025 - 1975
         */
        //steps for left-top area
        for(int step = 0; step < 2; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1225 + step * 50, 575);
        }
        for(int step = 0; step < 3; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1075 + step * 50, 475);
        }
        for(int step = 0; step < 2; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1225 + step * 50, 375);
        }
        for(int step = 0; step < 3; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1075 + step * 50, 275);
        }
        Wall step1 = new Wall();
        addObject(step1, 32, 382);
        step1.setLocation(1225, 175);
        Wall step2 = new Wall();
        addObject(step2, 32, 382);
        step2.setLocation(1775, 125);
        for(int step = 0; step < 2; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1875 + step * 50, 125);
        }
        //area seperator
        for(int right = 3; right < 13; right++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1325, 25 + right * 50);
        }
        for(int right = 0; right < 8; right++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1375 + right * 50, 175);
        }
        //steps for right-down area
        for(int step = 0; step < 4; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1575 + step * 50, 575);
        }
        for(int step = 0; step < 4; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1375 + step * 50, 475);
        }
        for(int step = 0; step < 2; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1825, step * 50 + 275);
        }
        for(int step = 0; step < 7; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1575 + step * 50, 375);
        }
        for(int step = 0; step < 5; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1775, step * 50 + 425);
        }
        //page seperator
        for(int right = 1; right < 11; right++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(1975, 25 + right * 50);
        }
        //set ThornT
        ThornT ThornT4 = new ThornT();
        addObject(ThornT4, 32, 382);
        ThornT4.setLocation(1125, 225);
        ThornT ThornT5 = new ThornT();
        addObject(ThornT5, 32, 382);
        ThornT5.setLocation(1275, 325);
        ThornT ThornT6 = new ThornT();
        addObject(ThornT6, 32, 382);
        ThornT6.setLocation(1875, 325);
        ThornT ThornT7 = new ThornT();
        addObject(ThornT7, 32, 382);
        ThornT7.setLocation(1825, 625);
        ThornT ThornT8 = new ThornT();
        addObject(ThornT8, 32, 382);
        ThornT8.setLocation(1825, 225);
        
        /**third page  
         * x: 1975 - 2925
         */
        for(int step = 0; step < 4; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2125 + step * 150, 625);
        }
        //jumper
        for(int step = 0; step < 3; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2025, step * 150 + 225);
        }
        for(int step = 0; step < 3; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2125, step * 150 + 175);
        }
       // Wall jump1 = new Wall();
        //addObject(jump1, 32, 382);
        //jump1.setLocation(2125, 525);
        for(int step = 0; step < 8; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2175, step * 50 + 175);
        }
        //hidden ThornT
        ThornT ThornT9 = new ThornT();
        addObject(ThornT9, 32, 382);
        ThornT9.setLocation(2225, 165);
        Wall jump2 = new Wall();
        addObject(jump2, 32, 382);
        jump2.setLocation(2275, 175);
        Wall jump3 = new Wall();
        addObject(jump3, 32, 382);
        jump3.setLocation(2225, 175);
        Wall jump4 = new Wall();
        addObject(jump4, 32, 382);
        jump4.setLocation(2325, 275);
        Wall jump5 = new Wall();
        addObject(jump5, 32, 382);
        jump5.setLocation(2525, 275);
        Wall jump6 = new Wall();
        addObject(jump6, 32, 382);
        jump6.setLocation(2225, 375);
        Wall jump7 = new Wall();
        addObject(jump7, 32, 382);
        jump7.setLocation(2275, 425);
        for(int step = 0; step < 6; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2425 + step * 50, 425);
        }
        for(int step = 0; step < 3; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2625 + step * 50, 375);
        }
        for(int step = 0; step < 2; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2725 + step * 50, 325);
        }
        Wall jump8 = new Wall();
        addObject(jump8, 32, 382);
        jump8.setLocation(2825, 275);
        for(int step = 0; step < 2; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2825 + step * 50, 125);
        }
        for(int step = 0; step < 3; step++)
        {
            Wall wall = new Wall();
            addObject(wall, 32, 382);
            wall.setLocation(2675, step * 50 + 475);
        }
        //set ThornT
        ThornD ThornT10 = new ThornD();
        addObject(ThornT10, 32, 382);
        ThornT10.setLocation(2825, 175);
        ThornT ThornT11 = new ThornT();
        addObject(ThornT11, 32, 382);
        ThornT11.setLocation(2825, 625);
        ThornT ThornT12 = new ThornT();
        addObject(ThornT12, 32, 382);
        ThornT12.setLocation(2775, 275);
        ThornT ThornT13 = new ThornT();
        addObject(ThornT13, 32, 382);
        ThornT13.setLocation(2675, 325);
        ThornL ThornT14 = new ThornL();
        addObject(ThornT14, 32, 382);
        ThornT14.setLocation(2875, 425);
        for(int sharp = 0; sharp < 2; sharp++)
        {
            ThornD ThornD = new ThornD();
            addObject(ThornD, 32, 382);
            ThornD.setLocation(2025, sharp * 150 + 275);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            ThornD ThornD = new ThornD();
            addObject(ThornD, 32, 382);
            ThornD.setLocation(2125, sharp * 150 + 225);
        }
        //wheel-ThornT
        for(int sharp = 0; sharp < 2; sharp++)
        {
            ThornL ThornL = new ThornL();
            addObject(ThornL, 32, 382);
            ThornL.setLocation(2275 + sharp * 200, 275);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            ThornT ThornT = new ThornT();
            addObject(ThornT, 32, 382);
            ThornT.setLocation(2325 + sharp * 200, 225);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            ThornR ThornR = new ThornR();
            addObject(ThornR, 32, 382);
            ThornR.setLocation(2375 + sharp * 200, 275);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            ThornD ThornD = new ThornD();
            addObject(ThornD, 32, 382);
            ThornD.setLocation(2325 + sharp * 200, 325);
        }
        //three-limit
        for(int sharp = 0; sharp < 3; sharp++)
        {
            ThornD ThornD = new ThornD();
            addObject(ThornD, 32, 382);
            ThornD.setLocation(2275 + sharp * 150, 475);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            ThornT ThornT = new ThornT();
            addObject(ThornT, 32, 382);
            ThornT.setLocation(2275 + sharp * 150, 575);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            ThornR ThornR = new ThornR();
            addObject(ThornR, 32, 382);
            ThornR.setLocation(2225 + sharp * 150, 525);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            ThornL ThornL = new ThornL();
            addObject(ThornL, 32, 382);
            ThornL.setLocation(2325 + sharp * 150, 525);
        }
    }
}
