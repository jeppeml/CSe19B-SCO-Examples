/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting.dal;

import filereadingwriting.be.Person;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonDAO {
    
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Peter");
        p.setId(0);
        
        Person p2 = new Person();
        p2.setName("Jeppe");
        p2.setId(1);
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p);
        persons.add(p2);
        
        PersonDAO pdao = new PersonDAO();
        pdao.saveAllPerson(persons);
        
    }
    
    public void saveAllPerson(List<Person> persons){
        String retString = ""; 
        
        for (Person person : persons) 
            retString += person + "\n"; 
        
        try(FileWriter fw = new FileWriter("persons.txt");
            BufferedWriter bw = new BufferedWriter(fw);){
            
            bw.write(retString);
            
        } 
        catch (IOException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public List<Person> getAllPersons(){
        ArrayList<Person> persons = new ArrayList();
        
        try(FileReader fr = new FileReader("something.txt");
                BufferedReader br = new BufferedReader(fr);){
            
            String name = br.readLine();
            while(name!=null){
                Person person = new Person();
                person.setId(0);
                person.setName(name);
                persons.add(person);
                
                name = br.readLine();
            }
            return persons;
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("I/O Exception");
        }
        return null;
    }
}
