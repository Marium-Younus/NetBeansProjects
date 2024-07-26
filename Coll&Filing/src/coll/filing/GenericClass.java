/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coll.filing;

/**
 *
 * @author mariumyounus
 */
public class GenericClass <T> {
 T a;
    public GenericClass(T b)
            {
            this.a=b;
            }
    public void print()
    {
    
        System.out.println("My result is"+a);
    }
}
