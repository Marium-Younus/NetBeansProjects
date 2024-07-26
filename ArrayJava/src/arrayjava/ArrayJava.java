/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayjava;
import java.util.Scanner;
/**
 *
 * @author mariumyounus
 */
public class ArrayJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
         
       int [] arr=new int[5];
              int [] arr1={1,2,3};
        System.out.println("==============================================");
         System.out.println("      Examples of an Array   ");
           System.out.println("==============================================");
      int c,sum=0;
        
        for( c=0;c<arr1.length;c++)
        {
          
//            System.out.println("Enter your array value");
//            arr[c]=s1.nextInt();
//          sum=sum+arr[c];
              System.out.println(""+arr1[c]);
         }

            String [] arr2={"Aman","Suresh","Ramesh","Raman","Mukesh"};
        System.out.println("==============================================");

        for( c=0;c<arr2.length;c++)
        {
          
//            System.out.println("Enter your array value");
//            arr[c]=s1.nextInt();
//          sum=sum+arr[c];
              System.out.println(""+arr2[c]);
         }
         String [] arr3={"Rosy","Amy","Peter","Albert"};
        System.out.println("==============================================");

        for( c=0;c<arr3.length;c++)
        {
          
//            System.out.println("Enter your array value");
//            arr[c]=s1.nextInt();
//          sum=sum+arr[c];
              System.out.println(""+arr3[c]);
         }
////      System.out.println("My arr is"+sum);
        
  /*     String[] s=new String[3];
       for(int a=0;a<s.length;a++)
       {
       
           System.out.print("enter your name:");
           s[a]=s1.nextLine();
       
       }
        
         for(int b=0;b<s.length;b++)
       {
       
           System.out.println("My name is:"+s[b]);
         
       
       }*/
        
        
       //int[][] arr={{1,3,4},{4,5,7},{8,9,1}};
 
       
 //int[][] arr = { { 1, 2, 3 }, { 4, 5,6}, { 7, 8, 9 } }; 
		// print out the array 
//int[][] arr=new int[3][3];		
//        System.out.println("Enter arra:");
//      
// 
// 
// for ( int row=0; row <arr.length; row++ ) //changes row
//		{ 
//			System.out.print("Row " + row + ": "); 
//			for ( int col=0; col < arr[row].length; col++ ) {
//arr[row][col]=s1.nextInt();
////changes column 
//                        }
//                         }
//
//for ( int row=0; row <arr.length; row++ ) //changes row
//		{ 
//			System.out.print("Row " + row + ": "); 
//			for ( int col=0; col < arr[row].length; col++ ) 
//
////changes column 
//				System.out.print( arr[row][col] + " "); 
//                        System.out.println(); 
//
//
//    }
   
}}
