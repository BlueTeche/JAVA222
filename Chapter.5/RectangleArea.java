import java.util.Scanner;

public class RectangleArea{

   public static final Scanner in = new Scanner(System.in);

   public static void main(String[] args){

	double length, width, area;
	length = getLength();
	width = getWidth();
	area = getArea(length, width);
	displayData(length, width, area);
   }

   public static double getLength(){
	double lnum;
	System.out.print("Enter a length: ");
	lnum = in.nextDouble();
	return lnum;
   }

   public static double getWidth(){
	double wnum;
	System.out.print("Enter a width: ");
	wnum = in.nextDouble();
	return wnum;
   }

   public static double getArea(double leng, double widt){
	return leng * widt;
   }

   public static void displayData(double le, double wi, double ar){
	System.out.println("The length is " + le + ".");
	System.out.println("The width is " + wi + ".");
	System.out.println("The area of rectangle is " + ar + ".");
   }
}