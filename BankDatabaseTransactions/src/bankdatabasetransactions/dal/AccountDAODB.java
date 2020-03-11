/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankdatabasetransactions.dal;

import bankdatabasetransactions.be.Account;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import static java.sql.Connection.*;


public class AccountDAODB implements IAccountDAO{
    DBConnector dbConnect = new DBConnector();
    
    @Override
    public void withdraw(Account account, double amount) {
        try(Connection con = dbConnect.getConnection()){
            con.setAutoCommit(false); // Enable transactions
            con.setTransactionIsolation(TRANSACTION_REPEATABLE_READ);
            
            String sql = "SELECT Amount from Accounts WHERE id=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, account.getId());
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                float balance = rs.getFloat("amount");
                float newBalance = balance - (float)amount;
                
                String sqlUpdate = "UPDATE Accounts SET amount=? WHERE id=?";
                PreparedStatement pstmt2 = con.prepareStatement(sqlUpdate);
                pstmt2.setFloat(1, newBalance);
                pstmt2.setInt(2, account.getId());
                pstmt2.executeUpdate();
                
                con.commit(); // Commits the entire transaction
                account.setBalance(newBalance);
            }
            con.setAutoCommit(true); // Enable transactions
            con.setTransactionIsolation(TRANSACTION_NONE);
            
            
            
        } catch (SQLServerException ex) {
            Logger.getLogger(AccountDAODB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Account> getAll() {
        List<Account> accounts = new ArrayList();
        String sql = "SELECT * FROM Accounts";
        
        try(Connection con = dbConnect.getConnection()){
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                Account acc = new Account();
                acc.setId(rs.getInt("id"));
                acc.setBalance(rs.getFloat("amount"));
                acc.setName(rs.getString("name"));
                
                accounts.add(acc);
            }
            return accounts;
            
        } catch (SQLServerException ex) {
            Logger.getLogger(AccountDAODB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
