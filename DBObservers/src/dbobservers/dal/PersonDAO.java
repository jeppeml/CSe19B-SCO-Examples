/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbobservers.dal;

import dbobservers.be.Person;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jeppjleemoritzled
 */
public class PersonDAO {
    ConnectionManager conMan = new ConnectionManager("CSe2019_DBObs");

    public PersonDAO() {
    }
    
    public Person create(Person p){
        String sql = "INSERT INTO Persons (name, occupation, last_change) VALUES (?,?,?)";
        try(Connection con = conMan.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);){
            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getOccupation());
            pstmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                p.setId(rs.getInt(1));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean delete(Person p) {
        String sql = "DELETE FROM Persons WHERE ";
        try(Connection con = conMan.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);){
            int updatedRows = pstmt.executeUpdate();
            return updatedRows>0;
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean update(Person p){
        String sql = "UPDATE Persons SET name=?, occupation=?, last_change=? WHERE id=?";
        try(Connection con = conMan.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);){
            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getOccupation());
            pstmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            pstmt.setInt(4, p.getId());
            int updatedRows = pstmt.executeUpdate();
            return updatedRows>0;
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Person> getAll(){
        ArrayList persons = new ArrayList();
        String sql = "SELECT FROM Persons *";
        try(Connection con = conMan.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setOccupation(rs.getString("occupation"));
                p.setLastChange(rs.getTimestamp("last_change").toLocalDateTime());
                persons.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }
    
    public List<Person> getChangesAfter(LocalDateTime timestamp){
        ArrayList persons = new ArrayList();
        String sql = "SELECT * FROM persons WHERE last_change>?";
        try(Connection con = conMan.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setTimestamp(1, Timestamp.valueOf(timestamp));
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setOccupation(rs.getString("occupation"));
                p.setLastChange(rs.getTimestamp("last_change").toLocalDateTime());
                persons.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }
}
