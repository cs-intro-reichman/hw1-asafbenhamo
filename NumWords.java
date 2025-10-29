// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		 int number = Integer.parseInt(args[0]);
		 int h = number / 100;
		 int a = number - (h * 100);
		 a = a / 10 ;
		 int b = number - (h *100) - ( a * 10) ;

		 System.out.println(h + " hundreds, " + a + " tens, and " + b + " ones.");
	}
}
