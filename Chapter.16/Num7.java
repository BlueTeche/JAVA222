import java.util.Scanner;
import java.io.*;

public class Num7{

    public static void main(String[] args){

	int firstn, secondn, res;

	Scanner in = new Scanner(System.in);
	System.out.print("Enter a first number: ");
	firstn = in.nextInt();
	System.out.print("Enter a second number: ");
	secondn = in.nextInt();

	res = PowerMethod(firstn, secondn);

	System.out.println(firstn + " times " + secondn + " is " + res);

    }

    public static int PowerMethod(int a, int b){

	if(b == 0){
	    return 1;
	}else{
	    return a*PowerMethod(a, b-1);
	} 

    }

}