import java.util.Scanner;

public class carTest{

    public static void main(String[] args){

	int modely, speed, acce, brake;
	String make, mo;
	
	Scanner in = new Scanner(System.in);	
	car ob1 = new car();
	
	System.out.print("Enter a car's year model: ");
	mo = in.nextLine();
	modely = Integer.parseInt(mo);
	System.out.print("Enter a make of the car: ");
	make = in.nextLine();
	System.out.print("Enter a car's current speed: ");
	speed = in.nextInt();
	System.out.print("How many times to accelerate? ");
	acce = in.nextInt();
	System.out.print("How many times to brake? ");
	brake = in.nextInt();

	ob1.setV(modely, make, speed);

	System.out.println("Year of Model: " + ob1.getym());
	System.out.println("Make of the car: " + ob1.getmake());
	System.out.println("Current speed: " + ob1.getspeed());
	
	for(int i = 0; i < acce; i++){
	   ob1.accelerate();
	   System.out.println((i+1) + " times to accelerate: " + ob1.getspeed());
	}

	for(int i = 0; i < brake; i++){
	   ob1.brake();
	   System.out.println((i+1) + " times to brake: " + ob1.getspeed());
	}


   }
}