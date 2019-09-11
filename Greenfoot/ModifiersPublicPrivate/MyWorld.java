import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Croc croc  = new Croc();
    private Croc croc2  = new Croc();
    
    private EndWorld end = new EndWorld();
    
    private int finish=0;
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(croc, 0, 100);
        addObject(croc2, 0, 300);
    }
    
    
    public void act(){
        /*if(croc.getX()>450 &&
        croc2.getX()>450){
                Greenfoot.stop();
            }*/
    }
    
    public void setFinished(){
        finish++;
        if(finish==6)
        {
            Greenfoot.setWorld(new EndWorld());
        }
    }
}









