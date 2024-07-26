/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstraction;

/**
 *
 * @author mariumyounus
 */
public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape r1=new Rectangle();
        r1.display();
       
        Shape c1=new Circle();
        c1.display();
        
        
        Shape T1=new Triangle();
        T1.display();
     /*  String str;
 	str = "Foolish boy.";
 	System.out.println(str.substring(3));

      */
      
    }
    
}
