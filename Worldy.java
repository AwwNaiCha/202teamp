import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worldy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worldy extends ScrollWorld
{
    
    private GreenfootSound bgm = new GreenfootSound("castle.mp3");
    public Worldy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(900, 700, 1, 4850, 700);
        //super(4850, 700, 1, 4850, 700); //for wall construction test
        bgm.playLoop();
        setPaintOrder(GameOver.class, P1.class, HealthPointObserver.class, Wall.class, Ground.class);
        
        /**starting point of the cat  */
        P1 p1 = new P1();
        addObject(p1, 133, 321);
        p1.setLocation(575, 125);
        addCameraFollower(p1, 0, 0);
        addObject(new FPS(), 85, 15);
        
        //attach obsever to the cat
        PlayerImageObserver imageObserver = new PlayerImageObserver(p1);
        GameOverObserver gmObserver = new GameOverObserver(p1);
        HealthPointObserver hpObserver = new HealthPointObserver(p1);
        
        
       
       
        
        addObject(hpObserver, 900, 100);
        
        prepare();
        
    }
 

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     * Author: Huimin
     */
    private void prepare()
    {
        ShapeFactory shapefactory = new ShapeFactory();
        
        /**build the outer wall actor
         * width of wall: 50
         */
        //top wall
        for(int top = 0; top < 97; top++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(25 + top * 50, 25);
        }
        //down wall
        for(int down = 0; down < 97; down++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(25 + down * 50, 675);
        }
        //left wall
        for(int left = 1; left < 13; left++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(25, 25 + left * 50);
        }
        //right wall
        for(int right = 1; right < 13; right++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(4825, 25 + right * 50);
        }
        
        //moving ground decorator
        Shape ground = shapefactory.getShape("GROUND");
        Shape g = new MovingGround(ground, 1326, 1674);
        Actor cro = (Actor) g;
        addObject(cro, 1326, 475);
        ground.act();
        
        /**first page
         * x: 75 - 1025
         */
        //starting location
        for(int start = 0; start < 17; start++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(175 + start * 50, 175);
        }

        Fish f1 = new Fish();
        addObject(f1, 875, 125);
        //fish setting
        
            Fish f = new Fish();
            addObject(f, 925, 125);
             

        //page seperator
        for(int right = 1; right < 10; right++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(1025, 25 + right * 50);
        }
        //jumpers
        Shape w1 = shapefactory.getShape("WALL");
        Actor wall1 = (Actor) w1;
        addObject(wall1, 32, 382);
        wall1.setLocation(175, 625);
        for(int jump = 0; jump < 2; jump++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(275, 575 + jump * 50);
        }
        for(int jump = 0; jump < 4; jump++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(375, 475 + jump * 50);
        }
        for(int jump = 0; jump < 4; jump++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(525, 475 + jump * 50);
        }
        //set ThornT
        for(int jump = 0; jump < 3; jump++)
        {
            Shape t = shapefactory.getShape("THORNT");
            Actor thornt1 = (Actor) t;
            addObject(thornt1, 32, 382);
            thornt1.setLocation(475 + jump * 200, 625);
        }
        
        Shape t3 = shapefactory.getShape("THORNT");
        Actor thornt3 = (Actor) t3;
        addObject(thornt3, 32, 382);
        thornt3.setLocation(825, 625);
        
        Fish f2 = new Fish();
        addObject(f2, 425, 625);
        
        
        /**second page  
         * x: 1075 - 1975
         */
        //page seperator
        for(int right = 1; right < 10; right++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(1975, 25 + right * 50);
        }
        //steps
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < i; j++)
            {
                Shape w = shapefactory.getShape("WALL");
                Actor wall = (Actor) w;
                addObject(wall, 32, 382);
                wall.setLocation(1225 - j * 50, 425 + i * 50);
            }
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < i; j++)
            {
                Shape w = shapefactory.getShape("WALL");
                Actor wall = (Actor) w;
                addObject(wall, 32, 382);
                wall.setLocation(1775 + j * 50, 425 + i * 50);
            }
        }
        //thorns
        for(int step = 0; step < 10; step++)
        {
            Shape t = shapefactory.getShape("THORNT");
            Actor thornt = (Actor) t;
            addObject(thornt, 32, 382);
            thornt.setLocation(1275 + step * 50, 625);
        }
        
        
        /**third page  
         * x: 2125 - 2925
         */
        //steps for left-top area
        for(int step = 0; step < 2; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2175 + step * 50, 575);
        }
        for(int step = 0; step < 3; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2025 + step * 50, 475);
        }
        for(int step = 0; step < 2; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2175 + step * 50, 375);
        }
        for(int step = 0; step < 3; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2025 + step * 50, 275);
        }
        Shape s1 = shapefactory.getShape("WALL");
        Actor step1 = (Actor) s1;
        addObject(step1, 32, 382);
        step1.setLocation(2175, 175);
        Shape s2 = shapefactory.getShape("WALL");
        Actor step2 = (Actor) s2;
        addObject(step2, 32, 382);
        step2.setLocation(2725, 125);
        for(int step = 0; step < 2; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2825 + step * 50, 125);
        }
        //area seperator
        for(int right = 3; right < 12; right++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2275, 25 + right * 50);
        }
        for(int right = 0; right < 8; right++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2325 + right * 50, 175);
        }
        //steps for right-down area
        for(int step = 0; step < 4; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2525 + step * 50, 575);
        }
        for(int step = 0; step < 4; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2325 + step * 50, 475);
        }
        for(int step = 0; step < 2; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2775, step * 50 + 275);
        }
        for(int step = 0; step < 6; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2525 + step * 50, 375);
        }
        for(int step = 0; step < 5; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2725, step * 50 + 425);
        }
        //page seperator
        for(int right = 1; right < 10; right++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2925, 25 + right * 50);
        }
        //set ThornT
        Shape t4 = shapefactory.getShape("THORNT");
        Actor thornt4 = (Actor) t4;
        addObject(thornt4, 32, 382);
        thornt4.setLocation(2075, 225);
       
        Shape t5 = shapefactory.getShape("THORNT");
        Actor thornt5 = (Actor) t5;
        addObject(thornt5, 32, 382);
        thornt5.setLocation(2225, 325);
        
        Shape t6 = shapefactory.getShape("THORNT");
        Actor thornt6 = (Actor) t6;
        addObject(thornt6, 32, 382);
        thornt6.setLocation(2875, 325);
        
        Shape s3 = shapefactory.getShape("WALL");
        Actor step3 = (Actor) s3;
        addObject(step3, 32, 382);
        step3.setLocation(2875, 375);
        
        Shape t7 = shapefactory.getShape("THORNT");
        Actor thornt7 = (Actor) t7;
        addObject(thornt7, 32, 382);
        thornt7.setLocation(2775, 625);
        
        Shape t8 = shapefactory.getShape("THORNT");
        Actor thornt8 = (Actor) t8;
        addObject(thornt8, 32, 382);
        thornt8.setLocation(2775, 225);
        //set Fishes
        Fish f3 = new Fish();
        addObject(f3, 2875, 75);
        
        Fish f4 = new Fish();
        addObject(f4, 2725, 325);
        
        Fish f5 = new Fish();
        addObject(f5, 2375,425);
        
        
        Fish fx = new Fish();
        addObject(fx, 2675,525);
        
        /**fourth page  
         * x: 2925 - 3875
         */
        //page seperator
        for(int right = 2; right < 13; right++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(3875, 25 + right * 50);
        }
        //cross
        for(int i = 0; i < 17; i++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2975 + i * 50, 475);
        }
        for(int i = 0; i < 17; i++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(3025 + i * 50, 275);
        }
        for(int i = 0; i < 2; i++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(2975, i * 50 + 375);
        }
        for(int i = 0; i < 2; i++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(3825, i * 50 + 175);
        }
        for(int i = 0; i < 2; i++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(3825, i * 50 + 575);
        }
        for(int i = 0; i < 4; i++)
        {
            //thorn decorator
            Shape thorn = shapefactory.getShape("THORND");
            Shape move = new MovingShape(thorn, 525, 624);
            Actor m = (Actor) move;
            addObject(m, 3025 + i * 200, 525);
            move.act();
        }
        for(int i = 0; i < 4; i++)
        {
            Shape thorn = shapefactory.getShape("THORND");
            Shape move = new MovingShape(thorn, 525, 624);
            Actor m = (Actor) move;
            addObject(m, 3125 + i * 200, 585);
            move.act();
        }
        for(int i = 0; i < 8; i++)
        {
            Shape thorn = shapefactory.getShape("THORND");
            Shape move = new MovingShape(thorn, 75, 225);
            Actor m = (Actor) move;
            addObject(m, 3025 + i * 100, 75);
            move.act();
        }
        for(int i = 0; i < 4; i++)
        {
            Shape thorn = shapefactory.getShape("THORND");
            Shape move = new MovingShape(thorn, 75, 225);
            Actor m = (Actor) move;
            addObject(m, 3075 + i * 200, 105);
            move.act();
        }
        
        Fish f6 = new Fish();
        addObject(f6, 3725, 425);
        
          Fish f7 = new Fish();
        addObject(f7, 3075, 425);
         Fish f8 = new Fish();
        addObject(f8, 4850 -275, 625);
        
        
        for(int sharp = 0; sharp < 3; sharp++)
        {
            
            Shape t = shapefactory.getShape("THORND");
            Actor thornd = (Actor) t;
            addObject(thornd, 32, 382);
            thornd.setLocation(3225 + sharp * 200, 325);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            Shape t = shapefactory.getShape("THORNT");
            Actor thornt = (Actor) t;
            addObject(thornt, 32, 382);
            thornt.setLocation(3175 + sharp * 200, 425);
        }
        
        /**fifth page  
         * x: 3875 - 4825
         */
        for(int step = 0; step < 4; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(4025 + step * 150, 625);
        }
        //jumper
        for(int step = 0; step < 2; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(3925, step * 200 + 175);
        }
        Shape j1 = shapefactory.getShape("WALL");
        Actor jump1 = (Actor) j1;
        addObject(jump1, 32, 382);
        jump1.setLocation(3925, 525);
        for(int step = 0; step < 3; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(4025, step * 150 + 125);
        }
       // Wall jump1 = new Wall();
        //addObject(jump1, 32, 382);
        //jump1.setLocation(2125, 525);
        for(int step = 0; step < 8; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(4075, step * 50 + 175);
        }
        //hidden ThornT
        Shape t9 = shapefactory.getShape("THORNT");
        Actor thornt9 = (Actor) t9;
        addObject(thornt9, 32, 382);
        thornt9.setLocation(4125, 165);
        Shape j2 = shapefactory.getShape("WALL");
        Actor jump2 = (Actor) j2;
        addObject(jump2, 32, 382);
        jump2.setLocation(4175, 175);
        Shape j3 = shapefactory.getShape("WALL");
        Actor jump3 = (Actor) j3;
        addObject(jump3, 32, 382);
        jump3.setLocation(4125, 175);
        Shape j4 = shapefactory.getShape("WALL");
        Actor jump4 = (Actor) j4;
        addObject(jump4, 32, 382);
        jump4.setLocation(4225, 275);
        Shape j5 = shapefactory.getShape("WALL");
        Actor jump5 = (Actor) j5;
        addObject(jump5, 32, 382);
        jump5.setLocation(4425, 275);
        Shape j6 = shapefactory.getShape("WALL");
        Actor jump6 = (Actor) j6;
        addObject(jump6, 32, 382);
        jump6.setLocation(4125, 375);
        Shape j7 = shapefactory.getShape("WALL");
        Actor jump7 = (Actor) j7;
        addObject(jump7, 32, 382);
        jump7.setLocation(4175, 425);
        for(int step = 0; step < 6; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(4325 + step * 50, 425);
        }
        for(int step = 0; step < 3; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(4525 + step * 50, 375);
        }
        for(int step = 0; step < 2; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(4625 + step * 50, 325);
        }
        Shape j8 = shapefactory.getShape("WALL");
        Actor jump8 = (Actor) j8;
        addObject(jump8, 32, 382);
        jump8.setLocation(4725, 275);
        for(int step = 0; step < 2; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(4725 + step * 50, 125);
        }
        for(int step = 0; step < 3; step++)
        {
            Shape w = shapefactory.getShape("WALL");
            Actor wall = (Actor) w;
            addObject(wall, 32, 382);
            wall.setLocation(4575, step * 50 + 475);
        }
        //set ThornT
        Shape t10 = shapefactory.getShape("THORND");
        Actor thornt10 = (Actor) t10;
        addObject(thornt10, 32, 382);
        thornt10.setLocation(4775, 175);
        
        Shape t11 = shapefactory.getShape("THORNT");
        Actor thornt11 = (Actor) t11;
        addObject(thornt11, 32, 382);
        thornt11.setLocation(4725, 625);
        
        Shape t12 = shapefactory.getShape("THORNT");
        Actor thornt12 = (Actor) t12;
        addObject(thornt12, 32, 382);
        thornt12.setLocation(4675, 275);
        
        Shape t13 = shapefactory.getShape("THORNT");
        Actor thornt13 = (Actor) t13;
        addObject(thornt13, 32, 382);
        thornt13.setLocation(4575, 325);
        
        Shape t14 = shapefactory.getShape("THORNL");
        Actor thornl14 = (Actor) t14;
        addObject(thornl14, 32, 382);
        thornl14.setLocation(4775, 425);
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Shape d = shapefactory.getShape("THORND");
            Actor thornd = (Actor) d;
            addObject(thornd, 32, 382);
            thornd.setLocation(3925, sharp * 200 + 225);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Shape d = shapefactory.getShape("THORND");
            Actor thornd = (Actor) d;
            addObject(thornd, 32, 382);
            thornd.setLocation(4025, sharp * 150 + 175);
        }
        //wheel-ThornT
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Shape l = shapefactory.getShape("THORNL");
            Actor thornl = (Actor) l;
            addObject(thornl, 32, 382);
            thornl.setLocation(4175 + sharp * 200, 275);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Shape t = shapefactory.getShape("THORNT");
            Actor thornt = (Actor) t;
            addObject(thornt, 32, 382);
            thornt.setLocation(4225 + sharp * 200, 225);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Shape r = shapefactory.getShape("THORNR");
            Actor thornr = (Actor) r;
            addObject(thornr, 32, 382);
            thornr.setLocation(4275 + sharp * 200, 275);
        }
        for(int sharp = 0; sharp < 2; sharp++)
        {
            Shape d = shapefactory.getShape("THORND");
            Actor thornd = (Actor) d;
            addObject(thornd, 32, 382);
            thornd.setLocation(4225 + sharp * 200, 325);
        }
        //three-limit
        for(int sharp = 0; sharp < 3; sharp++)
        {
            Shape d = shapefactory.getShape("THORND");
            Actor thornd = (Actor) d;
            addObject(thornd, 32, 382);
            thornd.setLocation(4175 + sharp * 150, 475);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            Shape t = shapefactory.getShape("THORNT");
            Actor thornt = (Actor) t;
            addObject(thornt, 32, 382);
            thornt.setLocation(4175 + sharp * 150, 575);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            Shape r = shapefactory.getShape("THORNR");
            Actor thornr = (Actor) r;
            addObject(thornr, 32, 382);
            thornr.setLocation(4125 + sharp * 150, 525);
        }
        for(int sharp = 0; sharp < 3; sharp++)
        {
            Shape l = shapefactory.getShape("THORNL");
            Actor thornl = (Actor) l;
            addObject(thornl, 32, 382);
            thornl.setLocation(4225 + sharp * 150, 525);
        }
        
        
    }
}
