/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbobservers.be;

import java.time.LocalDateTime;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author jeppjleemoritzled
 */
public class Person {

    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final ObjectProperty<LocalDateTime> lastChange = new SimpleObjectProperty<>();
    private final StringProperty occupation = new SimpleStringProperty();

    public String getOccupation() {
        return occupation.get();
    }

    public void setOccupation(String value) {
        occupation.set(value);
    }

    public StringProperty occupationProperty() {
        return occupation;
    }

    public LocalDateTime getLastChange() {
        return lastChange.get();
    }

    public void setLastChange(LocalDateTime value) {
        lastChange.set(value);
    }

    public ObjectProperty lastChangeProperty() {
        return lastChange;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public int getId() {
        return id.get();
    }

    public void setId(int value) {
        id.set(value);
    }

    public IntegerProperty idProperty() {
        return id;
    }
    
}
