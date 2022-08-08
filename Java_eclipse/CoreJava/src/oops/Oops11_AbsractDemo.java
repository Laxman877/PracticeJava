package oops;
abstract class Account{
	double balance;
	public abstract void addInterest();
	public abstract void deposite(double amount);
	public void getBalance() {
		System.out.println("current balance is: "+balance);
	}
}
class SavingAccount extends Account{
	public void addInterest() {
		System.out.println("current interest rate is 10%");
	}
	@Override
	public void deposite(double amount) {
		balance = balance + amount;
	}
}
class CurrentAccount extends Account{

	@Override
	public void addInterest() {
		System.out.println("current interest rate is 0%");
	}

	@Override
	public void deposite(double amount) {
		balance = balance + amount;
	}
	
}
public class Oops11_AbsractDemo {
	public static void main(String[] args) {
		Account a = new SavingAccount();
		Account b = new CurrentAccount();
		a.addInterest();
		a.deposite(2000.0);
		a.getBalance();
		b.addInterest();
		b.deposite(5000.0);
		b.getBalance();
	}
}
