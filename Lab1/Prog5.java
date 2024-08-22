//Write a program in Java to take first name and last name from and print both in one line as last name followed by first name

package Lab1;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String str1=sc.next();
		System.out.print("Enter your last name: ");
		String str2=sc.next();
		System.out.println(str2+" "+str1);
		sc.close();
	}

}
