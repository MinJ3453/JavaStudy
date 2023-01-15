package helloworld;

class Cake{ //그냥 케익
	
	protected static int number;
	
	public Cake(int number) {
		System.out.println( "cake" + number);
	}
	
	public void sweet() {
		System.out.println("Yummy!!Yummy!!Yummy!!");
	}
}

class CheeseCake extends Cake{  //케익 + 치즈
	
	public CheeseCake(int number) {
		super(number);
		System.out.println("cheese" + number);
	}
	
	public void millky() {
		System.out.println("Yummy!!Yummy!!");
	}
}

class StrawberryCake extends CheeseCake{  //케익 + 치즈 + 딸기
	
	public StrawberryCake(int number) {
		super(number);
		System.out.println("strawberry" + number);
	}
	
	public void sour() {
		System.out.println("Yummy!!");
	}
	
}

class CallCake {
	
	public static void main(String[] arg) {
		
		new StrawberryCake(3);
	}
	
}
