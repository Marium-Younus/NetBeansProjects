/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splashwork;

/**
 *
 * @author mariumyounus
 */
public class SplashWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MySplash mysp= new MySplash();
       mysp.setVisible(true);
       Nextpage np= new Nextpage();
                
       
        try {
            for (int i = 1; i <=100; i++) {
                Thread.sleep(50);
                mysp.loading.setText(""+i+"%");
                mysp.jProgressBar1.setValue(i);
                if(i==100)
                {
                    mysp.setVisible(false);
                    np.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
    
}
