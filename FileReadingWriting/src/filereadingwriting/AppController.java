/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Hello World!");
        try(FileReader fr = new FileReader("something.txt");
                BufferedReader br = new BufferedReader(fr);){
            String lines = "";
            String txtLine = br.readLine();
            while(txtLine!=null){
                lines += txtLine + "\n";
                txtLine = br.readLine();
            }
            label.setText(lines);
        }
        catch(FileNotFoundException fnfe)
        {
            label.setText("The file is not found");
        } catch (IOException ex) {
            label.setText("Some wierd I/O Exception occured");
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
