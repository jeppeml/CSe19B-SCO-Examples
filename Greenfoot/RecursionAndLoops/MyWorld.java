import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //private int offsetX=10;
    //private int offsetY=10;
    private int width = 10;
    private int direction = 1;
    
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        drawFireballs();
        Fish f = new Fish();
        addObject(f, 400, 50);
    }
    
    public void act(){
        
        width = width + direction*2;
        if(width>300){
            direction = -1;
        }
        else if (width<1){
            direction = 1;
        }
        
        drawFireballs();
        
    }
    
    private void drawFireballs(){
        
        removeObjects(getObjects(Fireball.class));
        
        for(int i=0;i<10;i++){
            Fireball fb = new Fireball();
            addObject(fb, 400+width*i, 450-50*i);
            Fireball fb2 = new Fireball();
            addObject(fb2, 400-width*i, 450-50*i);
        }
        /*
        Fireball fb = new Fireball();
        addObject(fb, 400, 450);
        
        Fireball fb2 = new Fireball();
        addObject(fb2, 350, 400);
        
        Fireball fb3 = new Fireball();
        addObject(fb3, 450, 400);*/
        /*
        for(int x=0;x<16;x++){
            for(int y = 0; y<16;y++){
                Fireball fb = new Fireball();
                addObject(fb, offsetX+50*x, offsetY+50*y);
            }
        }*/
    }
}
