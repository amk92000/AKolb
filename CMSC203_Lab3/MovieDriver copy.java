import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Movie Movie = new Movie();
	
	String userInput;
	
	do {
	//Movie title
	System.out.println("Enter the title of the movie: ");
	String movieTitle = input.nextLine();
	Movie.setTitle(movieTitle);
	
	//Movie Rating
	System.out.println("Enter the rating of the movie: ");
	String rating = input.nextLine();
	Movie.setRating(rating);
	
	//Sold tickets
	System.out.println("Enter the number of tickets sold for this movie: ");
	int soldTickets = input.nextInt();
	Movie.setSoldTickets(soldTickets);
	
	//Program Output
	System.out.println(Movie.toString());
	
	input.nextLine();
	
	System.out.println("Do you want to enter another? (y or n): ");
     userInput = input.nextLine();
    
	
	}while(userInput.contentEquals("y"));
	
	System.out.println("Goodbye");
}
}	
 