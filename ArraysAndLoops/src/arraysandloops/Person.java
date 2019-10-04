/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandloops;

/**
 *
 * @author jeppjleemoritzled
 */
public class Person {
    private String name;
    private String cprno;
    
    public Person(String cpr, String name){
        this.cprno = cpr;
        setName(name);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCprno(){
        return cprno;
    }

    @Override
    public String toString() {
        return name + ", " + cprno;
    }
    
    
}
