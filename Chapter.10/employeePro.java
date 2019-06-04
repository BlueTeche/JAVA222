import java.util.Scanner;

public class employeePro{

    public static void main(String[] args){

	String name, id, date;
	int shi;
	double hp;

	Scanner in = new Scanner(System.in);

	System.out.print("Enter employee name: ");
	name = in.nextLine();
	System.out.print("Enter employee ID number: ");
	id = in.nextLine();
	System.out.print("Enter employee Date: ");
	date = in.nextLine();
	System.out.print("Enter employee shift (#1 day / #2 night): ");
	shi = in.nextInt();
	System.out.print("Enter hourly pay: ");
	hp = in.nextDouble();

	productionW ob = new productionW(name, id, date, shi, hp);

	System.out.println("Name: " + ob.getNa());
	System.out.println("ID: " + ob.getNum());
	System.out.println("Date: " + ob.getDate());
	System.out.println("Shift: " + ob.getSh());
	System.out.println("Hourly Rate: " + ob.getHP());
	
    }
}