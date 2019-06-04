import java.util.Scanner;

public class bankAccountTest{

   public static void main(String[] args){

	int userc = 0;
	double deposit, withdraw;
	
	Scanner in = new Scanner(System.in);
	BankAccount ac = new BankAccount(2300);

	System.out.print(" Your balance is ");
	System.out.printf("$%.2f", ac.getBal());

	while(userc < 3){	
	   System.out.println("\n\n What do you want to do?\n Choose the number.\n 1. deposit\n 2. Withdraw\n Press any other number to FINISH your work.");
	   System.out.println(" -----------------------------");
	   System.out.print("Enter : ");
	   userc = in.nextInt();
	   if(userc == 1){
		System.out.print("\n How much you want to deposit? ");
		deposit = in.nextDouble();
		ac.deposit(deposit);
		System.out.print("\n Your balance is ");
		System.out.printf("$%.2f", ac.getBal());
	   } else if(userc == 2){
		System.out.print("\n How much you want to withdraw? ");
		withdraw = in.nextDouble();
		ac.withdraw(withdraw);	
		System.out.print("\n Your balance is ");
		System.out.printf("$%.2f", ac.getBal());	
	   } else{
		System.out.println("\n  ---Good Bye---");
	   }	
	}

   }
}