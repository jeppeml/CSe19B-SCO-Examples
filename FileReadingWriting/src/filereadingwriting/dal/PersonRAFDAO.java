/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting.dal;

import filereadingwriting.be.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonRAFDAO implements IPersonDAO {

    private String filePath;

    // Constants
    private final static int NAME_LENGTH = 50;
    private final static int ID_LENGTH = Integer.BYTES;
    private final static int RECORD_LENGTH = NAME_LENGTH + ID_LENGTH;

    public PersonRAFDAO(String filePath) {
        this.filePath = filePath;

    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    public static void main(String[] args){
        PersonRAFDAO dao = new PersonRAFDAO("testPersons.bin");
        Person p = new Person();
        p.setName("Peter");
        p.setId(0);
        
        Person p2 = new Person();
        p2.setName("Jeppe");
        p2.setId(1);
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p);
        persons.add(p2);
        
        //dao.saveAllPerson(persons);
        
        List<Person> fetchedPersons = dao.getAllPersons();
        for (Person person : fetchedPersons) {
            System.out.println(person.getId() + ", " + person.getName());
        }
    }

    @Override
    public void saveAllPerson(List<Person> persons) {

        File file = new File(filePath);
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            for (Person person : persons) {
                raf.writeInt(person.getId());
                String exactly50String = String.format("%-" + NAME_LENGTH + "s", person.getName()); // MIN 50
                exactly50String = exactly50String.substring(0, NAME_LENGTH); // MAX 50
                raf.writeBytes(exactly50String);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonRAFDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PersonRAFDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList();
        File file = new File(filePath);
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            for (int pos = 0; pos < raf.length(); pos += RECORD_LENGTH) {
                raf.seek(pos);
                Person p = new Person();

                int id = raf.readInt();
                p.setId(id);

                byte[] bytes = new byte[NAME_LENGTH];
                raf.read(bytes);
                String name = new String(bytes);
                p.setName(name.trim()); // and remove spaces
                persons.add(p);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonRAFDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PersonRAFDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }

}
