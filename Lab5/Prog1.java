/*Illustrate the usage of abstract class with following Java classes –
• An abstract class ‘student’ with two data members roll_no, reg_no, a method getinput()
and an abstract method course()
• A subclass ‘kiitian’ with course() method implementation 
Write the driver class to print the all details of a kiitian object.*/

package Lab5;

import java.util.Scanner;

abstract class student {
	int roll_no;
	long reg_no;
	
	void getinput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Roll No: ");
		roll_no=sc.nextInt();
		System.out.print("Enter Registration No: ");
		reg_no=sc.nextLong();
		sc.close();
	}
	
	abstract void course();
}

class kiitian extends student {
	String course;

	void course() {
		course="B.Tech. (Computer Science & Engg)";
	}
	
}

public class Prog1 {

	public static void main(String[] args) {
		kiitian k1=new kiitian();
		k1.getinput();
		k1.course();
		System.out.println("Roll Number: "+k1.roll_no);
		System.out.println("Registration Number: "+k1.reg_no);
		System.out.println("Course: "+k1.course);
	}

}