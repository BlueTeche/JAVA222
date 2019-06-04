public class employee{

    private String name;
//    private int emnum;
//    private String emletter;
    private String finalnum;
    private String date;

    public employee(){
	name = " ";
	finalnum = " ";
	date = " ";
    }
    
    public employee(String a, String b, String c){
	setN(a);
	setNum(b);
	setDate(c);
    }

    public void setN(String a){
	name = a;
    }
    public void setNum(String a){
	finalnum = a;
    }
    public void setDate(String a){
	date = a;
    }

    public String getNa(){
	return name;
    }
    public String getNum(){
	return finalnum;
    }
    public String getDate(){
	return date;
    }

}