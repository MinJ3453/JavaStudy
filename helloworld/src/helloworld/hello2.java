package helloworld;

public class hello2 {
	static int balance = 0;
	
	public static void main(String[] arg) {
		deposit(10000);
		CheckMyBalance();
		withdraw(3000);
		CheckMyBalance();
	}
	
	public static int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public static int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public static int CheckMyBalance() {
		System.out.println("money: " + balance);
		return balance;
	}
	
}
