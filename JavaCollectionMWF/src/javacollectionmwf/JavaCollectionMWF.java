/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacollectionmwf;

import java.util.ArrayList;

/**
 *
 * @author mariumyounus
 */
public class JavaCollectionMWF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> al1=new ArrayList<String>();
       al1.add("abc");
       al1.add("xyz");

       System.out.println("ArrayList before clear: "+al1);
       al1.clear();
       System.out.println("ArrayList after clear: "+al1);

       ArrayList<String> al2=new ArrayList<String>();
       al2.add("text 1");
    

       System.out.println("ArrayList before removeAll: "+al2);
       al2.removeAll(al2);
       System.out.println("ArrayList before removeAll: "+al2); 
    }
    
}
