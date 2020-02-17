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
public interface IAccountDAO {
    public void withdraw(Account account, double amount);
    public List<Account> getAll();
}
