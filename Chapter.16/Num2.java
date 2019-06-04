import java.util.Scanner;

public class Num2{
    public static void main(String[] args){

	int targetn, count=0;
	int[] num = {4, 7, 1, 25, 21, 17, 19, 20, 22, 0, 28};
	boolean re;

	Scanner in = new Scanner(System.in);

	System.out.println("Enter a number between 0~30: ");
	targetn = in.nextInt();

	if (isMember(targetn, num, count)){
	    System.out.println("We fount it.");
	} else{
	    System.out.println("The number is not in the array.");
	}

    }

    public static boolean isMember(int a, int[] arr, int c){
	int compn = arr[c];

	if(a == compn){
	    return true;
	}else if( (c+1) == arr.length){
	    return false;
	}else{
	    return isMember(a, arr, c+1);
	} 	
    }
}