/*
 *
 * Project: Week1 Exercise
 * Author:  Osbardo Rodriguez
 * Date:    2/6/18
 */
package week1_exercise;

/*
 * Import the Scanner java package
 */
import java.util.Scanner;

/**
 * Define class Week1_exercise
 */
public class Week1_exercise {

	/**
	 * @param args command line arguments
	 */
	public static void main( String[] args ) {

		/*
		 * Declare the all of the variables used in the class.
		 */
		int userVar1;
		int userVar2;
		int sum;
		int difference;
		int quotient;
		int remainder;

		/*
		 * Instantiate the Scanner
		 */
		Scanner input = new Scanner( System.in );

		/*
		 * Let the user know what we'll be doing with their inputs.
		 */
		System.out.println( "Please enter two numbers to get the sum, difference, quotient, and remainder." );

		/*
		 * Get the first user variable.
		 */
		System.out.print( "Please enter the first number: " );
		userVar1 = input.nextInt();

		/*
		 * Get the second user variable.
		 */
		System.out.print( "Please enter the second number: " );
		userVar2 = input.nextInt();

		/*
		 * Do the math
		 */
		sum        = userVar1 + userVar2;
		difference = userVar1 - userVar2;
		quotient   = userVar1 / userVar2;
		remainder  = userVar1 % userVar2;

		/*
		 * Give the user the answers.
		 */
		System.out.println( "Your numbers calculate to the following:" );
		System.out.println( "Sum: " + sum );
		System.out.println( "Difference: " + difference );
		System.out.println( "Quotient: " + quotient );
		System.out.println( "Remainder: " + remainder );
	}
}
