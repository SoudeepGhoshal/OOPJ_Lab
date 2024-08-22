/*Write a program in Java having three classes Apple, Banana and Cherry. Class Banana
and Cherry are inherited from class Apple and each class have their own member function
show(). Using Dynamic Method Dispatch concept display all the show() method of each class.*/

package Lab4;

class Apple {
	
	void show() {
		System.out.println("Apple");
	}
}

class Banana extends Apple{
	
	void show() {
		System.out.println("Banana");
	}
}

class Cherry extends Apple {
	
	void show() {
		System.out.println("Cherry");
	}
}

public class Prog3 {

	public static void main(String[] args) {
		Apple a=new Apple();
		Banana b=new Banana();
		Cherry c=new Cherry();
		
		Apple ref;
		
		//For show() of Apple class
		ref=a;
		ref.show();
		
		//For show() of Banana class
		ref=b;
		ref.show();
		
		//For show() of Cherry class
		ref=c;
		ref.show();
	}

}