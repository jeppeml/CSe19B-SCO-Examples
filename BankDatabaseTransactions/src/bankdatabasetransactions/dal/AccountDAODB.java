/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankdatabasetransactions.dal;

import bankdatabasetransactions.be.Account;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class AccountDAODB implements IAccountDAO{

    @Override
    public void withdraw(Account account, double amount) {
        
    }

    @Override
    public List<Account> getAll() {
        /*"SELECT * FROM Accounts"
        try(Connection con = ){
        }*/
        return null;
    }
    
}
