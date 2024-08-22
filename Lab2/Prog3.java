//Program to sort the user entered list of numbers of any size

package Lab2;

import java.util.Scanner;

public class Prog3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements:");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int t1=0,t2=0;
		for (int i=0;i<n-1;i++) {
			t1=i;
			for (int j=i+1;j<n;j++) {
				if (a[j]<a[t1])
					t1=j;
			}
			t2=a[i];
			a[i]=a[t1];
			a[t1]=t2;
		}
		System.out.println("Sorted Array:");
		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}