/*Define an interface Motor with a data member – capacity and two methods such as run() and
consume(). Define a Java class ‘Washing machine’ which implements this interface and write
the code to check the value of the interface data member thru an object of the class.*/

package Lab5;

interface Motor {
	public static final float capacity = 7.0f;
	
	void run();
	void consume();
}

public class WashingMachine implements Motor {

	public void run() {
		System.out.println("Running");
	}

	public void consume() {
		System.out.println("N/A");
	}
	
	public static void main(String[] args) {
		WashingMachine obj=new WashingMachine();
		System.out.println("Capacity of Motor: "+capacity+"kg");
		obj.run();
		obj.consume();

	}

}