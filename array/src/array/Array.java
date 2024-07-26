/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;
import java.util.Scanner;
/**
 *
 * @author mariumyounus
 */
public class Array {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
  //Scanner sc=new Scanner(System.in);
int n,r;
System.out.print("Enter Any Number: ");
Scanner ref=new
Scanner(System.in);
n=ref.nextInt();
while(n>0)
{
r=n%10;
System.out.println(r);
n=n/10;
}
//  long[] primes = new long[20];    
//primes[0] = 2;                   
//primes[1] = 3;                   
//long[] primes2=primes;
//System.out.println(primes2[0]);
//primes2[0]=5;
//System.out.println(primes2[0]);
//
//  
///*int[] arr=new int[7];
//int sum=0;
//for(int c=0;c<arr.length;c++)
//    {
//	System.out.println("enter the number");
//	arr[c]=sc.nextInt();
//	sum=sum+arr[c];
//	}
//        System.out.println("Total sum is: "+sum);// program will display the sum of array elements 
//*/
//        
//  /*      String[] s=new String[3];
//  for(int a=0;a<s.length;a++)
//	 { 
//        System.out.println("enter name");
//	     s[a]=sc.next();
//          
//	}
//
//  for(int b=0;b<s.length;b++)
//	 { 
//	    System.out.println("you have entered:"+s[b]);
//	
//	 }
//*/
//        
//      
//
////int[][] arr = { { 1, 9, 4 }, { 0, 2}, { 0, 1, 2, 3, 4 } };
// /*  int [][] arr=new int[3][3];
//		// print out the array 
//                System.out.print("Enter array number");
//               
//              
//		for (   int row=0; row <arr.length; row++ ) //changes row
//		{ 
//			
//			for (  int col=0; col < arr[row].length; col++ ) 
//                        {
////changes columaa
//                      arr[row][col]=sc.nextInt();  }
//                      
//                }
//                        
//                        for (  int  row=0; row <arr.length; row++ ) //changes row
//		{ 
//			
//			for (  int col=0; col < arr[row].length; col++ ) 
//                        {
////changes column 
//				System.out.print( arr[row][col] + " ");}
//                        System.out.println("");
//                     */
//                      
//                      /*  String a="aptech computer education system";
//System.out.println(a.codePointAt(3));
//System.out.println(a.codePointBefore(1));
//System.out.println(a.codePointCount(0,6));
//System.out.println(a.startsWith("apt"));
//System.out.println(a.endsWith("od"));
//System.out.println(a.startsWith("apt"));
//System.out.println(a.toUpperCase());
//System.out.println(a.toLowerCase());
//String b="APTECH COMPUTER education system";
//System.out.println(a.equalsIgnoreCase(b));*/
//
//              /*  String g="my education is aptech";
//              String f="my name is aptech ";
//              System.out.println(f.charAt(8));
//              System.out.println(f.codePointAt(4));
//              System.out.println(f.codePointBefore(3));
//              System.out.println(f.codePointCount(0, 5));
//              System.out.println(f.endsWith("tech"));
//              System.out.println(f.contentEquals(f));
//              System.out.println(f.toUpperCase());
//              System.out.println(f.toLowerCase());
//              System.out.println(f.contentEquals(g));
//              System.out.println(f.concat(g));*/
//              
//              
              
    } 

}


    

