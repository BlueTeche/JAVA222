public class publicOfficer{

   private String name;
   private int badgenum;
   private static double ticket;

   public publicOfficer(String a, int b){
	name = a;
	badgenum = b;
   }

   public String getName(){
	return name;
   }

   public int getBadge(){
	return badgenum;
   }
   
   static double search(parkedCar a, parkingMeter b){
	int t = parkedCar.getmin();
	if(t > parkingMeter.getmins()){
	    if(t <= 60){
		ticket = 25;
	    } else {
		ticket = 25 + (10 * (t/60));
	    }
	}
	return ticket;
   }

}