/*Write a program in java to input and display the details of n number of students
having roll, name and cgpa as data members. Also display the name of the student having
lowest cgpa.*/

package Lab3;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n=sc.nextInt();
		int roll[]=new int[n];
		String name[]=new String[n];
		float cgpa[]=new float[n];
		int l=0;
		System.out.println("Enter details of Student:-");
		for (int i=0;i<n;i++) {
			System.out.println("Student "+(i+1)+"-");
			System.out.print("Roll: ");
			roll[i]=sc.nextInt();
			System.out.print("Name: ");
			name[i]=sc.next();
			System.out.print("CGPA: ");
			cgpa[i]=sc.nextFloat();
		}
		System.out.println("Student details:-");
		for (int i=0;i<n;i++) {
			System.out.println("Student "+(i+1)+"-");
			System.out.println("Roll: "+roll[i]);
			System.out.println("Name: "+name[i]);
			System.out.println("CGPA: "+cgpa[i]);
			if(cgpa[i]<cgpa[l])
				l=i;
		}
		System.out.println("Student with lowest CGPA: "+name[l]);
		sc.close();
	}

}