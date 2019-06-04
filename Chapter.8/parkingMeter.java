public class parkingMeter{

   private static int mins;
   private String minsInfo;

   public parkingMeter(int a){
	mins = a;
   }

   public static int getmins(){
	return mins;
   }

   String getmInfo(){
	minsInfo = "Minutes purchased: " + mins;
	return minsInfo;
   }
}