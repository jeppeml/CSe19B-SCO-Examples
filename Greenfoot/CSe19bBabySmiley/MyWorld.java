import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int count=0;
    private double difficulty=100;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        this.act();
        Smiley player = new Smiley();
        addObject(player, 300, 350);
    }
    
    public void act(){
        count++;
        if(count>(int)difficulty)
        {
            Calculator calc = new Calculator();
            Baby baby = new Baby();
            addObject(baby, calc.getRandomBetween(0, 550), 25);
            count=0;
            difficulty = difficulty*0.98;
            if(difficulty<50)
            {
                difficulty = 50;
            }
        }
        
    }
}
