/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package syncrom;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mariumyounus
 */
public class CallMe {
    
    synchronized public void call(String m)
    {
  
        System.out.print("["+m);
    try
    {
    Thread.sleep(1000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    
    }
        System.out.print("]");
    
    }
}
