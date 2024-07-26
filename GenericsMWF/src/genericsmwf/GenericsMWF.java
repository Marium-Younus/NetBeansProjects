/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genericsmwf;

/**
 *
 * @author mariumyounus
 */
public class GenericsMWF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Generics<Object> g1=new Generics<>();
        System.out.println(g1.a=8);
        g1.abc(56, 90);
        g1.abc("Alpha","Bravooooooooooooooooooooooooo");
        g1.xyz("Aptech", "Education");
        
        Generics<String> st= new Generics<>();
        st.abc("Marium", "younus");
    Generics<Integer> g3=new Generics<>();
    g3.MNO(67, 90);
   
    String[] str={ "1","2","3"};
    g1.printarray(str);
    
    }
    
}
