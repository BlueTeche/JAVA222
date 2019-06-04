import java.util.Scanner;

public class TimeCalculator{

   public static void main(String[] args){

	int inputn;

	Scanner in = new Scanner (System.in);

	System.out.print("Enter a number of seconds: ");
	inputn = in.nextInt();

	in.close();

	if(inputn < 60){
	   System.out.println("It is " + inputn + " seconds.");
	} else if (inputn < 3600){
	   System.out.println("It is " + (inputn / 60) + " minutes and " + (inputn % 60) + " seconds.");
	} else if (inputn < 86400){
	   int hours, mins, sec;
	   hours = inputn / 3600;
	   mins = (inputn % 3600) / 60;
	   sec = (inputn % 3600) % 60;
	   System.out.println("It is " + hours + " hours " + mins + " minutes and " + sec + " seconds.");
	} else {
	   int days, hs, ms, sc;
	   days = inputn / 86400;
	   hs = (inputn % 86400) / 3600;
	   ms = ((inputn % 86400) % 3600) / 60;
	   sc = ((inputn % 86400) % 3600) % 60;
	   System.out.println("It is " + days + " days " + hs+ " hours " + ms+ " minutes and " + sc+ " seconds.");
	}
   }
}
