import java.util.Scanner;

public class areaTest{

   public static void main(String[] args){

	int wd, le;
	double ra, ra1, hei;

	Scanner in = new Scanner(System.in);
	area ob = new area();

	System.out.print("Enter a radius for area of circle :");
	ra = in.nextDouble();		

	System.out.print("Enter a width and length for area of rectangle:");
	wd = in.nextInt();
	le = in.nextInt();

	System.out.print("Enter a radius and height for area of cylinder:");
	ra1 = in.nextDouble();
	hei = in.nextDouble();

	System.out.println("The area of circle is " + ob.area(ra));
	System.out.println("The area of rectangle is " + ob.area(wd, le));
	System.out.println("The area of cylinder is " + ob.area(ra1, hei));
   }
}