/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperations;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thilini.Samaranayake
 */
public class userHandling {
    PreparedStatement sqlStatement= null;
    ResultSet resultset = null;
    dbConnection con = new dbConnection();
    
    
    public ResultSet getUser (String UN){
     try{   

    String sql= "select * from user where UName='"+UN+"'; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    }
    
    public String getUser (String Email , String PW){
         String userT="" ;
     try{   
      
        
    String sql= "select * from user where Email ='"+Email+"' AND PassWord='"+PW+"'; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     while(resultset.next()){
          userT = resultset.getString("Type").toString();
          System.out.println(userT);
         return userT;
        }
     }
     catch (SQLException ex) {
         
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     return userT;
   
    }
    public String addUser (String fname , String lname,String un , String pw ,String email, int Contact,String type ,String City  ) throws SQLException{
          
        try {sqlStatement = con.connection.prepareStatement( "INSERT INTO user(UId,FirstName,LastName,UName,"
                   + "                                                  PassWord,Email,MobileNo,Type,City)VALUES (?,?,?,?,?,?,?,?,?)" ) ;
             
          String S = new SimpleDateFormat("yyHHmmss").format(Calendar.getInstance().getTime());
            int Uid = Integer.parseInt(S);
           
            sqlStatement.setInt(1,Uid);
            sqlStatement.setString(2, fname);
            sqlStatement.setString(3, lname);
            sqlStatement.setString(4, un);
            sqlStatement.setString(5, pw);
            sqlStatement.setString(6, email);
            sqlStatement.setInt(7, Contact);
            sqlStatement.setString(8, type);
            sqlStatement.setString(9, City);
             sqlStatement.executeUpdate();
            return "Success";
        }
        catch (SQLException ex) {
         
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
            return "error";
        }
    
    }
    public ResultSet getUserDetails(String Email , String PW){
    
     try{   
    String sql= "select * from user where Email ='"+Email+"' AND PassWord='"+PW+"'; " ;
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
