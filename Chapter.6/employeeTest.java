import java.util.Scanner;

public class employeeTest{
   public static void main(String[] args){

	String name, department, position, idn;
	int idnumber;
	
	Scanner in = new Scanner(System.in);

	employee ob1 = new employee();

	System.out.print("Enter employee's name: ");
	name = in.nextLine();
	System.out.print("Enter employee's ID number: ");
	idn= in.nextLine();
	idnumber = Integer.parseInt(idn);
	System.out.print("Enter employee's department: ");
	department = in.nextLine();
	System.out.print("Enter employee's position: ");
	position = in.nextLine();



	ob1.setV(name, idnumber, department, position);
	
	System.out.println("\nName\t\tID Number\tDepartment\t\tPosition");	
	System.out.println("------------------------------------------------------------------");
	System.out.println(ob1.getname()+"\t" + ob1.getidnum()+"\t\t" + ob1.getdep() +"\t\t" + ob1.getposi());


   }
}