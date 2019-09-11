import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Line here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line extends Actor
{
    private boolean isCrocFinished =false; 
    private boolean isCamelFinished =false; 
    
    List<Actor> finished = new ArrayList();
    
    private int finishedAnimalsCount = 0;
    /**
     * Act - do whatever the Line wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getOneIntersectingObject(Croc.class)!=null)
        {
            isCrocFinished = true;
            
        }
        
        if(getOneIntersectingObject(Croc.class)!=null)
        {
            isCamelFinished = true;
        }
        
        if(isCrocFinished && isCamelFinished)
        {
            // end
        }
        // Add your action code here.
    }    
}
