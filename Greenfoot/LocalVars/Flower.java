import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Flower extends Actor
{
    private int size = 5; // Instance variable/field
    private int someResult = -35536;
    
    public Flower(){
        //size = Greenfoot.getRandomNumber(5)+2;
        int size = 8; // Local variable
        this.size = size;
        setSize(2);
        int result = add(4,5);
        someResult = result;
    }
    
    private void setSize(int size){ // Parameter
        this.size = size;
    }
    
    private int add(int a, int b){
        return a+b;
    }
}
