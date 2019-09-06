import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int offsetX=10;
    private int offsetY=10;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        drawFireballs();
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("left")){
            offsetX = offsetX -2;
            drawFireballs();
        }
        if(Greenfoot.isKeyDown("right")){
            offsetX = offsetX+2;
            drawFireballs();
        }
        if(Greenfoot.isKeyDown("up")){
            offsetY = offsetY-2;
            drawFireballs();
        }
        if(Greenfoot.isKeyDown("down")){
            offsetY = offsetY+2;
            drawFireballs();
        }
    }
    
    private void drawFireballs(){
        
        removeObjects(getObjects(Fireball.class));
        
        for(int x=0;x<16;x++){
            for(int y = 0; y<16;y++){
                Fireball fb = new Fireball();
                addObject(fb, offsetX+50*x, offsetY+50*y);
            }
        }
    }
}
