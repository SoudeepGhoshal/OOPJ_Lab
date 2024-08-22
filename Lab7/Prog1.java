/* Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using
 * catch statement. */

package Lab7;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		try {
			System.out.println("Enter values:");
			for (int i = 0; i <= n; i++) {
				a[i] = sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No more values needed");
			System.out.println(e);
		}
		sc.close();
		int sum=0;
		for (int x: a) {
			sum += x;
		}
		System.out.println("Sum = "+sum);
	}
	
}