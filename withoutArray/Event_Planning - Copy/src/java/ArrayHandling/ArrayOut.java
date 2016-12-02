/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayHandling;

import java.util.ArrayList;

/**
 *
 * @author Thilini.Samaranayake
 */
public final class ArrayOut {

    private static final ArrayOut INSTANCE = new ArrayOut();
    private ArrayList List;
    arrayItemHandling obj = new arrayItemHandling();
    
    private ArrayOut() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static ArrayOut getInstance() {
        return INSTANCE;
    }

    /**
     * @return the List
     */
    public ArrayList getList() {
        return List;
    }

    /**
     * @param List the List to set
     */
    public void setList(ArrayList List) {
        this.List = List;
    }
    public void print(){
         for(int x=0; x< this.List.size(); x++){
            System.out.println(this.List.get(x));
         }}
    //
//    public void seperateArrayIndex(){
//        
//         for(int x=0; x< this.List.size(); x++){
//           String arrayItem = this.List.get(x).toString();
//           
//          //System.out.println("gggggggggggggggggggggggggggg");
//           obj.splitArray(arrayItem);
//         }
//    }

    public void add(String content) {
        System.out.println(content);
        if(this.List == null) this.List = new ArrayList();
        this.List.add(content);
        
         Object[] st =  this.List.toArray();
            for (Object s : st) {
              if ( this.List.indexOf(s) !=  this.List.lastIndexOf(s)) {
                   this.List.remove( this.List.lastIndexOf(s));
               }
            } 
    }
}