/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiple_inheritance;

/**
 *
 * @author hina
 */
public class Multiple_inheritance implements showable{

    
       
    public void print()
    {
        System.out.println(" print mehtod of printable class");
    }
      
    
    public void show()
    {
        System.out.println("show mehtod of showable class");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Multiple_inheritance mi=new Multiple_inheritance();
        mi.print();
        mi.show();
        
        
    }
    
}
