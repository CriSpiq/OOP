package lab02;

public class BankAccount {
	int balance;
	public BankAccount(int balance) {
		this.balance=balance;
	}
	
	int getBalance() {
		return balance;
	}
	void addMoney(int money) {
		if(money>=0) {
			this.balance+=money;
		}else System.out.println("error");
	}
	
	void subMoney(int money) {
		if(money>=0) {
			if(this.balance>=money)
				this.balance-=money;
			else System.out.println("nedostatno groshei na rahynky");
		}else System.out.println("error");
	}
}