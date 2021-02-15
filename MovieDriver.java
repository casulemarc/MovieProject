/**
 * In this lab, you are introduced to multiple classes (a driver class and a data element class).  
 * You will write the driver class in order to test the various methods provided in the data element class. 
 * You are given a file called Movie.java, which has the data fields for a movie, along with “setters” and “getters”, and a “toString” method.
 * You will create a driver class from the pseudocode in Task #1 and #2 as shown below to test the Movie class.
 * 
 * Task #1 Writing a Driver Class
 * 
 * Task #2 Writing a Loop
 * 
 * @author Mark Kasule
 */

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		//scanner object
		Scanner input = new Scanner(System.in);
		
		//create a movie object
		Movie myMovie = new Movie();
		
		//declare variables
		String movieName;			//store title
		String rating;				//movie rating
		int numOfTickets;			//number of tickets
		String response;
		
		//ask user to enter name of movie
		System.out.print("Enter the name of a movie: ");
		movieName = input.nextLine();		//store title
		
		//set the title of movie using the current class.method(input)
		myMovie.setTitle(movieName);
		
		//ask user to enter movie rating
		System.out.print("Enter the rating of the movie: ");
		rating = input.nextLine();		//store rating
		
		//set the rating of the movie
		myMovie.setRating(rating);
		
		//ask user to enter number of tickets
		System.out.print("Enter the number of tickets sold for this movie: ");
		numOfTickets = input.nextInt();		//store number of tickets
		
		//set number of tickets
		myMovie.setSoldTickets(numOfTickets);
		
		//collect or get all the values that have been set
		
		System.out.println(myMovie.toString());
		
		//ask user again
		System.out.print("Do you want to try again? (yes, no, y, n, Yes, No, NO, YES) ");
		response = input.nextLine();
		response = input.nextLine();
		
		//if response is yes
		while(response.equals("yes") || response.equals("YES") || response.equals("Yes") || response.equals("y")) 
		{
			//ask user to enter name of movie
			System.out.print("Enter the name of a movie: ");
			movieName = input.nextLine();		//store title
			
			//set the title of movie using the current class.method(input)
			myMovie.setTitle(movieName);
			
			//ask user to enter movie rating
			System.out.print("Enter the rating of the movie: ");
			rating = input.nextLine();		//store rating
			
			//set the rating of the movie
			myMovie.setRating(rating);
			
			//ask user to enter number of tickets
			System.out.print("Enter the number of tickets sold for this movie: ");
			numOfTickets = input.nextInt();		//store number of tickets
			
			//set number of tickets
			myMovie.setSoldTickets(numOfTickets);
			
			//collect or get all the values that have been set
			
			System.out.println("Results: " + myMovie.toString());
			
			//ask user again
			System.out.print("Do you want to try again? (yes, no, y, n, Yes, No, NO, YES) ");
			response = input.nextLine();
			response = input.nextLine();
			
			//if response is no
			if(response.equals("no") || response.equals("NO") || response.equals("No") || response.equals("n")) 
			{
				System.out.println("Thank you!! \nGoodbye");
				System.exit(0);
			}
			
		}
		
		//if response is no
		while(response.equals("no") || response.equals("NO") || response.equals("No") || response.equals("n")) 
		{
			System.out.println("Thank you!! \nGoodbye");
			System.exit(0);
		}
		
	}

}
