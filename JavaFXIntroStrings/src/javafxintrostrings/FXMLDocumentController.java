/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxintrostrings;

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
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lblOutput;
    
    @FXML
    private TextField txtInput;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleConvert(ActionEvent event) {
        String input = txtInput.getText();
        // input = "<" + input + ">";
        // String output = "" + input.length();
        /*String s = "";
        
        for (int i = 0; i < input.length(); i++) {
            s = s + input.charAt(i) + "@";
        }*/
        
        String s = "";
        for (int i = input.length()-1; i >= 0; i--) {
            s = s + input.charAt(i);
        }
        
        String output = s;
        lblOutput.setText(output);
    }

    
    
}
