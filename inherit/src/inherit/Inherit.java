/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inherit;

/**
 *
 * @author mariumyounus
 */
public class Inherit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cat c1= new cat();
        c1.type();
        c1.sound();
        
        dog d1=new dog();
        d1.eyecolor="pink";
        System.out.println("dog eye color is"+d1.eyecolor);
        System.out.println(c1.eyecolor);
        animal a1= new animal();
        System.out.println(a1.eyecolor);
         dog1 obd1=new dog1();
        obd1.b1();
              
    }
    
}
