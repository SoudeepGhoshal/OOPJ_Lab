//Write a program to overload subtract method with various parameters in a class in Java.
//Write the driver class to use the different subtract methods using object.

package Lab3;

import java.util.Scanner;

class Subtract {
	double sub(double a,double b) {
		return(a-b);
	}
	
	int sub(int a,int b) {
		return(a-b);
	}
	
	char sub(char a,char b) {
		return (char)(a-b);
	}
}

public class Prog4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Subtract s=new Subtract();
		System.out.println("MENU:");
		System.out.println("1:Decimal Subtraction");
		System.out.println("2:Integer Subtraction");
		System.out.println("3:Character Subtraction");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter num 1: ");
			double a1=sc.nextDouble();
			System.out.print("Enter num 2: ");
			double b1=sc.nextDouble();
			double c1=s.sub(a1,b1);
			System.out.println("Difference = "+c1);
			break;
			
		case 2:
			System.out.print("Enter num 1: ");
			int a2=sc.nextInt();
			System.out.print("Enter num 2: ");
			int b2=sc.nextInt();
			int c2=s.sub(a2,b2);
			System.out.println("Difference = "+c2);
			break;
		
		case 3:
			System.out.print("Enter character 1: ");
			char a=sc.next().charAt(0);
			System.out.print("Enter character 2: ");
			char b=sc.next().charAt(0);
			char c3=s.sub(a,b);
			System.out.println("Difference = "+c3);
			break;
			
		default: System.out.println("Invalid Choice.");
		}
		sc.close();
	}

}
