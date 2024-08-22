/*Write a program in java using constructor overloading concept to calculate the area
of a rectangle having data member as length and breadth. Use default constructor to
initialize the value of the data member to zero and parameterized constructor to initialize
the value of data member according to the user input.*/

package Lab3;

import java.util.Scanner;

public class Prog6 {
	double length,breadth;
	
	public Prog6(double l,double b) {
		length=l;
		breadth=b;
	}
	
	public Prog6() {
		length=breadth=0.0d;
	}

	double area() {
		return(length*breadth);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		double a=sc.nextDouble();
		System.out.print("Enter breadth: ");
		double b=sc.nextDouble();
		
		Prog6 obj1=new Prog6();
		Prog6 obj2=new Prog6(a,b);
		
		double ar1=obj1.area();
		double ar2=obj2.area();
		
		System.out.println("Area using default constructor = "+ar1);
		System.out.println("Area using parameterized constructor = "+ar2);
		
		sc.close();
	}

}