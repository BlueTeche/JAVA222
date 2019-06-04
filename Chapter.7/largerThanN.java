import java.util.Scanner;
import java.util.Random;

public class largerThanN{

   public static void main(String[] args){

	int n;
	int arr[] = new int[7];

	Random rd = new Random();
	for(int i = 0; i < 7; i++){
	   arr[i] = rd.nextInt(100);
	}

	Scanner in = new Scanner(System.in);

	System.out.print("Enter a number you choose: ");
	n = in.nextInt();

	compareMethod(arr, n);
   }

   public static void compareMethod(int a[], int b){
	for(int i = 0; i < 7; i++){
	    if(a[i] > b){
		System.out.print(a[i] + " ");
	    }
	}
   }
}