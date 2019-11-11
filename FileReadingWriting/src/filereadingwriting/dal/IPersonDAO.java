/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting.dal;

import filereadingwriting.be.Person;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public interface IPersonDAO {
    public void saveAllPerson(List<Person> persons);
    public List<Person> getAllPersons();
}
