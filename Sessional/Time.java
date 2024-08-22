package Exam;

import java.util.Scanner;

class HrsException extends Exception {
	public HrsException(String msg) {
		super(msg);
	}
}

class MinException extends Exception {
	public MinException(String msg) {
		super(msg);
	}
}

class SecException extends Exception {
	public SecException(String msg) {
		super(msg);
	}
}

public class Time {
	int hours, minutes, seconds;
	
	void inputTime() throws HrsException, MinException, SecException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours: ");
		hours = sc.nextInt();
		System.out.print("Enter minutes: ");
		minutes = sc.nextInt();
		System.out.print("Enter seconds: ");
		seconds = sc.nextInt();
		
		if (hours > 24)
			throw new HrsException("Hours not greater than 24");
		if (hours < 0)
			throw new HrsException("Hours not less than 0");
		if (minutes > 60)
			throw new MinException("Miniutes not greater than 24");
		if (minutes < 0)
			throw new MinException("Minutes not less than 0");
		if (seconds > 60)
			throw new SecException("Seconds not greater than 24");
		if (seconds < 0)
			throw new SecException("Seconds not less than 0");
	}

	public static void main(String[] args) {
		int f = 0;
		Time t = new Time();
		try {
			t.inputTime();
		}
		catch (HrsException h) {
			System.out.println("Caught the Exception");
			System.out.println("Exception occurred: "+h);
			f = 1;
		}
		catch (MinException m) {
			System.out.println("Caught the Exception");
			System.out.println("Exception occurred: "+m);
			f = 1;
		}
		catch (SecException s) {
			System.out.println("Caught the Exception");
			System.out.println("Exception occurred: "+s);
			f = 1;
		}
		
		if (f == 0) {
			System.out.println("Correct Time: "+t.hours+":"+t.minutes+":"+t.seconds);
		}
	}

}