/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting.bll;

import filereadingwriting.be.Person;
import filereadingwriting.dal.PersonReader;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class BLLManager {
    private PersonReader pr = new PersonReader();
    
    public List<Person> getAllPersons(){
        return pr.getAllPersons();
    }
}
