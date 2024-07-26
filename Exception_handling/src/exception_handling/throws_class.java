/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exception_handling;

import java.io.IOException;

/**
 *
 * @author hina
 */
public class throws_class {
    
    
void m()throws IOException
{
    throw new IOException("device error");

}

void n()throws IOException
{
    m();

}

void p()
{
    try
    {
        n();
    }
    catch(Exception e)
    {
        System.out.println("exception handle");
    }
}
   


}
