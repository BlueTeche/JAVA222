import java.util.Scanner;

public class isPrimeMethod{

   public static final Scanner in = new Scanner(System.in);

   public static void main(String[] args){

	int num;

	System.out.print("Enter a number: ");
	num = in.nextInt();

	if(isPrime(num)){
	   System.out.println("Prime number.");
	} else {
	   System.out.println("Wrong. Not a prime number.");
	}
   }

   public static boolean isPrime(int inputn){
	int c = 0;
	for(int i = 2; i < inputn; i++){
	   if(inputn % i == 0){
		c++;
	   }
	}
	if(c > 0){
	   return false;
	} else {
	   return true;
	}
   }
}	