/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taskexcep;

/**
 *
 * @author mariumyounus
 */
public class Taskexcep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int[] array = new int[3];

        try{

            for(int i=0;i<4;++i){

                array[0] = i;

            }

            System.out.println(array);

        }

        catch(ArrayIndexOutOfBoundsException e){

            //printed just to inform that we have entered the catch block

            System.out.println("Oops, we went to far, better go back to 0!");

        }

        finally{

            System.out.println(array);

            //method call to continue program

        }

    }


    }
    

