/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadspractice;

/**
 *
 * @author mariumyounus
 */
public class ThreadsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new NewClass("Marium").start();
        new NewClass("Younus").start();
    }
    
}
