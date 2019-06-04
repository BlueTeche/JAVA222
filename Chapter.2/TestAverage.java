import java.util.Scanner;

public class TestAverage{

    public static void main(String[] args){
	
	int firstn, secondn, thirdn;
	double aveg;

	Scanner in = new Scanner (System.in);

	System.out.print("First number : ");
	firstn = in.nextInt();

	System.out.print("Second number : ");
	secondn = in.nextInt();

	System.out.print("Third number : ");
	thirdn = in.nextInt();
	in.close();

	aveg = (firstn + secondn + thirdn) / 3;

	System.out.println("The average is " + aveg);
    }

}