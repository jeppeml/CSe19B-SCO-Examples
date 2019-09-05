import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    public Flower(){
        
    }

    public void addedToWorld(World world){
        MyWorld mw = (MyWorld)world;
        GreenfootImage image = getImage();  
        image.scale(MyWorld.getSize(), MyWorld.getSize());
        setImage(image);
        mw.setItem(getX(), getY());
    }
}
