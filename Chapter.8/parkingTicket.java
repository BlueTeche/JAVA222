public class parkingTicket{

   private parkedCar car;
   private publicOfficer co;
   private double res;
   private int numm;

   public parkingTicket(double c, int d){
	res = c;
	numm = d;
   }

   public parkingTicket(parkedCar a, publicOfficer b,double c, int d){
	car = a;
	co = b;
	res = c;
	numm = d;
   }

   public void getTotal(){
	int t = parkedCar.getmin() - parkingMeter.getmins();
	if(t <= 60){
	    res = 25;
	} else{
	    res = 25 + (10*(t/60));
	}
   }

   public parkedCar getVe(){
	return car;
   }
 
   public publicOfficer getCo(){
	return co;
   }
   
   public int getmin(){
	return numm;
   }
    
   public double getRes(){
	return res;
   }
}