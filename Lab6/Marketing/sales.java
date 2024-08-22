package Lab6.Marketing;

import java.util.Scanner;
import Lab6.General.*;

public class sales extends employee{
	
	double tallowance(double basic) {
		double tearnings = 0.05*earning(basic);
		return(tearnings);
	}

	public static void main(String[] args) {
		sales s1 = new sales();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		s1.empid = sc.nextInt();
		System.out.print("Enter Employee Name: ");
		String n = sc.next();
		s1.setName(n);
		System.out.print("Enter Basic Salary: ");
		double b = sc.nextDouble();
		double earnings = s1.earning(b) + s1.tallowance(b);
		
		System.out.println("Employee ID: "+s1.empid);
		System.out.println("Total earning: "+earnings);
		sc.close();
	}

}
