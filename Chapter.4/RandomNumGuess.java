import java.util.Scanner;
import java.util.Random;


public class RandomNumGuess{

	public static void main(String[] args){
	
	int guessnum, randomnum;

	Scanner in = new Scanner(System.in);

	Random rd = new Random();

	randomnum = rd.nextInt(100);

	do{
	
	System.out.print("Guess one number between 1 to 100. Enter :");

	guessnum = in.nextInt();

		if(guessnum > randomnum){

		System.out.println("TOO HIGH!! TRY AGAIN.");

		} else if(guessnum < randomnum) {

		System.out.println("TOO LOW!! TRY AGAIN.");

		} else {

		System.out.println("You are right!! The number is " + randomnum + "!!!");

		}
		

	} while(guessnum != randomnum);	



	}

}