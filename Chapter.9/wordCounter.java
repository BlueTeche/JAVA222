import java.util.Scanner;

public class wordCounter{

    public static void main(String[] args){

	String inputw;

	Scanner in = new Scanner(System.in);
	System.out.print("Enter your sentence: ");
	inputw = in.nextLine();

	counter(inputw);

    }

    public static void counter(String a){
	int c = 1;

	for(int i = 0; i< a.length(); i++){
	    if(Character.isSpaceChar(a.charAt(i))){
		c++;
	    }
	}

	System.out.println("You have " + c + " words.");

    }

}