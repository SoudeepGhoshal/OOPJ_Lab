//Write a program which will overload the area () method and display the area of a circle,
//triangle and square as per user choice and user entered dimensions. 

package Lab3;

import java.util.Scanner;

public class Prog5 {
	
	double area(float r) {
		return(3.1415*r*r);
	}
	
	double area(double b,double h) {
		return (0.5*b*h);
	}
	
	double area(double s) {
		return (s*s);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Prog5 p5=new Prog5();
		System.out.println("MENU:");
		System.out.println("1:Area of Circle");
		System.out.println("2:Area of Triangle");
		System.out.println("3:Area of Square");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter radius: ");
			double r=sc.nextFloat();
			double c=p5.area(r);
			System.out.println("Area of Circle = "+c);
			break;
			
		case 2:
			System.out.print("Enter base: ");
			double b=sc.nextDouble();
			System.out.print("Enter height: ");
			double h=sc.nextDouble();
			double t=p5.area(b,h);
			System.out.println("Area of triangle = "+t);
			break;
		
		case 3:
			System.out.print("Enter side: ");
			double s=sc.nextDouble();
			double sq=p5.area(s);
			System.out.println("Area of Square = "+sq);
			break;
			
		default: System.out.println("Invalid Choice.");
		}
		sc.close();

	}

}