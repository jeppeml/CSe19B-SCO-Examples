import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Smiley here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smiley extends Actor
{
    int minAngle = -60;
    int maxAngle = 50;
    // Constructor
    public Smiley(){
        // Random number between -45 and 45
        Calculator calc = new Calculator();
        setRotation(calc.getRandomBetween(minAngle, maxAngle));
    }
    
    private void checkIfDead(){
        Object baby = getOneIntersectingObject(Baby.class);
        if(baby!=null){
            Greenfoot.stop();
        }
    }
    
    public void act() 
    {
        checkIfDead();
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("right")){
            move(2);
        }
        if(Greenfoot.isKeyDown("up")){
            turn(2);
        }
        if(Greenfoot.isKeyDown("down")){
            turn(-2);
        }
        // Add your action code here.
    }    
}
