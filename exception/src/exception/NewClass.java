/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exception;

/**
 *
 * @author mariumyounus
 */
public class NewClass {
    
    public void abc(){
   
    
    
    
    
int d, a; 
try { // monitor a block of code. 
d = 2; 
a = 42 / d; 
System.out.println("This will not be printed."); 
} 


        
    
        catch (ArithmeticException e) { // catch divide-by-zero 

System.out.println("Division by zero."); 
} 
finally{
System.out.println("After catch statement."); }
} 
 
    
}
