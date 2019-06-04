public class productionW extends employee{

   private int shift;
   private double hourlyp;

   public productionW(String a, String b, String c, int d, double e){
	super(a, b, c);
	setSh(d);
	setHP(e);
   }

   public void setSh( int a){
	shift = a;
   }
   public void setHP( double a){
	hourlyp = a;
   }

   public int getSh(){
	return shift;
   }
   public double getHP(){
	return hourlyp;
   }

}