import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectorWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectorWorld extends World
{

    /**
     * Constructor for objects of class SelectorWorld.
     * 
     */
    public SelectorWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1, 6, 100); 
        createSelectButtons();
        Greenfoot.start();
    }
    
    public void createSelectButtons(){
        for(int i=0;i<6;i++){
            Button b = new Button(i+1);
            addObject(b, 1, i);
        }
    }
}
