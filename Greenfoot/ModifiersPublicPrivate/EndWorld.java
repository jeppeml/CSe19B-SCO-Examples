import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndWorld extends World
{
    private Croc[] finishedCrocs = new Croc[6];
    private Croc finished1;
    private Croc finished2;
    private Croc finished3;
    private Croc finished4;
    private Croc finished5;
    /**
     * Constructor for objects of class EndWorld.
     * 
     */
    public EndWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void setFinished(Croc croc, int number){
        finishedCrocs[number] = croc;
        /*
        if(number==0)
        {
            finished1 = croc;
        }
        else if(number==1)
        {
            finished2 = croc;
        }*/
        
        
    }
    
    public void displayWinner(){
        for(int i = 0; i<finishedCrocs.length;i++){
            finishedCrocs[i]; // list of finished crocs loop
                              // through each one
        }
    }
}
