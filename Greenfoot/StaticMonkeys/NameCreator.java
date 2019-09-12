import greenfoot.*;

public class NameCreator  
{
    String[] firstName = 
    {"Peter", "Martin", "Sven", "Brunhilda", "Bent"};
    String[] lastName = 
    {"Stegger", "Hansen", "Peterson", "Gates"};
    
    public String generateName(){
        String fn = 
            firstName[
            Greenfoot.getRandomNumber(firstName.length)];
        
        String ln = 
            lastName[Greenfoot.getRandomNumber(lastName.length)];
            
        return fn + " " + ln;
    }
    
}
