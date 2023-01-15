package helloworld;

class ManCC {
	
	public ManCC() {
		System.out.println("hello2");
	}
}

class BsMan extends ManCC {
	
	public BsMan() {
		super();
		System.out.println("hello1");
	}
}

public class Man{
	
	public static void main(String[] arg) {
		
		new BsMan();
	}
}