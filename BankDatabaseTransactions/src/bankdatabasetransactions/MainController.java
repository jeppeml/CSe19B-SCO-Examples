/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankdatabasetransactions;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainController implements Initializable {
    
    @FXML
    private TableView<Account> tableAccounts;
    @FXML
    private TableColumn<Account, Integer> columnId;
    @FXML
    private TableColumn<Account, String> columnName;
    @FXML
    private TableColumn<Account, Double> columnBalance;
    
    @FXML
    private TextField txtAmount;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        columnId.setCellValueFactory(
                cell->cell.getValue().idProperty().asObject());
        
        columnName.setCellValueFactory(
                cell->cell.getValue().nameProperty());
        
        columnBalance.setCellValueFactory(
                cell->cell.getValue().balanceProperty().asObject());
        Account acc = new Account();
        acc.setId(5);
        acc.setName("Piotr Stegovski");
        acc.setBalance(-45001);
        tableAccounts.getItems().add(acc);
    }    

    @FXML
    private void handleWithdraw(ActionEvent event) {
    }
    
}
