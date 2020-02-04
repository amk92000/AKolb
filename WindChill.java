import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.println("Wind Chill Calculator");
	System.out.println("Please enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
	double Temp = input.nextDouble();
	System.out.println("Please enter the wind speed (must be >= 5 and <= 60): ");
	double Speed = input.nextDouble();
	double windChill = (35.74 + (0.6215 * Temp) - (35.75 * Math.pow(Speed, 0.16)) + (0.4275 * Temp * (Math.pow(Speed, 0.16))));
	System.out.print("Wind chill temperature: " + windChill + " degrees farenheit. \n");
	System.out.println("Programmer: Adam Kolb");
	
	}
}
