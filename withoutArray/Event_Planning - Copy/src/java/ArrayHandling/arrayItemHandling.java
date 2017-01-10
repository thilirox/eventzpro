/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayHandling;

import DatabaseOperations.agentOutputHandling;
import DatabaseOperations.dbConnection;

import static java.lang.Integer.parseInt;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thilini.Samaranayake
 */
public class arrayItemHandling {
    
      public static float totalPack=0;
      public static int i=0;
    
  // public ArrayList sortedOutput = new ArrayList();
    agentOutputHandling obj = new agentOutputHandling();
    
   public void getIntialResultList() throws SQLException{
    ResultSet resultSet= obj.getInitial();
             
             while(resultSet.next()){
                 String agentResult = resultSet.getString("agentout");
                 System.out.print("vvvvvvvvvvvvvvvvvv"+agentResult);
                 splitArray(agentResult);
             }
    
   }
    public void splitArray (String Item) {
        String fullOutput = "";
        
        String[] ItemList = Item.split(",");
        Arrays.sort(ItemList);
        
        for(int x=0;x<ItemList.length; x++){
            
            SplitItem(ItemList[x]);
        
            fullOutput = fullOutput+","+ItemList[x];
            
            if(x==ItemList.length-1){
                
                try{
                //obj.createTempTable();
           
                obj.saveResults(fullOutput, totalPack);
           
                System.out.println(fullOutput);
             }
                
               catch( Exception ex) {//(//SQLException e){
                //  Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
                                    }
                
            totalPack=0;
            }
        
            }}
        // System.out.println(fullOutput);
     //   System.out.println("....................................");
        
//          sortedOutput.add(fullOutput);
//          ArrayOut.getInstance().add(fullOutput);
    
     
    public void SplitItem(String Item){
         
        String[] ItemDetails = Item.split("-");
       // System.out.println("XXXXXXXXXXXXXXXXXxxxx");
       // System.out.println(ItemDetails[2]);
        
       String packVal = ItemDetails[2].replaceAll("[,)]", "");
         float Pvalue = Float.parseFloat(packVal);
         
         totalPack = totalPack+Pvalue;
         //  System.out.println(totalPack);
     //  System.out.println("XXXXXXXXXXXXXXXXXxxxx");
    
    
    
    
    }
      
    
    
}
