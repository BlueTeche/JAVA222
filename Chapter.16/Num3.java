import java.util.Scanner;
import java.io.*;

public class Num3{
    public static void main(String[] args){

	String inputs;
	int leng;

	Scanner in = new Scanner(System.in);
	System.out.print("Enter any word or sentence: ");
	inputs = in.nextLine();

	leng = inputs.length() -1;
	StringR(inputs, leng);
    }

    public static void StringR(String a, int l){
	if(l >= 0){
	    System.out.print(a.charAt(l));
	    StringR(a, l-1);
	}
    }
}