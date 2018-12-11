package lab02;

public class Main {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount(200);
		System.out.println(ba.getBalance());
		ba.addMoney(100);
		System.out.println(ba.getBalance());
		ba.subMoney(250);
		System.out.println(ba.getBalance());
	}

}