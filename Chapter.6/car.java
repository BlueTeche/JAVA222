public class car{

    private int yearM;	
    private String make;
    private int speed;
//    private int acce;

    public car(){
	yearM = 0;
	make = " ";
	speed = 0;
    }

    public car(int a, String b, int c){
	yearM =a;
	make = b;
	speed = c;
    }

    public void accelerate(){
	speed += 5;
    }

    public void brake(){
	speed -= 5;
    }

    void setV(int a, String b, int c){
	yearM = a;
	make = b;
	speed = c;
    }

    int getym(){
	return yearM;
    }

    int getspeed(){
	return speed;
    }
    String getmake(){
	return make;
    }	


}