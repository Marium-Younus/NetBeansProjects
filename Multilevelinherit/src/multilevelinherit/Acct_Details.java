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
public class Acct_Details extends Saving_Acc {
    int deposits, withdrawals;
	Acct_Details(String a, int b, int c, int d, int e, int f)
	{
		super(a,b,c,d);
		deposits=e;
		withdrawals=f;
	}
	public void display()
	{
		super.display();
		System.out.println ("Deposit: "+deposits);
		System.out.println ("Withdrawals: "+withdrawals);
	}
    
}
