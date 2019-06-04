import java.util.Scanner;

public class AccountTest{

    public static void main(String[] args){

	int choice = 0;
	double amount;

	savingAccount ob = new savingAccount(40,1.5);
	Scanner in = new Scanner(System.in);
	
	System.out.println("Balance: " + ob.getBal());
	printInfo(ob.getStatus());

	while(choice != 3){
	    System.out.println("\n1. withdraw\t2. deposit\t3. Done");
	    choice = in.nextInt();
	    if( choice == 1){
		System.out.print("Enter the amount to withdraw: ");
		amount = in.nextDouble();
		ob.withdraw(amount);
		System.out.println("New Balance: " + ob.getBal());
		printInfo(ob.getStatus());
	    } else if(choice == 2){
		System.out.print("Enter the amount to deposit: ");
		amount = in.nextDouble();
		ob.deposit(amount);
		System.out.println("New Balance: " + ob.getBal());
		printInfo(ob.getStatus());
	    }
	}
	
	System.out.println("Number of deposits made: " + ob.getNumDep());
	System.out.println("Number of withdraw made: " + ob.getNumWi());
	System.out.println("Monthly charges: " + ob.getMonC());	
    }

    public static void printInfo(boolean a){

	if(a){
	    System.out.println("Account is ACTIVE.");
	} else{
	    System.out.println("Account is INACTIVE.");
	}
    }
}