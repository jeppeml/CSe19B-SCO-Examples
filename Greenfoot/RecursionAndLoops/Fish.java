import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private Life life1 = new Life(this,-40,-40);
    private Life life2 = new Life(this,0,-40);
    private Life life3 = new Life(this,40,-40);
    
    private boolean isAlreadyDying=false;
    
    public void addedToWorld(World w){
        life1.addToWorld(w);
        life2.addToWorld(w);
        life3.addToWorld(w);
    }
    
    private void handleKeys(){
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
    
    private void handleCollisions(){
        Object fireball = 
            this.getOneIntersectingObject(Fireball.class);
           
        if(fireball!=null){
            if(!isAlreadyDying){
            if(life3!=null){
                getWorld().removeObject(life3);
                life3=null;
            }
            else if(life2!=null){
                getWorld().removeObject(life2);
                life2=null;
            }
            else if(life1!=null){
                getWorld().removeObject(life1);
                life1=null;
                Greenfoot.stop();
            }}
            isAlreadyDying=true;
        }
        else{
            isAlreadyDying = false;
        }
    }
    
    public void act() 
    {
        handleKeys();
        handleCollisions();
    }    
}
