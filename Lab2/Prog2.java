//Accept 10 numbers from command line and check how many of them are even and how many are odd.

package Lab2;

public class Prog2 {

	public static void main(String[] args) {
		
		if (args.length!=10) {
			System.out.println("Insufficient input.");
			return;
		}
		int n=0,e=0,o=0;
		System.out.println("Entered numbers:");
		for (String arg: args) {
			try {
				n=Integer.parseInt(arg);
				System.out.print(n+" ");
				if (n%2==0)
					e++;
				else o++;
			}
			catch (Exception e1) {
				System.out.println("Invalid input.");
			}
		}
		
		System.out.println("\nEven frequency: "+e);
		System.out.println("Odd frequency: "+o);
	}

}
