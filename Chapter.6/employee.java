public class employee{

    private int idnum;
    private String name;
    private String depart;
    private String position;

    public employee(){
	idnum = 0;
	name = " ";
	depart = " ";
	position = " ";
    }

    public employee(String na, int idn, String dep, String pos){
	idnum = idn;
	name = na;
	depart = dep;
	position = pos;
    }

    public employee(String na, int idn){
	idnum = idn;
	name = na;
	depart = " ";
	position = " ";
    }

    void setV(String na, int idn, String dep, String pos){
	idnum = idn;
	name = na;
	depart = dep;
	position = pos;
    }

    String getname(){
	return name;
    }

    int getidnum(){
	return idnum;
    }

    String getdep(){
	return depart;
    }

    String getposi(){
	return position;
    }
}
