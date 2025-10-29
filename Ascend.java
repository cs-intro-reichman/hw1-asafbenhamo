// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		 int lim = Integer.parseInt(args[0]);
		 double a = Math.random() ;
		 double b = Math.random() ;
		 double c = Math.random() ;

		 a = a * lim;
		 b = b * lim;
		 c = c * lim;

		 double d = Math.max(a, b);
		 d = Math.max(d, c);

		 double e = Math.min(a, b);
		 e = Math.min(e, c);

		 double f = Math.max(a, b);
		 double g = Math.max (a,c);
		 f = Math.min(f, g);
		 System.out.println((int) a + " " +(int) b + " " +(int) c);
		 System.out.println((int)e + " " +(int) f + " " + (int) d);



	}
}
