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
public class OverView extends abc implements Property,Interface2{

    @Override
    public void shape() {
        System.out.println("circle has round in shape");
    }

    @Override
    public void area() {
        
        System.out.println("circle has no area");
        
            }

    @Override
    public void likeshape() {
           
        System.out.println("i like the shape of circle");
    
    }
    
}
