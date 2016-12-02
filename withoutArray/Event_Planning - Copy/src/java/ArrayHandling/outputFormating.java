/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayHandling;

//import java.sql.Array;
import java.util.Arrays;

/**
 *
 * @author Thilini.Samaranayake
 */
public class outputFormating {
    
    public String[] splitOutput (String Item) {
        
        String[] ItemList = Item.split(",");
        Arrays.sort(ItemList);
        return ItemList;
        
//        for(int x=0;x<ItemList.length; x++){
//            //System.out.println("bbbbbbbbbbbbbb");
//            System.out.println(ItemList[x]);
//          //  SplitoutItems(ItemList[x]);
//        
//        }
    }
    
     public String[] SplitoutItems(String Item){
         
        String[] ItemDetails = Item.split("-");
        return ItemDetails;
       // System.out.println("NNNNNNNNNNN");
    
      //  String pack = ItemDetails[2].replaceAll("[()]",""); 
       // String pack2 = ItemDetails[2].replaceAll("[,)]", "");
         // System.out.println(pack +"  kkkkkkkkkkk");
         // System.out.println(ItemDetails.length);
        
    
}
}