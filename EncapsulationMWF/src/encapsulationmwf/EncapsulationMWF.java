/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulationmwf;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg;

/**
 *
 * @author mariumyounus
 */
public class EncapsulationMWF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        C2 cobj =new C2();
        cobj.abc();
           
      /* Circle cir =new  Circle();
       cir.Shape();*/
        int i =5;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
     
    }
    
}
