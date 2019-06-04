import java.util.Scanner;

public class PenniesForPay{

   public static void main(String[] args){

	int days, payr = 1, totalp = 0, dcount = 1;

	Scanner in = new Scanner (System.in);
	System.out.print("Enter the period that you worked : ");
	days = in.nextInt();
	
	while(days < 1){
	   System.out.println("Invalid value. Please enter the period again.");
	   System.out.print("Enter the period that you worked : ");
	   days = in.nextInt();
	}
	in.close();

	System.out.println("Day\t\tEarned");
	System.out.println("-----------------------");

	while(dcount <= days){
	   System.out.println(dcount + "\t\t" + payr);
	   dcount++;
	   totalp += payr;
	   payr *= 2;
	}

	double ttp = totalp / 100.0;
	System.out.printf("$%.2f",ttp);	
   }
}