import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static int sizeX = 80;
    private static int sizeY = 60;
    private int[][] board = new int[sizeX][sizeY];
    private int[][] tempBoard = new int[board.length][board[0].length];
    private static int size = 15;
    public MyWorld(int number)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(sizeX, sizeY, size); 
        for(int x=0;x<board.length;x++)
            for(int y=0;y<board[x].length;y++)
            {
                board[x][y] =0;
            }
        createFun(number);
        drawGame();
        Greenfoot.stop();
        
    }
    
    
    
    public void createFun(int funNumber) {
        int middleX = sizeX/2;
        int middleY = sizeY/2;
        switch(funNumber)
        {
            case 1: // Glider
                board[middleX][middleY] = 
                board[middleX+1][middleY] = 
                board[middleX+2][middleY]= 
                board[middleX+2][middleY-1]= 
                board[middleX+1][middleY-2]=1;
                break;
            case 2: // Small exploder
                board[middleX][middleY] = 
                board[middleX+1][middleY] = 
                board[middleX+2][middleY]= 
                board[middleX+2][middleY+1]= 
                board[middleX][middleY+1]=
                board[middleX+1][middleY+2]=
                board[middleX+1][middleY-1]=1;
                break;
                
            case 3: // big exploder
                board[middleX][middleY] = 
                board[middleX+2][middleY] = 
                board[middleX+4][middleY]= 
                board[middleX][middleY+1]= 
                board[middleX+4][middleY+1]= 
                board[middleX][middleY+2]= 
                board[middleX+4][middleY+2]= 
                board[middleX][middleY+3]= 
                board[middleX+4][middleY+3]= 
                board[middleX][middleY+4]= 
                board[middleX+2][middleY+4]= 
                board[middleX+4][middleY+4]=1;
                break;
            case 4: // 10 cell row
                board[middleX][middleY] = 
                board[middleX+1][middleY] = 
                board[middleX+2][middleY]= 
                board[middleX+3][middleY]= 
                board[middleX+4][middleY]= 
                board[middleX+5][middleY]= 
                board[middleX+6][middleY]= 
                board[middleX+7][middleY]= 
                board[middleX+8][middleY]= 
                board[middleX+9][middleY]=1;
                break;
            case 5: // Lightweight spaceship
                board[middleX][middleY] = 
                board[middleX][middleY-2] = 
                board[middleX+1][middleY-3]= 
                board[middleX+2][middleY-3]= 
                board[middleX+3][middleY-3]= 
                board[middleX+4][middleY-3]= 
                board[middleX+4][middleY-2]= 
                board[middleX+4][middleY-1]= 
                board[middleX+3][middleY]= 1;
                break;
            case 6: // Gosper glider gun
                board[middleX+9][middleY+10] = 
            
                board[middleX+8][middleY+9] = 
            
                board[middleX+8][middleY+8] = 
                board[middleX+9][middleY+8] =
                board[middleX+10][middleY+8] =
            
                board[middleX+19][middleY+5] = 
            
                board[middleX+19][middleY+4] = 
                board[middleX+21][middleY+4] = 
            
                board[middleX+19][middleY+3] = 
                board[middleX+20][middleY+3] = 
            
                board[middleX][middleY+2] =  
            
                board[middleX][middleY+1] = 
                board[middleX+2][middleY+1] = 
            
                board[middleX][middleY] = 
                board[middleX+1][middleY] = 
                board[middleX-7][middleY] =
                board[middleX-8][middleY] =
                
                board[middleX-8][middleY-1] = 
                board[middleX-6][middleY-1] = 
                board[middleX-16][middleY-1] = 
                board[middleX-15][middleY-1] =
                
                board[middleX-16][middleY-2] = 
                board[middleX-15][middleY-2] = 
                board[middleX-6][middleY-2] = 
                board[middleX-7][middleY-2] = 
                board[middleX+6][middleY-2] = 
                board[middleX+7][middleY-2] =
                
                board[middleX+6][middleY-3] = 
                board[middleX+8][middleY-3] = 
                board[middleX+19][middleY-3] = 
                board[middleX+18][middleY-3] = 
                
                board[middleX+19][middleY-4] = 
                board[middleX+18][middleY-4] =
                board[middleX+7][middleY-4] = 
                board[middleX+8][middleY-4] =
                1;
                break;
            default:
                board[middleX][middleY] = 0;
        
        }
    }
    
    public void setItem(int x, int y){
        board[x][y] =1;
    }
    
    public static int getSize(){
        return size;
    }
    public int countLive(int startX, int startY){
        int count = 0;
        for(int x=-1;x<2;x++)
            for(int y=-1;y<2;y++)
            {
                int xR = startX+x;
                int yR = startY+y;
                if(!(x==0 && y==0) && 
                    xR>0 && xR<board.length &&
                    yR>0 && yR<board[0].length)
                   {
                       if(board[xR][yR]>0)
                       {
                           count++;
                       }
                   }
            }
        return count;
    }
    
    public void act(){
        tempBoard = new int[board.length][board[0].length];
         for(int x=0;x<board.length;x++)
            for(int y=0;y<board[x].length;y++)
            {
                int alive = countLive(x,y);
                if(board[x][y]>0) // Live cell
                {
                    tempBoard[x][y]=1;
                    if(alive<2) // Die
                        tempBoard[x][y]=0;
                    else if(alive>3) // Die
                        tempBoard[x][y]=0;
                }
                else if(board[x][y]==0) // Dead cell
                {
                    tempBoard[x][y]=0;
                    if(alive==3) // Reproduce
                        tempBoard[x][y]=1;
                }
            }
         board = tempBoard;
         drawGame();
    }
    
    
    private void drawGame(){
        for(int x=0;x<board.length;x++)
            for(int y=0;y<board[0].length;y++)
            {
                if(board[x][y]==0)
                {
                    List<Actor> oList = getObjectsAt(x, y, Actor.class);
                    for(Actor a : oList){
                        removeObject(a);
                    }
                }
                else if (board[x][y]==1)
                {
                    addObject(new Flower(), x, y);
                }
            }
        
    }
}
