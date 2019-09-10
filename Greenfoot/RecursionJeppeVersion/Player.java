import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    Life life1 = new Life(this, -30,-40, 15);
    Life life2 = new Life(this, 0,-40, 15);
    Life life3 = new Life(this, 30,-40, 15);
    
    private boolean isHit=false;
    public Player(){
        
    }
    
    public void addedToWorld(World w){
        life1.addToWorld(w);
        life2.addToWorld(w);
        life3.addToWorld(w);
    }
    
    private void removeOneLife(){
        if(life3!=null){
            life3.remove();
            life3=null;
        }
        else if(life2!=null){
            life2.remove();
            life2=null;
        }
        else if(life1!=null){
            life1.remove();
            life1=null;
            Greenfoot.stop();//Game over
        }
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        checkIfHit();
         checkKeysAndMove();
    }    
    
    private void checkKeysAndMove(){
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(-90);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            
        }
        move(2);
    }
    
    private void checkIfHit(){
        Object banana =this.getOneIntersectingObject(Banana.class);
        if(banana!=null)
        {
            if(!isHit){
                this.removeOneLife();
                isHit = true;
            }
            
        }
        else
        {
            isHit=false;
        }
    }
}
