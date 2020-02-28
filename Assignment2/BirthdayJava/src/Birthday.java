import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import _solution.Toy;
public class Birthday {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		Toy toy1 = new Toy();
			
	//Variable Declaration
	String name;
	int age;
	String toy;
	String card;
	String balloon;
	double total = 0;
	String anotherToy1, ageCheck = "no";
	
	//Welcome Box
	JFrame welcomePane = new JFrame();
	JOptionPane.showMessageDialog(welcomePane , "Welcome to the Toy Company to choose toys for young children");

	do {
	do {
	//Ask name
	JFrame namePane = new JFrame();
	name = JOptionPane.showInputDialog(namePane, "Enter the name of the child");
	
	//Ask age
	JFrame agePane = new JFrame();
	age = Integer.parseInt(JOptionPane.showInputDialog(agePane , "How old is the child?"));
	toy1.setAge(age);
	
	//Ask toy
	JFrame toyPane = new JFrame();
	toy = JOptionPane.showInputDialog(toyPane , "Choose a toy: plushie, blocks, or a book");
	toy1.setToy(toy);
	if(toy1.ageOK()) {
		;
	}
	else {
		JFrame ageCheckPane = new JFrame();
		ageCheck = JOptionPane.showInputDialog(ageCheckPane, "Age is not appropriate for toy. Would you like to cancel? Yes or No");
	}
	}while (ageCheck.contentEquals("yes"));
	
	toy1.setCost(toy);
	
	//Ask for card
	JFrame cardPane = new JFrame();
	card = JOptionPane.showInputDialog(cardPane, "Do you want a card with the gift? Yes or No");
	toy1.addCard(card);
	
	//Ask for balloon
	JFrame balloonPane = new JFrame();
	balloon = JOptionPane.showInputDialog(balloonPane, "Do you want a balloon with the gift? Yes of No");
	toy1.addBalloon(balloon);
	
	//Ask for another toy
	JFrame anotherToy = new JFrame();
	anotherToy1 = JOptionPane.showInputDialog(anotherToy, "Do you want another toy? Yes or No");
	System.out.println("The gift for " + name + toy1.toString());
	
	//Add up costs
	total += toy1.getCost();
	
	}while(anotherToy1.contentEquals("yes"));
	
	//print out total cost
	System.out.print("The total cost of your order is $" + total + ". ");
	
	//make up and print out random order number
	int orderNumber = (int)((Math.random() * 90000 + 10000));
	System.out.println("Order number is " + orderNumber);

	System.out.println("Programmer: Adam Kolb");
	
}
}
