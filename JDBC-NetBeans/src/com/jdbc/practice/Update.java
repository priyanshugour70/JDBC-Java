/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author priyanshugour70
 */
public class Update {
    
    public static void main(String[] args) {
        try {
            
            Connection con = ConnectionProvider.getConnection();
            
            String q = "update student set sName = ?, sCity = ? where sId = ?";
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter new Name : ");
            String name = br.readLine();
            
            System.out.println("Enter new City Name : ");
            String city = br.readLine();
            
            
            System.out.println("Enter the Student id : ");
            int id = Integer.parseInt(br.readLine());
            
            
            PreparedStatement pstmt = con.prepareStatement(q);
            
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            
            pstmt.setInt(3, id);
            
            pstmt.executeUpdate();
            
            System.out.println("Done.. Updated ... ");
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
    }
    
    
    
}
