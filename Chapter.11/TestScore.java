public class TestScore{

    private int[] score;
    private int ave;

    public TestScore(int[] a) throws IllegalArgumentException{
	ave = validS(a);
	score = a;
    }

    private int validS(int[] a){
	int av = 0;
	for(int i = 0; i < a.length; i++){
	    if(a[i] < 0 || a[i] > 100) throw new IllegalArgumentException("#" + (i+1) + "'s score is illegal.");
	    av += a[i];
	}
	return (av/a.length);
    }

    public int getAv(){
	return ave;
    }
}