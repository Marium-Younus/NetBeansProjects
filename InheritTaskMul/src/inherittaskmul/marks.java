/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inherittaskmul;

/**
 *
 * @author mariumyounus
 */
public class marks extends Student{
     int mark1,mark2;
        public void setmarks(int m1,int m2)
        {
                mark1 = m1;
                mark2 = m2;
        }
        public void putmarks()
        {
                System.out.println("Mark1 : " + mark1);
                System.out.println("Mark2 : " + mark2);
        }
    
}
