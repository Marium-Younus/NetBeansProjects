/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trialcollectionm;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author mariumyounus
 */
public class TrialcollectionM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* GregorianCalendar g1=new GregorianCalendar(2013,1,1);
        System.out.println(g1.isLeapYear(2014));
        System.out.println(g1.getTime());*/
        
        Date d1=new Date();

   System.out.println(d1.toString());
  System.out.printf("%1$s %2$tB %2$td %2$tY"+"Due date"+d1);


    }
    
}
