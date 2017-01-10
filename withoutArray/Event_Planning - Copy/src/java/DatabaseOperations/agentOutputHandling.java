/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperations;

import ArrayHandling.ArrayOut;
import ArrayHandling.outputFormating;
import DatabaseOperations.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Thilini.Samaranayake
 */
public class agentOutputHandling {

    PreparedStatement sqlStatement = null;
    ResultSet resultset = null;
    dbConnection con = new dbConnection();

    public void saveInitial(String pack) {
        int index = 0;

        try {
            sqlStatement = con.connection.prepareStatement("INSERT INTO initialoutput(agentout) VALUES (?)");

            sqlStatement.setString(1, pack);

            sqlStatement.executeUpdate();
            // con.connection.close();
        } catch (SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    public ResultSet getInitial() {
        ResultSet reset = null;
        try {
            String sql = "select * from initialoutput GROUP BY agentout;";
            Statement stat = con.connection.createStatement();
            reset = stat.executeQuery(sql);
            return reset;
        } // 
        catch (SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
            return reset;
        }

    }

    public void saveResults(String pack, float cost) throws SQLException {
        int index = 0;
        outputFormating format = new outputFormating();

        try {
            sqlStatement = con.connection.prepareStatement("INSERT INTO agentoutput(packageDe,Cost) VALUES (?,?)");

            sqlStatement.setString(1, pack);
            sqlStatement.setFloat(2, cost);
            sqlStatement.executeUpdate();
            // con.connection.close();
        } catch (SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
        }
            String ForPdetails = pack.replaceFirst(Pattern.quote(","), "");
            String[] outarray = format.splitOutput(ForPdetails.trim());
            for (int y = 0; y < outarray.length; y++) {
                String Val = outarray[y].replaceAll("-", ",").trim();
                String[] ItemDetails = format.splitOutput(Val);
                int length = ItemDetails.length;
                String ServiceName = ItemDetails[0].replaceAll("[(]", "").trim();
               try{
                saveSepServices(ServiceName);
               }
               catch(SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        }
    }

    public void saveSepServices(String Service) throws SQLException {

        try {
            sqlStatement = con.connection.prepareStatement("INSERT INTO selectserv(ServiceName) VALUES (?)");

            sqlStatement.setString(1, Service);
            // sqlStatement.setFloat(2, cost );
            sqlStatement.executeUpdate();
            // con.connection.close();
        } catch (SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);

        }

    }

    public void clearResults() {
        try {
            sqlStatement = con.connection.prepareStatement("DELETE FROM agentoutput;");
            sqlStatement.executeUpdate();
            //con.connection.close();
        } catch (SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);

        }
        try {
            sqlStatement = con.connection.prepareStatement("DELETE FROM initialoutput;");
            sqlStatement.executeUpdate();
            //con.connection.close();
        } catch (SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);

        }
        
         try {
            sqlStatement = con.connection.prepareStatement("DELETE FROM selectserv;");
            sqlStatement.executeUpdate();
            //con.connection.close();
        } catch (SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    public ResultSet displayResults() throws SQLException {
        ResultSet reset;

        String sql = "select * from agentoutput GROUP BY packageDe Order by cost asc;";
        Statement stat = con.connection.createStatement();
        reset = stat.executeQuery(sql);

        return reset;

        // 
// catch (SQLException e){
//     Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
// }
    }

    public int countResults() throws SQLException {

        ResultSet count = null;
        int result=0;
        String sql = "select count( distinct packageDe) as 'noFRecords' from agentoutput;";
        Statement stat;
        try {
            stat = con.connection.createStatement();
            count = stat.executeQuery(sql);
            while (count.next()){
              result =count.getInt("noFRecords");
            }
        } catch (SQLException ex) {
            Logger.getLogger(agentOutputHandling.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }
    
     public int countFlitered( String max) throws SQLException {

        ResultSet count = null;
        int result=0;
        String sql = "select count( distinct packageDe) as 'noFRecords' from agentoutput where cost<'"+ max +"' ;";
        Statement stat;
        try {
            stat = con.connection.createStatement();
            count = stat.executeQuery(sql);
            while (count.next()){
              result =count.getInt("noFRecords");
            }
        } catch (SQLException ex) {
            Logger.getLogger(agentOutputHandling.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }
    public int getmaxMin(String type) throws SQLException {
    ResultSet reset;
    int ans=0;

        String sql = "SELECT "+ type+"(cost) AS OrderPrice FROM agentoutput;";
        Statement stat = con.connection.createStatement();
        reset = stat.executeQuery(sql);
        while(reset.next()){
        ans = reset.getInt("OrderPrice");
        }
        return ans;
        
    
}

public ResultSet filterResults(String max) throws SQLException {
    ResultSet reset;
    int ans=0;

          String sql = "select * from agentoutput where cost<'"+ max +"' GROUP BY packageDe Order by cost asc;";
          System.out.println(sql);
        Statement stat = con.connection.createStatement();
        reset = stat.executeQuery(sql);
        
        return reset;
        
    
}
}
