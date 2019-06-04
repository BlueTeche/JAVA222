class BankAccount{

   private double balance;

   public BankAccount(){
	balance = 0.0;
   }

   public BankAccount(double firstB){
	balance = firstB;
   }

   public BankAccount(String a){
	balance = Double.parseDouble(a);
   }

   public BankAccount(BankAccount ob){
	balance = ob.balance;
   }

   public void deposit(double x){
	balance += x;
   }

   public void withdraw(double a){
	balance -= a;
   }

   public void deposit(String a){
	balance += Double.parseDouble(a);
   }

   public void withdraw(String a){
	balance -= Double.parseDouble(a);
   }

   public void setV(double a){
	balance = a;
   }

   public void setV(String a){
	balance = Double.parseDouble(a);
   }

   public double getBal(){
	return balance;
   }


}