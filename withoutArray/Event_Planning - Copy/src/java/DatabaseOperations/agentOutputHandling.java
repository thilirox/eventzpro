/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperations;
import ArrayHandling.ArrayOut;
import DatabaseOperations.dbConnection;
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
public class agentOutputHandling {
    PreparedStatement sqlStatement= null;
    ResultSet resultset = null;
    dbConnection con = new dbConnection();
    
    
public void saveInitial(String pack ){
     int index = 0;
     
        try {
            sqlStatement = con.connection.prepareStatement("INSERT INTO initialoutput(agentout) VALUES (?)");
     
                 sqlStatement.setString(1, pack );
                
                 sqlStatement.executeUpdate();
                 // con.connection.close();
                   }
             catch (SQLException e){
     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
 
 }}

public ResultSet getInitial() {
    ResultSet reset = null;
 try{
    String sql= "select * from initialoutput GROUP BY agentout;";
    Statement stat = con.connection.createStatement();
     reset = stat.executeQuery(sql);
   return reset;
 }
 
  // 
 
 catch (SQLException e){
     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
     return reset;
 }


} 

public void saveResults(String pack , float cost ) throws SQLException{
     int index = 0;
     
        try {
            sqlStatement = con.connection.prepareStatement("INSERT INTO agentoutput(packageDe,Cost) VALUES (?,?)");
     
                 sqlStatement.setString(1, pack );
                 sqlStatement.setFloat(2, cost );
                 sqlStatement.executeUpdate();
                 // con.connection.close();
                   }
             catch (SQLException e){
     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
 
 }
        
 
}

public void clearResults(){
try {
            sqlStatement = con.connection.prepareStatement("DELETE FROM agentoutput;");
            sqlStatement.executeUpdate();
                 //con.connection.close();
                   }
             catch (SQLException e){
     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
 
 }
try {
            sqlStatement = con.connection.prepareStatement("DELETE FROM initialoutput;");
            sqlStatement.executeUpdate();
                 //con.connection.close();
                   }
             catch (SQLException e){
     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
 
 }
}

public ResultSet displayResults() throws SQLException{
    ResultSet reset;
 
    String sql= "select * from agentoutput GROUP BY packageDe Order by cost desc;";
    Statement stat = con.connection.createStatement();
     reset = stat.executeQuery(sql);
   return reset;
 
  // 
 
// catch (SQLException e){
//     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
// }


}

public ResultSet countResults() throws SQLException{

    ResultSet count = null;
String sql = "SELECT COUNT(*) AS Messages FROM agentoutput";
 Statement stat;
        try {
            stat = con.connection.createStatement();
            count = stat.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(agentOutputHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
     
   return count;

}
}



    
    

