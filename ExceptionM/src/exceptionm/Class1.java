
package exceptionm;


public class Class1 {
    public void abc(){
    
    int a,b;
    
    
    try{
       
        b=6;
        a=23/b;
        System.out.println("My number is divided");
    }
    catch(ArithmeticException ex)
    {
        System.out.println("number is not divided");
    
    }
    finally{
    
        System.out.println("this code must execute");
    }
    
    }
    
}
