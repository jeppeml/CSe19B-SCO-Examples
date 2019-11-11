/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting.bll;

import filereadingwriting.be.Person;
import filereadingwriting.dal.IPersonDAO;
import filereadingwriting.dal.PersonDAO;
import filereadingwriting.dal.PersonRAFDAO;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class BLLManager {
    private IPersonDAO pr = new PersonRAFDAO("testPersons.bin");
    
    public List<Person> getAllPersons(){
        return pr.getAllPersons();
    }
}
