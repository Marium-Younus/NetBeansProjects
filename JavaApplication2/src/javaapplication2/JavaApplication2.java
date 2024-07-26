/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author mariumyounus
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1=new Scanner(System.in);
        
     /*   int [] arr={2,4,5,6,7,8};       //here arrray declare method 1
        for(int a=0;a<arr.length;a++)
        {
        
            System.out.println("My array result method 1  is "+arr[a]);
        }
        
        int [] arr1=new int[5];   //here arrray declare method2
        
        arr1[0]=2;
        arr1[1]=67;
        arr1[2]=88;
        arr1[3]=90;
        arr1[4]=12;
        System.out.println("My array result method 2  is "+arr1[0]);
        System.out.println("My array result method 2  is "+arr1[1]);
        System.out.println("My array result method 2  is "+arr1[2]);
        System.out.println("My array result method 2  is "+arr1[3]);
        System.out.println("My array result method 2  is "+arr1[4]);*/
        
        //same program using for loop
   /* int [] arr2=new int[5];  //here arrray declare method2
        
            System.out.print("Enter number");
            for(int z=0;z<arr2.length;z++)
                arr2[z]=s1.nextInt();
        for(int  b=0;b<arr2.length;b++)
        {   
            
            System.out.println("My reult is "+arr2[b]);
        }*/
        
        //table for user input
    /*    System.out.print("Enter any number");
        int x=s1.nextInt();
        for(int y=1;y<=10;y++)
        {   int z;
            z=x*y;
            System.out.println(x+"*"+y+"="+z);
        
        }*/
        
        // switch for user input
   /*     System.out.print("Enter any number to enter the case ");
        int alpha=s1.nextInt();
        switch(alpha)
        {
            case 1:
                int z;
                System.out.print("Enter 1st number");
                int a=s1.nextInt();
                System.out.print("Enter 2nd number");
                int b=s1.nextInt();
                z=a+b;
                System.out.println("My sum result is "+z);
        case 2:
                int p;
                System.out.print("Enter 1st number");
                int q=s1.nextInt();
                System.out.print("Enter 2nd number");
                int r=s1.nextInt();
                p=q-r;
                System.out.println("My subtraction result is "+p);
        default:
            System.out.println("You enter a wrong number which is out of the range");
     }*/
        long[] primes = new long[20];    
primes[0] = 2;                   
primes[1] = 3;                   
long[] primes2=primes;
System.out.println(primes2[0]);
primes2[0]=5;
System.out.println(primes2[0]);

    }
    
}
