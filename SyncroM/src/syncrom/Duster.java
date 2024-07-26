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
public class Duster implements Runnable{
    
    String ms;
    Thread th;
    CallMe cm;
public Duster(CallMe m,String str)
{
ms=str;
cm=m;
th=new Thread(this);
th.start();


}
    @Override
    public void run() {
        cm.call(ms);
    }
    
    
            
    
    
    
}
