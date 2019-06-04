public class payroll{

   private int employeeId[] = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
   private int hours[] = new int[7];
   private double payRate[] = new double [7];
   private double wages[] = new double [7];

   public void sethrs(int a, int b){
	hours[a] = b;
   }

   public void setpayr(int a, double b){
	payRate[a] = b;
   }   

   public void setwage(int a, int b, double c){
	wages[a] = b * c;
   }

   int getId(int a){
	return employeeId[a];
   }

   double getwage(int a){
	return wages[a];
   }

}