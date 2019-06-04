import java.util.Scanner;

public class courseGTest{

    public static void main(String[] args){

	GradedActivity ob = new GradedActivity();
	ob.setScore(90);
	PassFailExam ab = new PassFailExam(60, 78, 83);
	Essay a = new Essay(30, 20, 54, 33);
	FinalExam b = new FinalExam(80, 90);
	courseG cg = new courseG();
	
	cg.setlab(ob);
	cg.setExam(ab);
	cg.setEss(a);
	cg.setFinal(b);

	cg.toString();
	System.out.println("Average: " + cg.getAve());
	
	GradedActivity hs = cg.getH();
	System.out.println("Highest: " + hs.getScore());
	GradedActivity ls = cg.getL();
	System.out.println("Lowest: " + ls.getScore());	

    }
}