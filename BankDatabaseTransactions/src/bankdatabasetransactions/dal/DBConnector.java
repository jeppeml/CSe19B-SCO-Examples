/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankdatabasetransactions.dal;
import com.microsoft.sqlserver.jdbc.*;
import java.sql.Connection;
/**
 *
 * @author jeppjleemoritzled
 */
public class DBConnector {
    SQLServerDataSource ds = new SQLServerDataSource();

    public DBConnector() {
      ds.setDatabaseName("﻿CSe19B_40_BankTransaction");
      ds.setUser("CSe19B_40");
      ds.setPassword("CSe19B_40");
      ds.setPortNumber(1433);
      ds.setServerName("10.176.111.31");
    }
    
    public Connection getConnection() throws SQLServerException{
        return ds.getConnection();
    }
    
}
