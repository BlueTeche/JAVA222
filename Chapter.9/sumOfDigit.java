import java.util.Scanner;

public class sumOfDigit{

    public static void main(String[] args){

	String inputn;

	Scanner in = new Scanner(System.in);
	System.out.print("Enter your number: ");
	inputn = in.nextLine();

	sumOfS(inputn);
	
    }

    public static void sumOfS(String a){

	int res = 0;
	int x, num, hei = 0, low = 9;
	

	num = Integer.parseInt(a);

	while(num > 0){
	    x = num%10;
	    res += x;
	    if(x > hei){
		hei = x;
	    } else if(x < low){
		low = x;
	    }
	    num /= 10;
	}

	System.out.println("The sum of digits: " + res);
	System.out.println("The heighst digit: " + hei);
	System.out.println("The lowest digit: " + low);
    }

}