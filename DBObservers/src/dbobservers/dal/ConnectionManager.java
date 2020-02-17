/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbobservers.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

/**
 *
 * @author jeppjleemoritzled
 */
public class ConnectionManager {
    private SQLServerDataSource ds = new SQLServerDataSource();
    public ConnectionManager(String databaseName) {
        ds.setDatabaseName(databaseName);
        ds.setUser("CSe19B_40");
        ds.setPassword("CSe19B_40");
        ds.setPortNumber(1433);
        ds.setServerName("10.176.111.31");
    }
    
    public Connection getConnection() throws SQLServerException{
        return ds.getConnection();
    }
    
}
