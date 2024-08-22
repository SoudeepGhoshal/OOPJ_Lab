//Write a program to print the corresponding grade for the given
//mark using if..else statement in Java

package Lab1;

import java.util.Scanner;

public class Prog2 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter mark: ");
		float mark=sc.nextFloat();
		if (mark>=90)
			System.out.println("O Grade");
		else if (mark>=80)
			System.out.println("E Grade");
		else if (mark>=70)
			System.out.println("A Grade");
		else if (mark>=60)
			System.out.println("B Grade");
		else System.out.println("C Grade");
		sc.close();
	}
}
