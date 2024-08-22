//Find the no. of occurrence of each element in a user entered list of nos.

package Lab2;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[][]=new int[n][2];
		System.out.println("Enter elements:");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=-1;
		outer:
		for (int i=0;i<n;i++) {
			for (int j=0;j<k+1;j++) {
				if (a[i]==b[j][0]) {
					b[j][1]++;
					continue outer;
				}
			}
			k++;
			b[k][0]=a[i];
			b[k][1]=1;
		}
		System.out.println("Frequencies of each element:");
		System.out.println("Element :\tFrequency");
		for (int i=0;i<k+1;i++) {
			System.out.println(b[i][0]+"\t:\t"+b[i][1]);
		}
		sc.close();
	}

}