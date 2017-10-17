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

		System.out.println("Please enter a " + NUMBER_DIGITS + " digit number.");

		do {
			userData1 = scnr.next();
			if (userData1.length() != 3) {
				System.out.println("Please enter a valid, " + NUMBER_DIGITS + " digit number (Ex: 001, 072, 691)");
			}

		} while (userData1.length() != 3);

		System.out.println("Please enter a second " + NUMBER_DIGITS + " digit number.");

		do {
			userData2 = scnr.next();
			if (userData2.length() != 3) {
				System.out.println("Please enter a valid, " + NUMBER_DIGITS + " digit number (Ex: 001, 072, 691)");
			}

		} while (userData2.length() != 3);

		
		userNum2 = Integer.parseInt(userData2);

		hundreds1 = userNum1 / 100;
		tens1 = (userNum1 - (hundreds1 * 100)) / 10;
		ones1 = userNum1 - (hundreds1 * 100) - (tens1 * 10);

		hundreds2 = userNum2 / 100;
		tens2 = (userNum2 - (hundreds2 * 100)) / 10;
		ones2 = userNum2 - (hundreds2 * 100) - (tens2 * 10);

		hundreds = hundreds1 + hundreds2;
		tens = tens1 + tens2;
		ones = ones1 + ones2;

		if (hundreds == tens && tens == ones && ones <= 9) {
			System.out.println("true");
			System.out.println("Great job! Your numbers add to " + hundreds + tens + ones + ".");

		} else {
			System.out.println("false");
			System.out.println("Not quite there! Your numbers add to " + hundreds + tens + ones + ".");

		}

		System.out.println();

		scnr.close();
	}
}
