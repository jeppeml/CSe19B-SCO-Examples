import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int amount = 0;
    List<Waypoint> waypoints = new ArrayList();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GameWorld gw = new GameWorld();
        gw.setWaypoints(waypoints);
    }
    
    public void act(){
        
        if ( Greenfoot.mouseDragged(this) ) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            Waypoint wp = new Waypoint();
            addObject(wp, mouse.getX(), mouse.getY());
            waypoints.add(wp);
        }
        
        /*
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
        drawBombs(amount,1);*/
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
