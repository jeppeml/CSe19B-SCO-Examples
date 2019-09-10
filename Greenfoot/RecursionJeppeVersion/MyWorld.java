import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int startX = 400;
    private int startY = 600;
    private int widthX = 80;
    private int heightY = 100;
    
    private int directionX = -1;
    private int directionY = -1;
    
    private double maxLength=0;
    
    private int speedOfSpace=10;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        drawBananas();
        Player p = new Player();
        addObject(p, 300, 200);
        
    }
    
    private void checkIfSpace(){
        removeObjects(getObjects(Fireball.class));
        if(Greenfoot.isKeyDown("space")){
            maxLength+=10;
            drawFireballs(300, 300, 10, 0);
        }
        else{
            if(maxLength>0)
            {
                maxLength-=10;
                drawFireballs(300, 300, 10, 0);
            }
        }
    }
    
    private void drawFireballs(double x, double y, double length, double angle){
        if(length<maxLength)
        {
            Fireball fb = new Fireball();
            addObject(fb, (int)(Math.cos(angle)*length+x), 
                          (int)(Math.sin(angle)*length+y));
            drawFireballs(x, y, length*1.02,angle+1.1618*Math.PI);
        }
    }
    
    private void drawBananas(){
        removeObjects(getObjects(Banana.class));
        addBanana(startX, startY);
        
        for(int i = 0; i<6; i++){
            addBanana(startX-widthX*i, startY-heightY*i);
            addBanana(startX+widthX*i, startY-heightY*i);
        }
    }
    
    public void act(){
        widthX+=directionX*3;
        heightY+=directionY*2;
        if(widthX>100)
            directionX*=-1;
        else if(widthX<1)
            directionX*=-1;
        
        if(heightY>100)
            directionY*=-1;
        else if(heightY<1)
            directionY*=-1;
        drawBananas();
        checkIfSpace();
    }
    
    private void addBanana(int x, int y){
        
        Banana b = new Banana();
        addObject(b, x, y);
        
    }
}
