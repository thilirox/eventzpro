/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperations;
import java.sql.Date;
import java.sql.PreparedStatement;
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
public class serviceReqHandling {
    
    PreparedStatement sqlStatement= null;
    ResultSet resultset = null;
    dbConnection con = new dbConnection();
    
   
   public String setCustomerReq(String CID,Date Reqdate, int guests, String ServiceID,
            String PackageID , String ContName, String ContEmail){
        try{
    sqlStatement = con.connection.prepareStatement("INSERT INTO tblservicereq(ReqID,CusID,ReqDate,NoOfGuests,ReqStatus,ServiceID,PackageID,ContNo,ContName,contEmail) VALUES (?,?,?,?,?,?,?,?,?,?);");
   
     String S = new SimpleDateFormat("MMddyyHH:mm:ss").format(Calendar.getInstance().getTime());

    String reqId= "REQ"+S;   
    sqlStatement.setString(1, reqId );
    sqlStatement.setString(2, CID );
    sqlStatement.setDate(3, Reqdate);
    sqlStatement.setInt(4, guests);
    sqlStatement.setString(5, "Requested");
    sqlStatement.setString(6, ServiceID );
    sqlStatement.setString(7, PackageID );
    sqlStatement.setInt(8, 12345 );
    sqlStatement.setString(9, ContName);
    sqlStatement.setString(10, ContEmail);


        sqlStatement.executeUpdate();
        return "Success";
        }

///
 catch (SQLException e){
     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
  return "Error";
 }
        
    
    } 
   public ResultSet getCustomerReqs(String service){
   try{   

    String sql= "select * from tblservicereq where ServiceID= '"+ service  +"' AND CustomerRequested= true; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    } 
   public ResultSet getCustomerReq(String service, String ReqID){
  
    
     try{   

    String sql= "select * from tblservicereq where ServiceID= '"+ service  +"' AND ReqId= '"+ReqID+"' ; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    }   
   public void setServiceConfirm(String reqID) throws SQLException{
    String sql = "UPDATE tblservicereq SET ReqStatus= 'Confirmed' WHERE ReqId= '"+reqID+"' ;";
    sqlStatement = con.connection.prepareStatement(sql);
    int updated=sqlStatement.executeUpdate();
    if (updated>0){
    System.out.println("updated");
    }
   
    }
   public void setServicePending(String reqID) throws SQLException{
    String sql = "UPDATE tblservicereq SET ReqStatus= 'Pending' WHERE ReqId= '"+reqID+"' ;";
    sqlStatement = con.connection.prepareStatement(sql);
    int updated=sqlStatement.executeUpdate();
    if (updated>0){
    System.out.println("updated");
    }
   
    }
   public void setServiceComplete(String reqID) throws SQLException{
    String sql = "UPDATE tblservicereq SET ReqStatus= 'Complete' WHERE ReqId= '"+reqID+"' ;";
    sqlStatement = con.connection.prepareStatement(sql);
    int updated=sqlStatement.executeUpdate();
    if (updated>0){
    System.out.println("updated");
    }
   
    }
   public ResultSet getServiceConfirm(String service) throws SQLException{
    try{
    String sql= "select * from tblservicereq where ServiceID= '"+ service  +"' AND ReqStatus= 'Confirmed'; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    }
   public ResultSet getServiceRequested(String service) throws SQLException{
    try{
    String sql= "select * from tblservicereq where ServiceID= '"+ service  +"' AND ReqStatus= 'Requested'; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    } 
   public ResultSet getServicePending(String service) throws SQLException{
    try{
    String sql= "select * from tblservicereq where ServiceID= '"+ service  +"' AND ReqStatus= 'Pending'; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    }
   public ResultSet getServiceCompleted(String service) throws SQLException{
    try{
    String sql= "select * from tblservicereq where ServiceID= '"+ service  +"' AND ReqStatus= 'Completed'; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultset;
    }
   public int getReqCount(String Service , String status) throws SQLException{
   int count =0;
    try{
    String sql= "select count(*) from tblservicereq where ServiceID= '"+ Service  +"' AND ReqStatus= '"+status+"'; " ;
    System.out.println(sql);
    Statement stat = con.connection.createStatement();
     resultset = stat.executeQuery(sql);
     while(resultset.next()){
          count = resultset.getInt("count(*)");
         
     }
    }
     catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   return count;
   }
   public ResultSet getServicStatus(String CusId)throws SQLException{
   
    try{
    String sql= "select * from tblservicereq where CusId= '"+ CusId +"'; " ;
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