/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Constructor;

import java.util.Scanner;

/**
 *
 * @author mariumyounus
 */
public class Class1 {
    Scanner s1=new Scanner(System.in);

    Class1()
    {
    
        System.out.println("This is constructor class");
    
    
    
    }
    public void Class1(int a,int b)
    {

        System.out.println("Enter number1:");
          a=s1.nextInt();
          System.out.println("Enter number2:");
          b=s1.nextInt();
          int c=a+b;
          System.out.println("My sum result is"+c);
          
    
    }
    public int Class1(int a,int b,int c)
    {

        System.out.println("Enter number1:");
          a=s1.nextInt();
          System.out.println("Enter number2:");
          b=s1.nextInt();
           c=a+b;
          System.out.println("My sum result is"+c);
          return a+b;
    
    }    
    /*  public int Class1()
    {

        return 0;
    
    }
      */
}
