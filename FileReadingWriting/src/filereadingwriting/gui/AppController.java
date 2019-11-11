/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting.gui;

import filereadingwriting.be.Person;
import filereadingwriting.bll.BLLManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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
    private ListView<Person> lstPersons;
    
    private BLLManager bll = new BLLManager();
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Hello World!");
        
        ObservableList op = 
                FXCollections.observableArrayList(bll.getAllPersons());
        lstPersons.setItems(op);
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
