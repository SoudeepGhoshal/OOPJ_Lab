/*Write a class Account containing acc_no, balance as data members and two methods as
input() for taking input from user and disp() method to display the details. Create a
subclass Person which has name and aadhar_no as extra data members and override disp()
function. Write the complete program to take and print details of three persons.*/

package Lab4;

import java.util.Scanner;

class Account {
	long acc_no;
	double balance;
	
	@SuppressWarnings("resource")
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Account Number: ");
		acc_no=sc.nextLong();
		System.out.print("Enter Balance: ");
		balance=sc.nextDouble();
	}
	
	void display() {
		System.out.println("Details:- ");
		System.out.println("Account Number: "+acc_no);
		System.out.printf("Account Balance: %.2f",balance);
	}
}

public class Person extends Account {
	String name;
	long aadhar_no;
	
	public Person(String n,long a) {
		name=n;
		aadhar_no=a;
	}
	
	void display() {
		System.out.println("Account Details:- ");
		System.out.println("Account Holder Name: "+name);
		System.out.println("Account Number: "+acc_no);
		System.out.println("Account Holder Aadhar Number: "+aadhar_no);
		System.out.printf("Account Balance: %.2f\n\n",balance);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long a;
		String n=new String();
		
		System.out.println("For Account 1:-");
		System.out.print("Enter Account Holder name: ");
		n=sc.next();
		System.out.print("Enter Account Holder aadhar number: ");
		a=sc.nextLong();
		Person p1=new Person(n,a);
		p1.input();
		System.out.println();
		
		System.out.println("For Account 2:-");
		System.out.print("Enter Account Holder name: ");
		n=sc.next();
		System.out.print("Enter Account Holder aadhar number: ");
		a=sc.nextLong();
		Person p2=new Person(n,a);
		p2.input();
		System.out.println();
		
		System.out.println("For Account 3:-");
		System.out.print("Enter Account Holder name: ");
		n=sc.next();
		System.out.print("Enter Account Holder aadhar number: ");
		a=sc.nextLong();
		Person p3=new Person(n,a);
		p3.input();
		System.out.println();
		
		p1.display();
		p2.display();
		p3.display();
		
		sc.close();

	}

}