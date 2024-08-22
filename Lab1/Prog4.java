//Program to check a user entered number is palindrome or not

package Lab1;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		
		int rev=0,x=n;
		while (x>0) {
			rev=rev*10+x%10;
			x/=10;
		}
		
		if (rev==n)
			System.out.println("Palindrome");
		else System.out.println("NOT Palindrome");
		
		sc.close();
	}

}