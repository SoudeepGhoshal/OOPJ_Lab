/*Illustrate the execution of constructors in multi-level inheritance with three
Java classes – plate(length, width), box(length, width, height), wood box (length,
width, height, thick) where box inherits from plate and woodbox inherits from box class.
Each class has constructor where dimensions are taken from user.*/

package Lab4;

import java.util.Scanner;

class Plate {
	double length,width;
	
	public Plate(double l,double w) {
		length=l;
		width=w;
	}
}

class Box extends Plate {
	double height;

	public Box(double l, double w, double h) {
		super(l, w);
		height=h;
	}
	
}

public class Woodbox extends Box {
	double thick;

	public Woodbox(double l, double w, double h, double t) {
		super(l, w, h);
		thick=t;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		double l=sc.nextDouble();
		System.out.print("Enter width: ");
		double w=sc.nextDouble();
		System.out.print("Enter height: ");
		double h=sc.nextDouble();
		System.out.print("Enter thickness: ");
		double t=sc.nextDouble();
		
		Woodbox obj=new Woodbox(l,w,h,t);
		
		System.out.println("Dimensions-");
		System.out.println("Length: "+obj.length);
		System.out.println("Width: "+obj.width);
		System.out.println("Height: "+obj.height);
		System.out.println("Thickness: "+obj.thick);
		
		sc.close();

	}

}