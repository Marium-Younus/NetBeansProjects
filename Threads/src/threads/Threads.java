/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

/**
 *
 * @author mariumyounus
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new NewClass("Aptech").start();
       new NewClass("Education").start();
    }
    
}
