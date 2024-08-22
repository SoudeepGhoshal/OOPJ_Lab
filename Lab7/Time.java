/* Write a program to create user defined exceptions called HrsException, MinException
 * and SecException. Create a class Time which contains data members hours, minutes,
 * seconds and a method to take a time from user which throws the user defined exceptions
 * if hours (>24 &<0),minutes(>60 &<0),seconds(>60 &<0). */

package Lab7;

import java.util.Scanner;

@SuppressWarnings("serial")
class HrsException extends Exception {
	
	public HrsException(String msg) {
		super(msg);
	}
	
}

@SuppressWarnings("serial")
class MinException extends Exception {
	
	public MinException(String msg) {
		super(msg);
	}
	
}

@SuppressWarnings("serial")
class SecException extends Exception {
	
	public SecException(String msg) {
		super(msg);
	}
	
}

public class Time {
	int hours, minutes, seconds;
	
	@SuppressWarnings("resource")
	void getTime() throws Lab7.HrsException, Lab7.MinException, Lab7.SecException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hour: ");
		hours = sc.nextInt();
		if (hours >= 24 || hours < 0) throw new HrsException("Invalid Hours.");
		System.out.print("Enter minute: ");
		minutes = sc.nextInt();
		if (minutes >= 60 || minutes < 0) throw new MinException("Invalid Minutes.");
		System.out.print("Enter seconds: ");
		seconds = sc.nextInt();
		if (seconds >= 60 || seconds < 0) throw new SecException("Invalid Seconds.");
		sc.close();
	}

	public static void main(String[] args) {
		Time t = new Time();
		try {
			t.getTime();
		} catch(Lab7.HrsException e) {
			System.out.println(e.getMessage());
		} catch(Lab7.MinException e) {
			System.out.println(e.getMessage());
		} catch(Lab7.SecException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Time: "+t.hours+":"+t.minutes+":"+t.seconds);
	}

}
