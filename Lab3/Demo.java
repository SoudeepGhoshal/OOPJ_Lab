//Write a class file – box with three data members(length, width, height)
//and a method volume(). Also implement the application class Demo where an object of 
//the box class is created with user entered dimensions and volume is printed.

package Lab3;

import java.util.Scanner;

class Box {
	double length, width, height;
	
	Box (double l,double w,double h){
		length=l;
		width=w;
		height=h;
	}
	
	double volume() {
		return(length*width*height);
	}

}

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		double l=sc.nextDouble();
		System.out.print("Enter width: ");
		double w=sc.nextDouble();
		System.out.print("Enter height: ");
		double h=sc.nextDouble();
		
		Box b1=new Box(l,w,h);
		double vol=b1.volume();
		System.out.println("Volume = "+vol);
		
		sc.close();
	}
	
}