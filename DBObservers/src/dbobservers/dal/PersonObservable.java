/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbobservers.dal;

import dbobservers.be.Person;
import java.util.Timer;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonObservable {
    private final ObjectProperty<Person> personList = new SimpleObjectProperty<>();

    public Person getPersonList() {
        return personList.get();
    }

    public void setPersonList(Person value) {
        personList.set(value);
    }

    public ObjectProperty personListProperty() {
        return personList;
    }
    
    public void startDBListenerThread(){
        Timer t = new Timer().schedule(task, 0), time)
        
    }
    
}
