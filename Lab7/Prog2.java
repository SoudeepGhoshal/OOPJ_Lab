/*Write a Java program to handle an ArithmeticException using try, catch, and finally block.*/

package Lab7;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend: ");
		int num = sc.nextInt();
		System.out.print("Enter divisor: ");
		int den = sc.nextInt();
		sc.close();
		int quo = 0;
		try {
			quo = num / den;
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero not possible; NaN");
			System.out.println(e);
		}
		finally {
			System.out.println("Remaining code working.");
		}
		System.out.println("Quotient = "+quo);
	}
	
}