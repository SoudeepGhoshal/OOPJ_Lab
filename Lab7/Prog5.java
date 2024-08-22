/* Create an user defined exception named CheckArgument to check the number of arguments
 * passed through command line. If the number of arguments is less than four then throw the
 * Check Argument exception, else print the addition of squares of all the four elements. */

package Lab7;

@SuppressWarnings("serial")
class CheckArgument extends Exception {
	
	public CheckArgument(String msg) {
		super(msg);
	}
	
}

public class Prog5 {

	public static void main(String[] args) throws CheckArgument {
		try {
			if (args.length < 4)
				throw new CheckArgument("Mininum 4 arguments expected; found "+args.length);
		} catch (CheckArgument e) {
			System.out.println(e.getMessage());
			System.exit(0);;
		}
		int k=0;
		for (String i: args) {
			k +=  Math.pow(Integer.parseInt(i),2);
		}
		System.out.println(k);
	}

}