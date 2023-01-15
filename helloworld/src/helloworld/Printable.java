package helloworld;

class hello77 implements firstInterface {
	//int RR = 6;
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

class hello777 extends Box implements firstInterface, helloMyInterface {

	int RR = 6;
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

abstract class HH{
	public void method() {
		System.out.println("hello");
	}
	public abstract void method2();
}

class HH2 extends HH{
	@Override
	public void method2() {
		System.out.println("hello2");
	};
	
}

public class Printable {
	public static void main(String[] arg) {
		/*
		 * hello77 hell = new hello77(); hell.print("hello Print");
		 * System.out.println(hell.RR);
		 */
		HH hh = new HH2();
		hh.method();
		hh.method2();
		
	}
}