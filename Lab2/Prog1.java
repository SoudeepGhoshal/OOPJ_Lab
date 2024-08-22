//Find the largest among 3 user entered nos. at the command prompt using Java

package Lab2;

public class Prog1 {
	public static void main(String args[]) {
		if (args.length!=2) {
			System.out.println("Insufficient input.");
			return;
		}
		int a[]=new int[3];
		int i=0;
		System.out.println("Entered numbers:");
		for (String arg:args) {
			a[i]=Integer.parseInt(arg);
			System.out.print(a[i]+" ");
			i++;
		}
		
		System.out.println("Greatest: "+((a[0]>a[1])?(a[0]>a[2])?a[0]:a[2]:(a[1]>a[2])?a[1]:a[2]));
	}
}