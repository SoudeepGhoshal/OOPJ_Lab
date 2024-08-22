//Write a program to print the week day for the given day no. of the current month using switch case statement

package Lab1;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Day Number: ");
		int dayNo=sc.nextInt();
		if(dayNo>31||dayNo<1) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		int dayOfWeek=dayNo%7;
		
		switch(dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default: System.out.println("Invalid Day Number provided.");
		}
		
		sc.close();
	}

}
