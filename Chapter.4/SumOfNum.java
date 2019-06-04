import java.util.Scanner;

public class SumOfNum{

   public static void main(String[] args){

	int num, sum = 0;

	Scanner in = new Scanner (System.in);
	System.out.print("Enter a positive and nonzero integer number : ");
	num = in.nextInt();
	in.close();

	while(num > 0){
	   sum += num;
	   num --;
	}

	System.out.println("The sum of your numbers is " + sum + ".");
   }
}


	