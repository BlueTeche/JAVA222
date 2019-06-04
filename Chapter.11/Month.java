import java.io.*;
public class Month{

    private int num;
    private boolean check;

    public Month(){
    }

    public Month(int a) throws WrongN {
	setNum(a);
    }

    public Month (String a){
	String up = a.toUpperCase();
	if(up.equals("JANUARY")){
	    setNum(1);
	} else if(up.equals("FEBRUARY")){
	    setNum(2);
	} else if(up.equals("MARCH")){
	    setNum(3);
	} else if(up.equals("APRIL")){
	    setNum(4);
	} else if(up.equals("MAY")){
	    setNum(5);
	} else if(up.equals("JUNE")){
	    setNum(6);
	} else if(up.equals("JULY")){
	    setNum(7);
	} else if(up.equals("AUGUST")){
	    setNum(8);
	} else if(up.equals("SEPTEMBER")){
	    setNum(9);
	} else if(up.equals("OCTOBER")){
	    setNum(10);
	} else if(up.equals("NOVEMBER")){
	    setNum(11);
	} else if(up.equals("DECEMBER")){
	    setNum(12);
	} else{
	    System.out.println("Wrong Value.");
	}
    }

    public void setNum(int a){
	if((a<1) || (a> 12)){
	    System.out.println("It should be between 1 and 12.	");
	} else {
	    num = a;
	}
    }

    public int getNum(){
	return num;
    }

    public String getName(){
	switch(num){
	   case 1:
		return "JANUARY";
	   case 2:
		return "FEBRUARY";
	   case 3:
		return "MARCH";
	   case 4:
		return "APRIL";
	   case 5:
		return "MAY";
	   case 6:
		return "JUNE";
	   case 7:
		return "JULY";
	   case 8:
		return "AUGUST";
	   case 9:
		return "SEPTEMBER";
	   case 10:
		return "OCTOBER";
	   case 11:
		return "NOVEMBER";
	   case 12:
		return "DECEMBER";
	   default :
		return "JANUARY";
	}
    }

    public String toS(){
	return getName();
    }

    public boolean bNum(Month a){
	if(this.getNum() > a.getNum()){
	    check = true;
	    return check;
	}else {
	    check = false;
	    return check;
	}
    }

    public boolean sNum(Month a){
	if(this.getNum() < a.getNum()){
	    check = true;
	    return check;
	}else {
	    check = false;
	    return check;
	}
    }

    public boolean equal(Month a){
	if(this.getNum() == a.getNum()){
	    check = true;
	    return check;
	}else {
	    check = false;
	    return check;
	}
    }

}