import java.util.Random;
import java.util.Scanner;
/*******
 * 
 * @author >>Rana Siroosian<<
 *
 */
public class DiceRolling {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		System.out.println("Welcome to the Grand Circus Casino!\n");
		
		int rolls = 0;
		boolean looping = true;
		
		while (looping) {
			
			rolls ++;
			
			System.out.println("How many sides should each die have? ");
			int num = scnr.nextInt();
			System.out.println();
			
			System.out.println("Roll " + rolls);
			int num1 = (generateRandomDieRoll(num));
			int num2 = (generateRandomDieRoll(num));
			
			System.out.println("Die 1 = " + num1+ "\n"  + "Die 2 = " + num2);
			
				if ( rolls == 1) {
					System.out.println( isCraps(num1 + num2));
					}
				else {
					System.out.println( specialCombinations(num1+num2));
					System.out.println();
				}
				
			System.out.println();
			System.out.println("Roll again? (y/n)");
		
			if (scnr.next().startsWith("n")) {
	
				System.out.println("Thank you, Goodbye");
				
			looping = false;
			}
		}
		
		scnr.close();
	}
	
	private static int generateRandomDieRoll(int numSides) {
		
		int result = 0;
		
		Random rand = new Random();
		
		for(int i=1; i<= 2;i++) {
			int low = 1;
			result = rand.nextInt(numSides) + low;
		 
		 }
		
		return result;
		
	}
	
	private static String specialCombinations (int sum) {
		
		if (sum == 2) {
			return "Snake eyes!";
		}
		else if (sum == 12) {
			return "Box cars";
		}
		
		return "No special Combinations";
		
	}
	
	private static String isCraps( int sum) {
		
		if (sum == 2 || sum == 3 || sum == 12) 
			return "Craps!";
		
		return specialCombinations(sum);
		
	}
}	
