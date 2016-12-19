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
 * @author Thilini.Samaranayake
 */

public class servicePackageHandling {
    PreparedStatement sqlStatement= null;
    ResultSet resultset = null;
    dbConnection con = new dbConnection();
    
    public ResultSet selectPackage (String service,String pname){
     try{   

    String sql= "select * from tblpackages,tblservices where PName='"+pname+ "' AND tblpackages.SName='"+service+"' AND tblpackages.SName=tblservices.SName; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
    
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    }

    public ResultSet selectPackageDetails (String service, String pname){
    
     try{

    String sql= "select * from tblpackages,tblpkoptions where tblpackages.PName='"+pname+ "' AND tblpackages.SName='"+service+"' AND tblpackages.SName=tblpkoptions.SName; " ;
    System.out.println(sql);  
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    }
    
    public ResultSet getAllServiceTypes(){
     try{

    String sql= "select DISTINCT Type from tblservices; " ;
    System.out.println(sql);  
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    
    }
    
    public ResultSet getAllServiceNames(String sType){
     try{

    String sql= "select DISTINCT SName from tblservices where Type= '"+sType+"';" ;
    System.out.println(sql);  
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    
    }
    
    public ResultSet getAllPackageNames (String service){
     try{   

    String sql= "select * from tblpackages where SName='"+service+"'; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
    
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    }
    
    public void SaveImages(String service, String ImageURI){
    try {
            sqlStatement = con.connection.prepareStatement("INSERT INTO tblpckimages(ServiceID,ImagePath) VALUES (?,?)");
     
                 sqlStatement.setString(1, service );
                sqlStatement.setString(2, ImageURI );
                 sqlStatement.executeUpdate();
                 // con.connection.close();
                   }
             catch (SQLException e){
     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
 
 }
    
    }
    
    public ResultSet GetImages(String service){
    try{   

    String sql= "select * from tblpckimages where ServiceID='"+service +"'; " ;
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
    

