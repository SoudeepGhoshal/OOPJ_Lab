/*A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box.
The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft.
Implement it in Java to calculate the cost of plastic as per the dimensions given by the
user where 3D inherits from 2D.*/

package Lab4;

import java.util.Scanner;

class Area {
	
	double length,breadth;
	
	public Area(double l,double b) {
		length=l;
		breadth=b;
	}
	
	double area() {
		return(length*breadth);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		double l=sc.nextDouble();
		System.out.print("Enter breadth: ");
		double b=sc.nextDouble();
		
		Area ar=new Area(l,b);
		double cost=ar.area()*40;
		System.out.printf("Cost for 2D= Rs. %.2f",cost);
		
		sc.close();
	}
}

public class Prog1 extends Area{
	
	double height;
	
	public Prog1(double l, double b, double h) {
		super(l, b);
		height=h;
	}
	
	double vol() {
		return(area()*height);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		double l=sc.nextDouble();
		System.out.print("Enter breadth: ");
		double b=sc.nextDouble();
		System.out.print("Enter height: ");
		double h=sc.nextDouble();
		
		Prog1 p1=new Prog1(l,b,h);
		double cost=p1.vol()*60;
		System.out.printf("Cost for 3D: Rs. %.2f",cost);
		
		sc.close();
	}

}