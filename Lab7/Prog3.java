/* Write a Java class which has a method called ProcessInput(). This method checks the 
 * number entered by the user. If the entered number is negative then throw an user
 * defined exception called NegativeNumberException, otherwise it displays the double
 * value of the entered number. */

package Lab7;

import java.util.Scanner;

@SuppressWarnings("serial")
class NegativeNumberException extends Exception {

	public NegativeNumberException(String message) {
        super(message);
    }
    
}

public class Prog3 {
	
	public void ProcessInput(int x) throws Lab7.NegativeNumberException {
		if (x < 0)
			throw new NegativeNumberException("Negative numbers not allowed.");
		else System.out.println(x * 2);
		
	}

	public static void main(String[] args) {
		String s = "";
		int m = 0;
		Prog3 pr = new Prog3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter '.' to exit");
		System.out.println("Enter numbers:");
		while (true) {
			s=sc.next();
			if (s.charAt(0)=='.')
				break;
			m = Integer.parseInt(s);
			try {
				pr.ProcessInput(m);
			} catch (Lab7.NegativeNumberException e) {
				System.out.println("Exception Caught: "+e);
			}
		}
		sc.close();
	}

}