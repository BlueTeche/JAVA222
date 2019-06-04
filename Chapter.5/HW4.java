import java.util.Scanner;
public class HW4{
public static void main(String[] args){

int choice;
Scanner in = new Scanner(System.in);

System.out.println("Enter the number: ");
choice = in.nextInt();


	switch(choice){
	case 1:
		System.out.println("You selected 1.");
		break;
	case 2:
	case 3:
		System.out.println("You selected 2 or 3.");
		break;
	case 4:
		System.out.println("You selected 4.");
		break;
	default:
		System.out.println("Select again please.");
	   }

}
	    }
