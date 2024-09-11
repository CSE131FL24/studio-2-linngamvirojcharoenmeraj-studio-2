package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Start Amount
		System.out.println("How much do you want to put in your account?");
		int startAmount = in.nextInt();
		System.out.println("Start Amount: " + startAmount);
		
		
		//Win Chance 
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		// Win Limit 
		System.out.println( "The Win Limit is : " + winLimit);
		
		
		while (startAmount<=winLimit||startAmount>=0) {
			double chance = Math.random ();	
		
			if (chance <= winChance) {
				String y = "win";
				System.out.println("You" + y);
				startAmount = startAmount + 1;
				System.out.println("Here is your total amount: " + startAmount);
				
			} else {
				System.out.println("You Lose!");
			}
		
		
		
		
			
		}
			
			
		
		
				

	}

}
