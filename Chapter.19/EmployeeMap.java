import java.util.*;

public class EmployeeMap{

   public static void main(String[] args){

	Map<String, employee> em = new HashMap<String, employee>();

	employee ob = new employee("Jane", 47182);

	em.put(ob.getN(), ob);
	employee x = em.get(ob.getN());
	System.out.println(x);
   }

}