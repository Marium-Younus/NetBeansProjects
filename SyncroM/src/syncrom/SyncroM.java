/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package syncrom;

/**
 *
 * @author mariumyounus
 */
public class SyncroM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CallMe od=new CallMe();
      Duster dus=new Duster(od, "Marium");
     Duster de=new Duster(od, "younus");
    }
    
}
