import java.util.*;

public class PrimeNumber{

   public static void main(String[] args){

	int num = 1;
	int c = 0;

	List<Integer> pl = new ArrayList<Integer>();

	while(c < 100){
	   num++;
	   int cc = 0;
	   for(int i = 2; i < num; i++){
		if(num % i == 0){
		   cc++;
		}
	   }
	   if(cc == 0){
		c++;
		pl.add(num);
	   }
	}

	ListIterator<Integer> ite = pl.listIterator();
	while(ite.hasNext()){
	   System.out.println(ite.next());
	}
   }
}
