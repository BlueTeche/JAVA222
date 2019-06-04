public class savingAccount extends bankAccount{

    private boolean status = true;
/*    private double bal;
    private double withd;
    private double dep;

    public savingAccount(){
	bal = 0;
	withd = 0;
	dep = 0;
    } */

    public savingAccount(double a, double b){
	super(a, b);
	if(a >= 25){
	    status = true;
	} else {
	    status = false;
	}
    }

    public void withdraw(double a){
	if(status){
	    super.withdraw(a);
	    if(super.getBal() < 25){
		status = false;
	    }
	} else {
		System.out.println("Low Balance. Withdraw is not available.");
	}
    }

    public void deposit(double a){
	if(!status){
	    double av = super.getBal() + a;
	    if(av >= 25){
		status = true;
	    }
	}
	super.deposit(a);
    } 
    public void monthlyPro(){
	double c = super.getNumWi();
	if(c > 4){
	    super.setMonC(c - 4);
	    super.monthlyPro();
	    if(super.getBal() < 25){
		status = false;
	    }
	}
    }

    public boolean getStatus(){
	return status;
    }

    public void setStatus(boolean a){
	status = a;
    }

}