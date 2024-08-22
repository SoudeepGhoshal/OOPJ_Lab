package Exam;

class Apple {
	void show() {
		System.out.println("Apple");
	}
}

class Banana extends Apple {
	void show() {
		System.out.println("Banana");
	}
}

class Cherry extends Apple {
	void show() {
		System.out.println("Cherry");
	}
}

public class Driver {

	public static void main(String[] args) {
		Apple a = new Apple();
		Banana b = new Banana();
		Cherry c = new Cherry();
		
		Apple ref;
		
		//show() method of Apple class
		ref = a;
		ref.show();
		
		//show() method of Banana class
		ref = b;
		ref.show();
		
		//show() method of Cherry class
		ref = c;
		ref.show();
	}

}