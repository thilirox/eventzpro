/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class customerMessages {
   PreparedStatement sqlStatement= null;
   ResultSet resultset = null;
   dbConnection con = new dbConnection();
   
   public void addCustomerMessage(String to , String Message , String header) throws SQLException {
   
     sqlStatement = con.connection.prepareStatement("INSERT INTO cusmessage(mesTo,heading,msgbody) VALUES (?,?,?)");
     try{
                 sqlStatement.setString(1, to );
                sqlStatement.setString(2, header );
                sqlStatement.setString(3, Message );
                 sqlStatement.executeUpdate();
                 // con.connection.close();
                   }
             catch (SQLException e){
     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
   
   
   }}
      public ResultSet getCustomerMsg(String service) throws SQLException{
    try{
    String sql= "select * from cusmessage where MesTo= '"+ service +"'; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    }
          
    
    
   }
