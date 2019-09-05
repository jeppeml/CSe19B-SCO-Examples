import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int number=0;
    public Button(int number){
        super();
        this.number = number;
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            MyWorld mw = new MyWorld(number);
            Greenfoot.setWorld(mw);
        }
    }
}
