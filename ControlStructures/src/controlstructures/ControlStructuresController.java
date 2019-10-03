/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author jeppjleemoritzled
 */
public class ControlStructuresController implements Initializable {
    
    
    @FXML
    private Button button;
    @FXML
    private Label lblOutput;
    @FXML
    private TextField txtInput;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String userInput = txtInput.getText();
        /*
        switch (userInput) {
            case "42":
                lblOutput.setText("The meaning of life, the universe and everything");
                break;
            case "Pi":
                lblOutput.setText("" + Math.PI);
                break;
            case "Cat":
                lblOutput.setText("Awesome!");
                break;
            default:
                throw new AssertionError();
        }
        
        if(userInput.equals("42"))
        {
            lblOutput.setText("The meaning of life, the universe and everything");
        }
        else if(userInput.equals("Pi"))
        {
            lblOutput.setText("" + Math.PI);
        }
        else if(userInput.equals("Cat"))
        {
            lblOutput.setText("Awesome!");
        }
        else
        {
            throw new AssertionError();
        }
        */
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
