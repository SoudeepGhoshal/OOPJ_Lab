//Find sum of each diagonal (left & right) elements separately
//of a user entered 3 X 3 matrix in Java.

package Lab2;

import java.util.Scanner;

public class Prog6 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of matrix: ");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int l=0,r=0;
		System.out.println("Enter "+(n*n)+" elements:");
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				if (i==j)
					l+=a[i][j];
				if (i+j==n-1)
					r+=a[i][j];
			}
		}
		System.out.println("Sum of Left Diagonal: "+l);
		System.out.println("Sum of Right Diagonal: "+r);
		sc.close();
	}

}