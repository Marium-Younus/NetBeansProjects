/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multilevelinherit;

/**
 *
 * @author mariumyounus
 */
public class Saving_Acc extends Account {
    int min_bal,saving_bal;
 Saving_Acc(String a, int b, int c, int d)
	{
		super(a,b);
		min_bal=c;
		saving_bal=d;
	}
 void display()
	{
		super.display();
		System.out.println ("Minimum Balance: "+min_bal);
		System.out.println ("Saving Balance: "+saving_bal);
	}
    
    
    
}
