/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsandbinding;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws InterruptedException {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        Thread.sleep(5000);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setOnMouseEntered((MouseEvent event) -> {
            System.out.println("Mouse entered!");
            ((Button)event.getSource()).setText("Entered");
            
        });
        
        label.setOnMouseExited(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Mouse exited!");
            }
            
        });
        
        label.setOnMouseMoved(new JeppeEventHandler());
        
        
    }    
    
    class JeppeEventHandler implements EventHandler<MouseEvent>
    {

        @Override
        public void handle(MouseEvent event) {
            ((Label)event.getTarget()).setText("Jeppe");
            System.out.println("Jeppe handled the event");
        }
    
    }
    
}
