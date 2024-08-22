//Program to find no. of objects created out of a class using ‘static’ modifier.

package Lab2;

public class Prog4 {
	
	private static int counter=0;
	
	public Prog4() {
		counter++;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Prog4 o1=new Prog4();
		Prog4 o2=new Prog4();
		Prog4 o3=new Prog4();
		
		System.out.println("Number of Objects = "+counter);
	}

}