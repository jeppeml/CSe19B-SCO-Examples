import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test extends Actor
{
    
    public Test(){
        GreenfootImage img = getImage();
        img.scale(150,15);
    }
    /**
     * Act - do whatever the Test wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().getObjects(Bomb.class).size()
        // Add your action code here.
    }    
}
