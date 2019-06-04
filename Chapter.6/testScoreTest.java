import java.util.Scanner;

public class testScoreTest{

   public static void main(String[] args){

	int num1, num2, num3;

	Scanner in = new Scanner(System.in);

	testScore ob1 = new testScore();

	System.out.print("Enter your score: ");
	num1 = in.nextInt();
	System.out.print("Enter your score: ");
	num2 = in.nextInt();
	System.out.print("Enter your score: ");
	num3 = in.nextInt();

	ob1.setV(num1, num2,num3);

	System.out.println("Your average is " + ob1.getave());
   }
}