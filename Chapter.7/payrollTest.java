import java.util.Scanner;

public class payrollTest{

   public static void main(String[] args){

	int hrs;
	double payr, wag;
	payroll ob = new payroll();
	Scanner in = new Scanner(System.in);

	for(int i = 0; i < 7; i++){
	   System.out.println("\nEmployee # " + (i+1));
	   System.out.print("   Hours: ");
	   hrs = in.nextInt();
	   System.out.print("   Pay rates: ");
	   payr = in.nextDouble();

	   ob.sethrs(i, hrs);
	   ob.setpayr(i, payr);
	   ob.setwage(i, hrs, payr);
	}
	
	System.out.print("\n");

	for(int i = 0; i < 7; i++){
	   System.out.println("ID: " + ob.getId(i) + "\tGross Wages: " + ob.getwage(i));
	}

   }
}