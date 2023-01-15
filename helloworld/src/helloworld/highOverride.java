package helloworld;

class Cake4{ 
	
	public void yummy() {
		System.out.println("yummyCake");
	}
}

class CheeseCake4 extends Cake4{  
	
	public void yummy() {
		super.yummy();
		System.out.println("yummyCheeseCake");
	}
	
	public void tasty() {
		super.yummy();
		System.out.println("tastyCheeseCake");
	}
}

public class highOverride {
	public static void main(String[] arg) {

		CheeseCake4 c1 = new CheeseCake4();
		
		c1.yummy();
		c1.tasty();
	}
}
