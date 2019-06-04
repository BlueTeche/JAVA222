public class InvalidTestScore extends Exception{

    public InvalidTestScore(int a){
	super("Error. The number should be between 0~100.");
    }

}