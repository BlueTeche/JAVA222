import java.util.*;

public class WordSet{

   public static void main(String[] args){

	String word;

	Scanner in = new Scanner(System.in);

	System.out.println("Enter words: ");
	word = in.nextLine();

	SortedSet<String> ss = new TreeSet<String>();

	StringTokenizer ob = new StringTokenizer(word);

	while(ob.hasMoreTokens()){
	   ss.add(ob.nextToken());
	}

	System.out.println("\nAfter sorting: ");
	for(String element: ss){
	   System.out.println(element);
	}	


   }

}