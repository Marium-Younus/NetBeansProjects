
package class3_decisionmake;

import java.util.Scanner;

public class Class3_DecisionMake {

   
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        /*--------------------------- Arithematic operators*/
        /*int num1,num2;
        System.out.println("Enter First Number :");
        num1 = s1.nextInt();
        System.out.println("Enter 2nd Number :");
        num2 = s1.nextInt();
        
        System.out.println("Add result is :"+(num1+num2));
        System.out.println("Sub result is :"+(num1-num2));
        System.out.println("Mul result is :"+(num1*num2));
        System.out.println("Div result is :"+(num1/num2));
        System.out.println("Mod result is :"+(num1%num2));
        
        ------------Decision Making instruction
        int number;
        System.out.println("Enter any number");
        number=s1.nextInt();
        if(number > 10)
        {
            System.out.println(number+" greater then 10");
        }
        else
        {
            System.out.println(number+" less then 10");
        }*/
        
         /*------------Decision Making instruction even odd*/
       /* System.out.println("Write a program to check wheather the number is even or odd");
                int n1;
                System.out.println("Enter any number to check even or odd");
                n1=s1.nextInt();
                if(n1%2==0)
                {
                   System.out.println(n1+" is even number");

                }
                else
                {
                 System.out.println(n1+" is odd number");
                }*/
         /*------------Decision Making via if else if else*/
       /*  System.out.println("Write a program to check wheather the number is +ve,-ve or zero");
                int checknum;
                System.out.println("Enter any number");
                checknum=s1.nextInt();
                if(checknum > 0)
                {
                    System.out.println(checknum+" is positive number");
                }
                else if(checknum<0)
                {
                System.out.println(checknum+" is negative number");
                }
                else
                {
                System.out.println(" its a zero number");
                }*/
           /*-------------- Decision make via logical operators*/
                /*int a,b;
                System.out.print("Enter a value :");
                a=s1.nextInt();
                
                System.out.print("Enter b value :");
                b=s1.nextInt();
                
                if( a > b && a!=b )
                {
                    System.out.println(a + "is greater the or not equal to "+b);
                }
                else
                {
                     System.out.println(a + "is lesser the  "+b);
                }*/
                /*switch case**/
               System.out.println("write a program to check which day is today");
               int daynum;
               System.out.println("Enter Today number");
               daynum = s1.nextInt();
               switch(daynum)
               {
                   case 1:
                       System.out.println("Today is Sunday");
                       break;
                   case 2:
                       System.out.println("Today is Monday");
                       break;
                    case 3:
                       System.out.println("Today is Tuesday");
                       break;
                    case 4:
                       System.out.println("Today is Wednesday");
                       break;
                    case 5:
                       System.out.println("Today is Thurday");
                       break;
                    case 6:
                       System.out.println("Today is Friday");
                       break;
                    case 7:
                       System.out.println("Today is Saturday");
                       break;
                    default:
                        System.out.println("Not a day");
                       break;              
               }
    }
    
}
