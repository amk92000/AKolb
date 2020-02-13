import java.util.Scanner;
public class SphereVolume {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		
		//Variable Declaration 
		double diameter;
		double radius;
		double volume;
	
		//Program description 
		System.out.println("This program will calculate the volume of a sphere based off the diameter! \n");
		
		//User input
		System.out.println("Please enter the diameter of the sphere: ");
		diameter = input.nextDouble();
		
		//Calculations
		radius = diameter / 2;
		volume = (4.0/3) * (Math.PI) * ((Math.pow(radius, 3)));
		
		//Output the answer
		System.out.print("The volume of the sphere is " + volume);
		
	} 
} 



