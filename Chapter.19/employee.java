import java.util.Map;
import java.util.HashMap;

public class employee{

   private String name;
   private int idnum;

   public employee(String a, int b){
	name = a;
	idnum = b;
   }

   public String getN(){
	return name;
   }

   public int getId(){
	return idnum;
   }

   public String getInfo(){
	return "Name: "+name+"\tID Number: "+idnum;
   }
}