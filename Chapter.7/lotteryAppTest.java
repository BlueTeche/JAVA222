import java.util.Scanner;

public class lotteryAppTest{

   public static void main(String[] args){

	int inputarr[] = new int[5];
	int match;

	Scanner in = new Scanner(System.in);
	for(int i = 0; i < 5; i++){
	   System.out.print("Enter your number (0~9): ");
	   inputarr[i] = in.nextInt();
	}
	
	lotteryApp ob = new lotteryApp();
	ob.findmatch(inputarr);

	match = ob.getmatchNum();

	if(match == 5){
	   System.out.println("\nYou win!!");
	} else{
	   System.out.println("\nYou have " + match + " matches.");
	   System.out.println("\nRadom number was...");
	   for(int i = 0; i < 5; i++){
		System.out.print(ob.getrandArr(i) + " ");
	   }
	}
   }
}