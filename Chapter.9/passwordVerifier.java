import java.util.Scanner;

public class passwordVerifier{

   public static void main(String[] args){

	String passw;
	char x;
	int length;
	boolean upperCase = false;
	boolean lowerCase = false;
	boolean onedigit = false;
	boolean lengthdd = false;
	
	Scanner in = new Scanner(System.in);

	System.out.print("Enter your password: ");
	passw = in.nextLine();

	length = passw.length();

	if(length >= 6){
	   lengthdd = true;
	}

	for(int i = 0; i < length; i++){
	   x = passw.charAt(i);
	   if(Character.isUpperCase(x)){
		upperCase = true;
	   } else if (Character.isLowerCase(x)){
		lowerCase = true;
	   } else if (Character.isDigit(x)){
		onedigit = true;
	   } 
	}

	if(upperCase && lowerCase && onedigit && lengthdd){
	   System.out.println("You can keep this as your password.");
	} else {
	   System.out.println("Sorry, make another password.");
	}
   }
}

	   