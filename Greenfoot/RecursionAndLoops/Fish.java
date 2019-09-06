import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private Life life1 = new Life(this,-30,-40);
    private Life life2 = new Life(this,0,-40);
    private Life life3 = new Life(this,30,-40);
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(-90);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
        }
        move(2);
    }    
}
