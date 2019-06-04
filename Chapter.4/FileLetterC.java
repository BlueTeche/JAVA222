import java.util.Scanner;
import java.io.*;

public class FileLetterC{

   public static void main(String[] args) throws IOException {

	String filename;
	String specificc;
	int count = 0;

	Scanner in = new Scanner(System.in);

	System.out.print("Enter the name of a file : ");
	filename = in.nextLine();

	System.out.print("Enter the character that you want to find: ");
	specificc = in.nextLine();

	in.close();

	File file = new File(filename);
	Scanner inputf = new Scanner(file);
	while(inputf.hasNext()){
	   String fn = inputf.nextLine();
	   int leng = fn.length();
	   for(int i = 0; i < leng; i++){
		if(specificc.charAt(0) == fn.charAt(i)) count++;
	   }
		
	}
	inputf.close();

	System.out.println("There are " + count +" letters that match with " + specificc + ".");

   }
}