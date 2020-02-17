/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankdatabasetransactions.dal;

import bankdatabasetransactions.be.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class AccountDAOMock implements IAccountDAO{
    private List<Account> accounts = new ArrayList<>();

    public AccountDAOMock() {
        Account acc = new Account();
        acc.setId(5);
        acc.setName("Piotr Stegovski");
        acc.setBalance(-45001);
        
        accounts.add(acc);
        
        Account acc2 = new Account();
        acc2.setId(7);
        acc2.setName("Jeppe Ledinov");
        acc2.setBalance(23_445_001);
        
        accounts.add(acc2);
    }

    @Override
    public void withdraw(Account account, double amount) {
        double result = account.getBalance()-amount;
        account.setBalance(result);
    }

    @Override
    public List<Account> getAll() {
        return accounts;
    }
    
}
