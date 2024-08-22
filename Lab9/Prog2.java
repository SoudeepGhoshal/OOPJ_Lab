/* Write a program in java which will display the working of two threads in synchronization. */

package Lab9;

public class Prog2 extends Thread{
	public Prog2(String name) {
		super(name);
	}
	
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + ": I"); Thread.sleep(500);
			System.out.println(Thread.currentThread().getName() + ": Love"); Thread.sleep(500);
			System.out.println(Thread.currentThread().getName() + ": Java"); Thread.sleep(500);
			System.out.println(Thread.currentThread().getName() + ": Very"); Thread.sleep(500);
			System.out.println(Thread.currentThread().getName() + ": Much"); Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Thread Interrrupted. EXITING...");
		}
	}

	public static void main(String[] args) {
		Prog2 obj1 = new Prog2("Thread 1");
		Prog2 obj2 = new Prog2("Thread 2");
		obj1.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
			System.out.println("Thread Interrrupted. EXITING...");
		}
		obj2.start();
	}

}
