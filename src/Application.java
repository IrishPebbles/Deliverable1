import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String userData1 = "";
		String userData2 = "";

		final int NUMBER_DIGITS = 3;
		int userNum1 = 0;
		int userNum2 = 0;

		int hundreds1 = 0;
		int tens1 = 0;
		int ones1 = 0;
		int hundreds2 = 0;
		int tens2 = 0;
		int ones2 = 0;

		int hundreds = 0;
		int tens = 0;
		int ones = 0;

		boolean isNumber = true;

		System.out.println("Please enter a " + NUMBER_DIGITS + " digit number.");

		/* here we need to take the user data in, verify it is a number, and 
		 * that that number is the correct number of digits. We are doing that for two 
		 * sets of data. The do-while loop ensures that the user has the opportunity to 
		 * re-enter data if their first, or subsequent, data attempt is incorrect.*/
		
		do {
			try {
				userData1 = scnr.next();
				userNum1 = Integer.parseInt(userData1);
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("Whoops! Please enter a number");
				isNumber = false;
			}
			if (userData1.length() != 3) {
				System.out.println("Please enter a valid, " + NUMBER_DIGITS + " digit number (Ex: 001, 072, 691)");
			}
		} while (userData1.length() != 3 || isNumber == false);

		System.out.println("Please enter a second " + NUMBER_DIGITS + " digit number.");

		do {
			try {
				userData2 = scnr.next();
				userNum2 = Integer.parseInt(userData2);
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("Whoops! Please enter a number");
				isNumber = false;
			}
			if (userData2.length() != 3) {
				System.out.println("Please enter a valid, " + NUMBER_DIGITS + " digit number (Ex: 001, 072, 691)");
			}
		} while (userData2.length() != 3 || isNumber == false);

		/* I decided to break the user data down into individual digits and compare 
		 * that way. This process could be easily adapted for larger or smaller numbers.*/
		hundreds1 = userNum1 / 100;
		tens1 = (userNum1 - (hundreds1 * 100)) / 10;
		ones1 = userNum1 - (hundreds1 * 100) - (tens1 * 10);

		hundreds2 = userNum2 / 100;
		tens2 = (userNum2 - (hundreds2 * 100)) / 10;
		ones2 = userNum2 - (hundreds2 * 100) - (tens2 * 10);

		hundreds = hundreds1 + hundreds2;
		tens = tens1 + tens2;
		ones = ones1 + ones2;

		/* the check here ensures that each number matches the other, and that each digit does not exceed
		 * that which can be held by its position. EX, no single digit in the decimal system can hold a 
		 * number larger than 9 */
		if (hundreds == tens && tens == ones && ones <= 9) {
			System.out.println("true");
			System.out.println("Great job! Your numbers add to " + hundreds + tens + ones + ".");

		} else {
			System.out.println("false");
			System.out.println("Not quite there! Your numbers add to " + hundreds + tens + ones + ".");

		}

		scnr.close();
	}
}
