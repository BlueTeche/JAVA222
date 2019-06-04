import java.util.Scanner;

public class TestScores{

   public static void main(String[] args){

	int firsts, seconds, thirds, total;
	double aveg;

	Scanner in = new Scanner (System.in);

	System.out.print("Enter the first score: ");
	firsts = in.nextInt();

	System.out.print("Enter the second score: ");
	seconds = in.nextInt();

	System.out.print("Enter the third score: ");
	thirds = in.nextInt();

	in.close();

	total = firsts + seconds + thirds;
	aveg = total / 3;

	System.out.println("The average is " + aveg + ".");

	if( aveg >= 90){
	   System.out.println("Your letter grade is A");
	} else if (aveg >= 80){
	   System.out.println("Your letter grade is B");
	} else if (aveg >= 70){
	   System.out.println("Your letter grade is C");
	} else if (aveg >= 60){
	   System.out.println("Your letter grade is D");
	} else {
	   System.out.println("Your letter grade is F");
	}
   }
}