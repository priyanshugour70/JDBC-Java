/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author priyanshugour70
 */
public class ConnectionProvider {
    
    
    private static Connection con;
    
    public static Connection getConnection(){
        
        try {
            if(con == null){
                
                Class.forName("com.cj.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Harda@20p");
            }
   
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return con;
    }
    
    
}
