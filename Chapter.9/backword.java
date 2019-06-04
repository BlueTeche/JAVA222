import java.util.Scanner;


public class backword{

    public static void main(String[] args){

	String inputw;

	Scanner in = new Scanner(System.in);
	System.out.print("Enter a word: ");
	inputw = in.nextLine();

	reverseW(inputw);

    }

    public static void reverseW (String a){

	for(int i = a.length(); i > 0; i--){
	    System.out.print(a.charAt(i-1));
	}
    }

}