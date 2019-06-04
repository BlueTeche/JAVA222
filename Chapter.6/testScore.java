public class testScore{

    private double ave;

    public testScore(){
	ave = 0.0;
    }

    public testScore(int a, int b, int c){
	ave = (a + b + c) / 3.0;
    }

    void setV(int a, int b, int c){
	ave = (a + b + c) / 3.0;
    }

    double getave(){
	return ave;
    }
}
