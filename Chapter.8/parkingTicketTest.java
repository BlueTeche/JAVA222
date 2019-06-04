import java.util.Scanner;

public class parkingTicketTest{

   public static void main(String[] args){

	parkedCar ob = new parkedCar("Hyundae", "TY", "Black", "296-ABC", 52);
	parkingMeter me = new parkingMeter(60);
	publicOfficer pu = new publicOfficer("John Smith", 2405928);
	parkingTicket pt = new parkingTicket(80.0,34);

	double ticket = publicOfficer.search(ob, me);

	if(ticket != 0){
	    System.out.println(ticket);
	} else {
	    System.out.println("Car is not doing anything wrong!");
	}

	System.out.println("The license number is " + ob.getlicn());
	System.out.println("The model is " + ob.getmodel());
	System.out.println("The Officer badgenumber is " + pu.getBadge());
	System.out.println(pt.getRes());
   }
}