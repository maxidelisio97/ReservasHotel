/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ferc
 */


  public class Conexion {
    
    
    
    private static final String url="jdbc:mysql://localhost:3306/db_habitaciones?serverTimezone=UTC";
    private static final String user="root";
    private static final String pass="";
     Connection conn;
    
    public Connection Conectar(){
        
        try {
       //   Class.forName("org.mariadb.jdbc.Driver");
          
            conn=DriverManager.getConnection(url,user,pass);
            
                       
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }      
        return conn;
    }
  }