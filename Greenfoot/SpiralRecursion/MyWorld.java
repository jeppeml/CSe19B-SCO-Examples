import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int amount = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            amount++;
        }
        else{
            if(amount>0)
            {
                amount--;
            }
        }
        removeObjects(getObjects(Bomb.class));
        drawBombs(amount,1);
    }
    
    // recursive
    public void drawBombs(int count, double length){
        if(count>0)
        {
            Bomb b = new Bomb();
            int angle = count*25;
            double x = Math.sin(angle)*length;
            double y = Math.cos(angle)*length;
            addObject(b, 300 + (int)x, 200 + (int)y);
            drawBombs(count-1, (int)(length+1));
        }
    }
}
