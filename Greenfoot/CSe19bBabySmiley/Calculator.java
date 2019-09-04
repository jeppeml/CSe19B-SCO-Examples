import greenfoot.*; 
public class Calculator  
{
    public int getRandomBetween(int min, int max){
        int number = Greenfoot.getRandomNumber(max-min)+min;
        return number;
    }
}
