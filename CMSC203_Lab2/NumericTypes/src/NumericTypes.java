/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in); 
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		System.out.println("Please enter the temperature: ");
		double temp = input.nextDouble(); //Task #2 declare a variable to hold the user’s temperature
		System.out.println("Please enter score 1: "); //Task #2 prompt user to input score1
		double scoreOne = input.nextDouble(); //Task #2 read score1 
		System.out.println("Please enter score 2: "); //Task #2 prompt user to input score2
		double scoreTwo = input.nextDouble(); //Task #2 read score2 
		double Average = (scoreOne + scoreTwo) / NUMBER; // Find an arithmetic average
		System.out.print(Average + "\n");
		average = score1 + score2 / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = 5.0/9 * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Please enter another temperature in Fahrenheit: "); //Task #2 prompt user to input another temperature
		double temp2 = input.nextDouble(); //Task #2 read the user’s temperature in Fahrenheit
		double celcius = 5.0/9 * (temp2 - 32); //Task #2 convert the user’s temperature to Celsius
		System.out.print(temp2 + " in Fahrenheit is " + celcius + " in Celsius. \n"); //Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}