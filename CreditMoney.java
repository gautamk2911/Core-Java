package collectionsInJava;

import java.util.Vector;

class BankAccount{
	String owner;
	double amt;
	String accountType;
	double balance;
	
	public BankAccount(String owner, double amt,String accountType,double balance) {
		this.owner = owner;
		this.amt = amt;
		this.accountType = accountType;
		this.balance = balance;	
	}
	public void creditedMoney() {
		balance += amt ;
	}

	@Override
	public String toString() {
		return "BankAccount [owner=" + owner + ", amt=  Rs." + amt + ", accountType=" + accountType + ", balance=  Rs."
				+ "" + balance
				+ "]";
	}
	
}

public class CreditMoney{
	public static void main(String[] args) {
		Vector<BankAccount> acc = new Vector<BankAccount>();
		acc.add(new BankAccount("Ramu",4000,"FD",200));
		acc.add(new BankAccount("Raju",45000,"Current",45200));
		acc.add(new BankAccount("Ruru",78900,"Savings",52200));
		for(BankAccount obj :acc ) {
			obj.creditedMoney();
		}
		for(BankAccount obj : acc) {
			System.out.println(obj);
		}
		
	}
	
}
