// Computes the future value of a saving investment.
public class FVCalc 
{
	public static void main(String[] args)
	{
		// Replace this comment with your code
        int saving = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double fsaving;
		double rate = interest/100;

		fsaving = saving *  Math.pow((1+rate), years) ;
		
		System.out.println( "After " + years + " years" + ", " + "$" + saving + " saved at " + interest + "%" + " will yield $" +(int) fsaving);
		
	 





	}
}