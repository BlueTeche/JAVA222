import java.util.Scanner;

public class TestAveGrade{

   public static void main(String[] args){


	double num;
	double total = 0.0;
	double aven;

	Scanner in = new Scanner(System.in);
	
	for(int i = 0; i < 5; i++){
	   System.out.print("Enter your grade: ");
	   num = in.nextDouble();
	   //determineGrade(num);
	   System.out.println("Your letter grade of " + num + " is " + determineGrade(num) + ".");
	   total += num;
	}
	
	aven = calcAverage(total);
	System.out.println("Your average is " + aven + ".");
	System.out.println("Your final letter grade is " + determineGrade(aven) + ".");

   }

   public static double calcAverage(double totaln){
	return totaln / 5.0;
   }

   public static String determineGrade(double inputn){
	String letterg;
	if( inputn >= 90){
	   letterg = "A";
	   return letterg;
	} else if ( inputn >= 80){
	   letterg = "B";
	   return letterg;
	} else if ( inputn >= 70){
	   letterg = "C";
	   return letterg;
	} else if ( inputn >= 60){
	   letterg = "D";
	   return letterg;
	} else {
	   letterg = "F";
	   return letterg;
	}
   }	

}

	