/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multipleinherit;

/**
 *
 * @author mariumyounus
 */
public class twoclass extends classone implements first,second{

    @Override
    public void show_first() {
        System.out.println("show first class");
    }

    @Override
    public void show_second() {
        System.out.println("show second class");
    }
    
}
