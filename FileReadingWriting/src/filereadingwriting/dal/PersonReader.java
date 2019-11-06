/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting.dal;

import filereadingwriting.be.Person;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonReader {
    public List<Person> getAllPersons(){
        ArrayList<Person> persons = new ArrayList();
        
        try(FileReader fr = new FileReader("something.txt");
                BufferedReader br = new BufferedReader(fr);){
            
            String name = br.readLine();
            while(name!=null){
                Person p = new Person();
                p.setId(0);
                p.setName(name);
                persons.add(p);
                
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
