public class bankAccount{

    private double balance;
    private double numdep;
    private double numwi;
    private double interestr;
    private double monser;

    public bankAccount(){
	balance = 0;
	numdep = 0;
	numwi = 0;
	interestr = 0;
	monser = 0;
    }

    public bankAccount(double a, double b){
	balance = a;
	interestr = b;
	numdep = 0;
	numwi = 0;
	monser = 0;
    }

    public void deposit(double a){
	balance += a;
	numdep++;
    }

    public void withdraw(double a){
	balance -= a;
	numwi++;
    }

    public void calcInterest(){
	double monthlyr = interestr / 12;
	double monthlyIn = balance * monthlyr;
	balance += monthlyIn;
    }

    public void monthlyPro(){ 
	balance -= monser;
	calcInterest();
	numdep = 0;
	numwi = 0;
	monser = 0;
    }

    public void setBal(double a){
	balance = a;
    }
    public void setNumDep(double a){
	numdep = a;
    }
    public void setNumWi(double a){
	numwi = a;
    }
    public void setInter(double a){
	interestr = a;
    }
    public void setMonC(double a){
	monser = a;
    }

    public double getBal(){
	return balance;
    }
    public double getNumDep(){
	return numdep;
    }
    public double getNumWi(){
	return numwi;
    }
    public double getInter(){
	return interestr;
    }
    public double getMonC(){
	return monser;
    }

}