/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandloops;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *
 * @author jeppjleemoritzled
 */
public class AppController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private ListView<Person> listPersons;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        ObservableList ol = listPersons.getItems();
        
        for (int i = 0; i < 1000; i++) {
            Person p = new Person("220599-4455", "Jeppe Young");
            ol.add(p);
        }
        
        
        
        
        
        
        /*
        Random rand = new Random();
        int i = rand.nextInt(10);
        int i2 = rand.nextInt(10);
        int i3 = rand.nextInt(10);
        int i4 = rand.nextInt(10);
        int i5 = rand.nextInt(10);
        int i6 = rand.nextInt(10);
        int i7 = rand.nextInt(10);
        int i8 = rand.nextInt(10);
        int i9 = rand.nextInt(10);
        
        int sum = i+i2+i3+i4+i5+i6+i7+i8+i9;
        
        int[] is = new int[9];
        
        int[] isLarger = new int[10];
        
        for (int j = 0; j < is.length; j++) {
            isLarger[j] = is[j];
        }
        isLarger[9] = rand.nextInt();
        
        
        for (int j = 0; j < is.length; j++) {
            is[j] = rand.nextInt(10);
        }
        
        int sum2 =0;
        for (int j = 0; j < is.length; j++) {
            sum2 = sum2 + is[j];
        }
        
        label.setText("Hello World!");
        
        ArrayList<Integer> intArrayList = new ArrayList();
        
        for (Integer someInt : intArrayList) {
            label.setText(label.getText() + someInt);
        }
        
        
        
        listPersons.getItems().add("Peter Stegger");
        
        for (String names : listPersons.getItems()) {
            System.out.println(names);
        }*/
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
