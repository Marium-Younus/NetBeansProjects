/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genericsmwf;

/**
 *
 * @author mariumyounus
 */
public class Generics<T>{
    
    
    T a;
    public void abc(T b,T g)
    {
    
        System.out.println("My value is"+a);
        System.out.println("The value of"+b+","+g );
    
    
    }
    
    public <Y> void  xyz(Y j,Y o)
    {
    
    
        System.out.println(j);
        System.out.println(o);
    
    
    
    }
    
    
    
    public <p> void printarray(p[] t1)
    {
    
    for(p a:t1)
    {
        System.out.println("My array is"+a);
    }
    
    }
   
    
    public  <P> void MNO(P a,P b)
    {
    
        System.out.println(""+a);
        System.out.println(""+b);
    
    
    

    }
    }
    
    

