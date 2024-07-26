/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaltest;

/**
 *
 * @author mariumyounus
 */
public class PracticalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SplahPage mysp= new SplahPage();
       mysp.setVisible(true);
     
       WellcomePage wp= new WellcomePage();    
       
        try {
            for (int i = 1; i <=100; i++) {
                Thread.sleep(10);
                mysp.PROBAR.setText(""+i+"%"); 
               
                if(i==100)
                {
                    mysp.setVisible(false);
                    wp.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
    
}
