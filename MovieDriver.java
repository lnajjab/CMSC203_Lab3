import java.util.Scanner;

public class MovieDriver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Movie myMovie = new Movie();
		String response;
		char responseChar;
		boolean repeat = true; 
	
	while (repeat)
		{
		System.out.println("Enter the title of a movie: ");
		myMovie.setTitle(keyboard.nextLine());
		  
		System.out.println("Enter the movie's rating: ");
		myMovie.setRating(keyboard.nextLine());
		
		System.out.println("Enter how many tickets were sold: ");
		myMovie.setSoldTickets(keyboard.nextInt());
		
		System.out.println(myMovie.toString());
		
		System.out.println("Would you like to enter a new movie(y/n)?");
		keyboard.nextLine();
		response = keyboard.nextLine();
		responseChar = response.charAt(0);
		
		if (responseChar == 'y' || responseChar == 'Y')
		{
			repeat = true;
		}
		else if (responseChar == 'n' || responseChar == 'N')
		{
			repeat = false; 
		}
		else
		{
			System.out.println("Invalid Response, but I'll take it as a yet");
			repeat = true;
		}
		
		
	
		}
	
	}
	

}
