// Splits a restaurant bill evenly among three diners.

//import javax.print.DocFlavor.STRING;

public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String nanm3 = args[2];
		int bill = Integer.parseInt(args[3]);
		double pay = bill / 3.0;
	      pay = Math.ceil(pay);
		

         System.out.printf("Dear " + nanm3 + ", " + name2 + ", " + "and " + name1 + ": pay " + pay + " shekels each." );
		
	
	    // Replace this comment with the rest of your code   
	}
}
