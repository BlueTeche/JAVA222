import java.util.Scanner;

public class TestScoreTest{

    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

	int inputn;
	System.out.println("How many test scores?: ");
	inputn = in.nextInt();

	int[] ts = getArray(inputn);

	try{
	    TestScore ob = new TestScore(ts);
	    System.out.println("\nAverage: " + ob.getAv());
	} catch (IllegalArgumentException e){
	    System.out.println("Invalid input value." + e.getMessage());
	}
    }

    public static int[] getArray(int a){
	int[] sco = new int[a];
	for(int i = 0; i < sco.length; i++){
	    System.out.println("#" + (i+1) + " test score: ");
	    sco[i] = in.nextInt();
	}
	return sco;
    }
}