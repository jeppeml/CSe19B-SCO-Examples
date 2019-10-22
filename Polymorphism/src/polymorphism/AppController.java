/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author jeppjleemoritzled
 */
public class AppController implements Initializable {
    
    @FXML
    private Label label;
    private List<Lion> lionCage = new ArrayList();
    private List<Wombat> wombatEnclosing = new ArrayList();
    private List<Soundable> allAnimals = new ArrayList();
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        makeAnimalsSound();
        
    }
    
    private void makeAnimalsSound(){
        
        for (Animal animal : allAnimals) {
            System.out.println("Animal: " + animal.getName());
            animal.makeSound();
        }
        
        /*for (Lion lion : lionCage) {
            lion.roar();
        }
        
        for (Wombat wombat : wombatEnclosing) {
            wombat.sniggle();
        }*/
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Lion alex = new Lion();
        alex.setName("Alex the Lion");
        lionCage.add(alex);
        
        Wombat peter = new Wombat();
        peter.setName("Peter");
        Wombat stegger = new Wombat();
        stegger.setName("Stegger");
        wombatEnclosing.add(peter);
        wombatEnclosing.add(stegger);
        
        Turtle t = new Turtle();
        t.setName("T the Turtle");
        
        Horse h = new Horse();
        h.setName("Black Beauty");
        
        allAnimals.add(alex);
        allAnimals.add(peter);
        allAnimals.add(stegger);
        allAnimals.add(t);
        allAnimals.add(h);
    }    
    
}
