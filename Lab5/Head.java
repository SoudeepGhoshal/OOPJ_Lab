/*Define an interface Employee with a method getDetails() to get employee details as Empid
and Ename. Also define a derived interface Manager with a method getDeptDetails() to get
department details such as Deptid and Deptname.Then define a class Head which implements
Manager interface and also prints all details of the employee. Write the complete program
to display all details of one head of the department.*/

package Lab5;

import java.util.Scanner;

interface Employee {
	void getDetails();
}

interface Manager1 extends Employee {
	void getDeptDetails();
}

public class Head implements Manager1{
	int Empid,Deptid;
	String Ename,Deptname;

	public static void main(String[] args) {
		Head h=new Head();
		h.getDetails();
		h.getDeptDetails();
		System.out.println("Employee ID: "+h.Empid);
		System.out.println("Employee Name: "+h.Ename);
		System.out.println("Department ID: "+h.Deptid);
		System.out.println("Department Name: "+h.Deptname);
	}

	public void getDetails() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		Empid=sc.nextInt();
		System.out.print("Enter Employee Name: ");
		Ename=sc.next();
	}

	public void getDeptDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Department ID: ");
		Deptid=sc.nextInt();
		System.out.print("Enter Department Name: ");
		Deptname=sc.next();
		sc.close();
	}

}