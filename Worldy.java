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
        //set thorn
        Thorn thorn1 = new Thorn();
        addObject(thorn1, 32, 382);
        thorn1.setLocation(625, 625);
        Thorn thorn2 = new Thorn();
        addObject(thorn2, 32, 382);
        thorn2.setLocation(775, 625);
        Thorn thorn3 = new Thorn();
        addObject(thorn3, 32, 382);
        thorn3.setLocation(825, 625);
        
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
        //set thorn
        Thorn thorn4 = new Thorn();
        addObject(thorn4, 32, 382);
        thorn4.setLocation(1125, 225);
        Thorn thorn5 = new Thorn();
        addObject(thorn5, 32, 382);
        thorn5.setLocation(1275, 325);
        Thorn thorn6 = new Thorn();
        addObject(thorn6, 32, 382);
        thorn6.setLocation(1875, 325);
        Thorn thorn7 = new Thorn();
        addObject(thorn7, 32, 382);
        thorn7.setLocation(1825, 625);
        Thorn thorn8 = new Thorn();
        addObject(thorn8, 32, 382);
        thorn8.setLocation(1825, 225);
        
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
        //hidden thorn
        Thorn thorn9 = new Thorn();
        addObject(thorn9, 32, 382);
        thorn9.setLocation(2225, 165);
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
        //set thorn
        Thorn thorn10 = new Thorn();
        addObject(thorn10, 32, 382);
        thorn10.setLocation(2825, 175);
        Thorn thorn11 = new Thorn();
        addObject(thorn11, 32, 382);
        thorn11.setLocation(2825, 625);
        Thorn thorn12 = new Thorn();
        addObject(thorn12, 32, 382);
        thorn12.setLocation(2775, 275);
        Thorn thorn13 = new Thorn();
        addObject(thorn13, 32, 382);
        thorn13.setLocation(2675, 325);
        Thorn thorn14 = new Thorn();
        addObject(thorn14, 32, 382);
        thorn14.setLocation(2875, 425);
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2025, sharp * 150 + 275);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2125, sharp * 150 + 225);
        }
        //wheel-thorn
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2275 + sharp * 200, 275);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2325 + sharp * 200, 225);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2375 + sharp * 200, 275);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2325 + sharp * 200, 325);
        }
        //three-limit
        for(int sharp = 0; sharp < 3; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2275 + sharp * 150, 475);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2275 + sharp * 150, 575);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2225 + sharp * 150, 525);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            Thorn thorn = new Thorn();
            addObject(thorn, 32, 382);
            thorn.setLocation(2325 + sharp * 150, 525);
        }
    }
}
