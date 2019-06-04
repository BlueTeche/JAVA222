public class Essay extends GradedActivity{

    private int gram;
    private int spel;
    private int correct;
    private int cont;

    public Essay(int a, int b, int c, int d){
	gram = a;
	spel = b;
	correct = c;
	cont = d;
	super.setScore(gram + spel + correct + cont);
    }

    public int getGram(){
	return gram;
    }
    public int getSpel(){
	return spel;
    }
    public int getCorrect(){
	return correct;
    }
    public int getCont(){
	return cont;
    }
}