import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        NameCreator nc = new NameCreator();
        
        for(int x = 0; x<3;x++){
            for(int y = 0; y<3;y++){
            Monkey monkey = new Monkey((1+x)*y);
            addObject(monkey, 25+y*75, 75+x*75);
            monkey.setName(nc.generateName());
        }
        }
        /*
        Monkey peterStegger = new Monkey(1);
        Monkey piotrStegovsky = new Monkey(2);
        Monkey peteStegovich = new Monkey(3);
        
        addObject(peterStegger, 25, 100);
        peterStegger.setName(nc.generateName());
        addObject(piotrStegovsky, 25, 200);
        piotrStegovsky.setName(nc.generateName());
        addObject(peteStegovich, 25, 300);
        peteStegovich.setName(nc.generateName());
        */
        //peterStegger.setName("Peter");
        
        //removeObject(peteStegovich);
        //peteStegovich = null;
        // Monkey.numberOfMonkeys--;
    }
}
