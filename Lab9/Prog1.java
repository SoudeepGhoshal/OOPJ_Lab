/* Write a program in Java using multi-threading which will display a counter value within a specified
 * range with a gap of 5 milliseconds after setting it’s name as given by the user. */

package Lab9;

import java.util.Scanner;

public class Prog1 extends Thread{
	final int START;
	final int END;
	
	public Prog1(String name, int s, int e){
		super(name);
		START = s;
		END = e;
	}
	
	public void run() {
		System.out.println("Thread: " + Thread.currentThread().getName());
		for (int i = START; i <= END; i++) {
			System.out.print(i + "\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted. EXITING...");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Thread name: ");
		String n = sc.next();
		System.out.print("Enter starting value of counter: ");
		int init = sc.nextInt();
		System.out.print("Enter ending value of counter: ");
		int en = sc.nextInt();
		sc.close();
		
		Prog1 p1 = new Prog1(n, init, en);
		p1.start();	
	}

}
