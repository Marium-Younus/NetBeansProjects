/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plymorphism;

/**
 *
 * @author mariumyounus
 */
public class Plymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        overloading ov1 = new overloading();
        ov1.overload();
      ov1.overload(10, 5.5f);
      ov1.overload(12,45);
      //  ov1.triangleArea(12.5f, 10.5f);
    
    }
        
        /*overriding or1=new overriding();
        {
        or1.overload(25, 5);
        
        }*/
    }
    

