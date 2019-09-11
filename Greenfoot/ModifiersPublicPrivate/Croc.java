import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Croc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Croc extends Actor
{
    
    /**
     * Act - do whatever the Croc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int random = Greenfoot.getRandomNumber(10);
        move(random);
        // Add your action code here.
    }    
}
