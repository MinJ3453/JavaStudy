package helloworld;

class hello4 {
	static int balance = 0;
	
	public static int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public static int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public static int CheckMyBalance(String name) {
		System.out.println( name +" money: " + balance);
		return balance;
	}
}

class hello3 {
	
	public static void main(String[] arg) {
		
		hello4 yoon = new hello4();
		hello4 park = new hello4();
		
		yoon.deposit(10000);
		park.deposit(70000);
		
		yoon.CheckMyBalance("yoon");
		park.CheckMyBalance("park");
		
		yoon.withdraw(100);
		park.withdraw(700);
		
		yoon.CheckMyBalance("yoon");
		park.CheckMyBalance("park");
	}

}

