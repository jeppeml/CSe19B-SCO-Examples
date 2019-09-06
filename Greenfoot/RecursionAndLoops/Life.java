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
    
    public void addToWorld(World w){
        w.addObject(this, 
            player.getX()+offsetX, 
            player.getY()+offsetY);
    }
    
    public void act() 
    {
        setLocation(
            player.getX()+offsetX,  // X location
            player.getY()+offsetY); // Y location
    }    
}
