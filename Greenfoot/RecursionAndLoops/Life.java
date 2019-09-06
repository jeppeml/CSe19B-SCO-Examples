import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    private Actor player;
    private int offsetX;
    private int offsetY;
    
    public Life(Actor player, 
    int offsetX, int offsetY){
        this.player = player;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
