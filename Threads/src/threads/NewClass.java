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
public class NewClass extends Thread{
    
    public NewClass(String str)
    
    {
    super(str);
    }
    
    
    public void run()
    {
    
    
    for(int i=0;i<10;i++)
    {
    
        System.out.println(i+" "+getName());
       
    try
    {
        sleep(10000);
    }
    catch(InterruptedException e)
    {}
    
        System.out.println("Done"+getName());
    }
}}
