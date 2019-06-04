public class Num9{

    public static void main(String[] args){

	System.out.println("(0,0) : " + AckermannF(0,0));
	System.out.println("(0,1) : " + AckermannF(0,1));
	System.out.println("(1,1) : " + AckermannF(1,1));
	System.out.println("(1,2) : " + AckermannF(1,2));
	System.out.println("(1,3) : " + AckermannF(1,3));
	System.out.println("(2,2) : " + AckermannF(2,2));
	System.out.println("(3,2) : " + AckermannF(3,2));

    }

    public static int AckermannF(int a, int b){

	if(a == 0){
	    return b+1;
	} else if(b == 0){
	    return AckermannF(a-1, 1);
	} else {
	    return AckermannF(a-1, AckermannF(a, b-1));
	}

    }

}