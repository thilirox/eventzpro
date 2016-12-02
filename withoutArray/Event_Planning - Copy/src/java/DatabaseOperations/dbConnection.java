/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thilini.Samaranayake
 */
public class dbConnection 
{
    
    Properties properties = new Properties();
    String URL = "jdbc:mysql://localhost:3306/eventz?autoReconnect=true&useSSL=false";
    String USERNAME="root";
    String PASSWORD="Princess@2008"; 
    Connection connection ;
    
    public  dbConnection(){
         
         if( connection==null){
        try {
            
            properties.put("user", USERNAME);
            properties.put("password", PASSWORD);
            
            connection = DriverManager.getConnection(URL,properties);
            if( connection != null){
            System.out.println("Connected");
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         } 
        
     }
}