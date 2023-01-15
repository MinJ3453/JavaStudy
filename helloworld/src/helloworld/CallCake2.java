package helloworld;

class Cake2{ 
	
	public void sweet() {
		System.out.println("Cake");
	}
}

class CheeseCake2 extends Cake2{  
	
	public void sour() {
		sweet();
		System.out.println("CheeseCake2");
	}
}

class StrawberryCake2 extends CheeseCake2{  
	
	public void millky() {
		sour();
		System.out.println("StrawberryCake2");
	}
}

public class CallCake2 {
	public static void main(String[] arg) {
		
		//StrawberryCake2 cake3 = new Cake2();
		
		Cake2 cake1 =new StrawberryCake2();
		cake1.sweet();
		//cake1.millky();
		//cake1.sour();
		
		StrawberryCake2 cake2 =new StrawberryCake2();
		//cake2.sweet();
		cake2.millky();
		//cake2.sour();
		
		//Cake2 ca1 = cake1;
		//StrawberryCake2 ca2 = (StrawberryCake2)cake1;
		
	}
}
