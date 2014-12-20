/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.blits.tugaskoneksijess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Koneksi {
     public Statement state;
    public Connection connect;
    public String url = "jdbc:mysql://localhost/db_keretaapi";
    
    public void koneksiDatabase(){
        try {
            connect = DriverManager.getConnection(url,"root","123");//nama database, username database, password database
            System.out.println("Koneksi Berhasil");
            state = connect.createStatement();
        } catch (SQLException ex) {
             System.err.println("SQLException:"+ex.getMessage());
        }
    }
}
