/*Define an interface with three methods – earnings(), deductions() and bonus() and define
a Java class ‘Manager’ which uses this interface without implementing bonus() method.
Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
bonus() method.  Write the complete program to find out earnings, deduction and bonus of a
sbstaff with basic salary amount entered by the user as per the following guidelines –
earnings			basic + DA (80% of basic) + HRA (15% of basic)
deduction PF		12% of basic
bonus				50% of basic*/

package Lab5;

import java.util.Scanner;

interface pay {
	void earning();
	void deduction();
	void bonus();
}

abstract class Manager implements pay {
	double basic, earning, deduction_PF;

	public void earning() {
		earning=basic+0.8*basic+0.15*basic;
	}

	public void deduction() {
		deduction_PF=0.12*basic;
	}

	//abstract public void bonus();
	
}

public class Substaff extends Manager{
	double bonus_amt;
	
	public void bonus() {
		bonus_amt=0.5*basic;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Substaff s1=new Substaff();
		System.out.print("Enter Basic Salary: ");
		s1.basic=sc.nextDouble();
		s1.earning();
		s1.deduction();
		s1.bonus();
		System.out.println("Earning = "+s1.earning);
		System.out.println("Deduction = "+s1.deduction_PF);
		System.out.println("Bonus = "+s1.bonus_amt);
		sc.close();
	}

}
