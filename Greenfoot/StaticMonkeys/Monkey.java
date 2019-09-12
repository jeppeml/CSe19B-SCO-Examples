import greenfoot.*;  
public class Monkey extends Actor
{
      // public static int numberOfMonkeys = 0;
      // Default monkey name
      private String name = "Peter Stegger";
      private int id;
      
      public Monkey(int id){
          this.id = id;
      }
      
      public int getId(){
          return id;
      }
      
      public String getName(){
          return name;
      }
      
      public void setName(String name){
          this.name = name;
      }
}
