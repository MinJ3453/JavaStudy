package helloworld;

class hello6 {
	int balance = 0;
	
	public hello6(int money) {
		balance = money;
	}

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int CheckMyBalance(String name) {
		System.out.println( name +" money: " + balance);
		return balance;
	}
}

class hello5 {
	
	public static void main(String[] arg) {
		
		hello6 yoon = new hello6(10000);
		hello6 park = new hello6(70000);
		
		yoon.CheckMyBalance("yoon");
		park.CheckMyBalance("park");
		
		yoon.withdraw(100);
		park.withdraw(700);
		
		yoon.CheckMyBalance("yoon");
		park.CheckMyBalance("park");
	}

}
