package entities;

public class Account {
	private int number_account;
	private String holder;
	private double balance;
	
	public Account() {
	}
	
	public Account(int number_account, String holder) {
		super();
		this.number_account = number_account;
		this.holder = holder;
	}

	public Account(int number_account, String holder, double initial_deposit) {
		super();
		this.number_account = number_account;
		this.holder = holder;
		Deposit(initial_deposit);
	}

	public int getNumber_account() {
		return number_account;
	}
	
	public String getName() {
		return holder;
	}
	public void setName(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void Deposit(double value) {
		if(value>0) {
			this.balance+=value;
		}
	}
	
	public double Withdraw(double value){
		if(this.balance>=value) {
			this.balance-=value;	
		}
		return value;
	}
	
	
	
	public String toString() {
		System.out.println();
	    return String.format("Account %d, Holder: %s, Balance: $%.2f", this.number_account, this.holder,this.balance);
	}

	
}
