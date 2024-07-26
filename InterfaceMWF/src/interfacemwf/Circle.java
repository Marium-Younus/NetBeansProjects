/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacemwf;

/**
 *
 * @author mariumyounus
 */
public class Circle implements Property{

    @Override
    public void shape() {
        System.out.println("Circle has round in shape");
    }

    @Override
    public void area() {
         System.out.println("circle has no area");
    }
    
    
    
    
    
}
