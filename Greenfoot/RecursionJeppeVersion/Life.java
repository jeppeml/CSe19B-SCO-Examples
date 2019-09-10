import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    private Actor follow;
    private int offsetX;
    private int offsetY;
    public Life(Actor follow, int offsetX, int offsetY, int size)
    {
        GreenfootImage image = getImage();  
        image.scale(size, size);
        setImage(image);
        this.follow = follow;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }
    public void remove(){
        getWorld().removeObject(this);
    }
    public void addToWorld(World w){
        w.addObject(this, follow.getX()+offsetX, follow.getY()+offsetY);
    }
    
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.setLocation(follow.getX()+offsetX, follow.getY()+offsetY);
        // Add your action code here.
    }    
}
