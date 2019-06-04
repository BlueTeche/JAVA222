public class parkedCar{

   private String make;
   private String model;
   private String color;
   private String licensen;
   private static int numm;
   private String info;

   public parkedCar(String a, String b, String c, String d, int e){
	make = a;
	model = b;
	color = c;
	licensen = d;
	numm = e;
   }

   String  getmake(){
	return make;
   }

   String  getmodel(){
	return model;
   }

   String  getcolor(){
	return color;
   }

   String getlicn(){
	return licensen;
   }

   public static int getmin(){
	return numm;
   }

   String getinfo(){
	info = "Make: "+ make + "\nModel: " + model + "\nColor: " + color + "\nlicense Number: " + licensen + "\nParking time: " + numm;
	return info;
   } 

}