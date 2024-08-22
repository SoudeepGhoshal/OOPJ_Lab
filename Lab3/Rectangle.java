/*Write a program in Java to create a class Rectangle having data members
length and breadth and three methods called read, calculate and display to read
the values of length and breadth,  calculate the area and perimeter of the rectangle
and display the result respectively.
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length 
and breadth of the rectangle.*/

package Lab3;

import java.util.Scanner;

public class Rectangle {
	
	double length, breadth;
	
	public Rectangle (){
		length=0.0d;
		breadth=0.0d;
	}
	
	void read() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		this.length=sc.nextDouble();
		System.out.print("Enter breadth: ");
		this.breadth=sc.nextDouble();
		sc.close();
	}
	
	double calculateArea() {
		double area=length*breadth;
		return(area);
	}
	
	double calculatePerimeter() {
		double peri=2*(length+breadth);
		return(peri);
	}
	
	void displayArea() {
		System.out.println("Area = "+this.calculateArea());
	}
	
	void displayPerimeter() {
		System.out.println("Perimeter = "+this.calculatePerimeter());
	}

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.read();
		r1.displayArea();
		r1.displayPerimeter();
	}

}