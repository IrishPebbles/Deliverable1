import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userNum1 = 0;	//first number the user enters, used to make calculations
		int userNum2 = 0;	//second number the user enters, used to make calculations
		
		int hundreds1 = 0;	//hundredths place for userNum1
		int tens1 = 0;		//tenths place for userNum1
		int ones1 = 0;		//ones place for userNum1
		int hundreds2 = 0;	//hundredths place for userNum2
		int tens2 = 0;		//tenths place for userNum2
		int ones2 = 0;		//ones place for userNum2
		
		int hundreds = 0;	//final calculation for hundredths place
		int tens = 0;		//final calculation for tenths place
		int ones = 0;		//final calculation for ones place
		
		
		/* User needs to choose two numbers for the calculations to be able to perform. To minimize 
		 * the number of needed variables the user is asked to keep their number to 3 digits.*/
		System.out.println("Let\'s find two numbers that add together to make a repeating number!");
		System.out.println("For example, 123 + 321 = 444");
		System.out.println();
		
	
		System.out.println("Please enter a 3 digit number:"); 
		
		//this is the first data input from the user. This will allow for the future calculations needed
	//FIXME: This needs data validation
		userNum1 = scnr.nextInt();
		
		//data input validation to the user so they know the system has taken in their number
		System.out.println();
		System.out.println("You have entered " + userNum1 + ". Thank you!");
		System.out.println();
		
		System.out.println("Please enter a second 3-digit number:");
		
		//this is the second data input from the user. This will allow for the future calculations needed
	//FIXME: This needs data validation
		userNum2 = scnr.nextInt();
		
		//data input validation to the user so they know the system has taken in their number
		System.out.println();
		System.out.println("You have entered " + userNum2 + ". Thank you!");
		System.out.println("Let\'s see what that gets you...");
		System.out.println();
		
		/*
		 * The three following block of code take the userNum and break it into its 
		 * individual digits to allow for computation and comparison. 
		 */
		hundreds1 = userNum1/100;
		tens1 = (userNum1 - (hundreds1 * 100)) / 10;
		ones1 = userNum1 - (hundreds1 * 100) - (tens1 * 10);
		
		hundreds2 = userNum2/100;
		tens2 = (userNum2 - (hundreds2 * 100)) / 10;
		ones2 = userNum2 - (hundreds2 * 100) - (tens2 * 10);
		
		hundreds = hundreds1 + hundreds2;
		tens = tens1 + tens2;
		ones = ones1 + ones2;
		
		/*
		 * by comparing the first 2 and then the last 2 numbers we can determine if the 
		 * resulting number has the desired repeating pattern, then output to the user accordingly
		 */
		if (hundreds == tens && tens == ones) {
			System.out.println("true");
			System.out.println("Great job! Your numbers add to " + hundreds + tens + ones + ".");

		}
		else {
			System.out.println("false");
			System.out.println("Not quite there! Your numbers add to " + hundreds + tens + ones + ".");

		}
		
		System.out.println();
		
		/*The code below shows the beginning of my first attempt at user input validation, but I couldn't
		 * figure out how to get the string to an integer
		 * 
		 * Eventually I just went back and restarted with Integers
		 * 
		do {
			userInput1 = scnr.next();
			if(userInput1.length() != 3) {
				System.out.println("Please enter a valid, " + NUMBER_DIGITS + 
						" digit number (Ex: 001, 072, 691)");
			}
					
		}while(userInput1.length() != 3);
		
		do {
			userInput2 = scnr.next();
			if(userInput2.length() != 3) {
				System.out.println("Please enter a valid, " + NUMBER_DIGITS + 
						" digit number (Ex: 001, 072, 691)");
			}
					
		}while(userInput2.length() != 3);
		*/
	}
}
