public class CelToFah{

   public static void main(String[] args){

	double cels = 0, fahr;

	System.out.println("This is a table of the celsuius and fahrenheit temp 0~20.");
	System.out.println("Celsius\t\tFahrenheit");
	System.out.println("------------------------------");
	
	while( cels <= 20){
	   fahr = (9*cels / 5) + 32;
	   System.out.println(cels + "\t\t" + fahr);
	   cels++;
	}
   }
}