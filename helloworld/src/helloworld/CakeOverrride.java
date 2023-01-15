package helloworld;

class Cake3{ 
	
	public void yummy() {
		System.out.println("Cake3");
	}
}

class CheeseCake3 extends Cake3{  
	
	public void yummy() {
		System.out.println("CheeseCake3");
	}
}

public class CakeOverrride {
	public static void main(String[] arg) {
		Cake3 c1 = new CheeseCake3();
		CheeseCake3 c2 = new CheeseCake3();
		
		c1.yummy();
		c2.yummy();
	}
}
