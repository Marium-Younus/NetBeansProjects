/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author mariumyounus
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student jack = new Student();
                Student jill = new Student();
                
                jack.name ="Jack";
                jack.age= 18;
                
                jill=jack;
                jill.name ="jill";
                System.out.println("JackName:"+jack.name);
    }
    
}
