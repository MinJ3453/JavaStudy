package helloworld;

class Prn66Dv2 implements MakePrinter{
//컬러프린트 기능 O
	
	@Override
	public void printColorY(String doc) {
		System.out.println(doc);
		System.out.println("ColorOK");
	}
	
	@Override
	public void print(String doc) {
		System.out.println(doc);
		System.out.println("ColorNone");
	}
}

class Prn88Dv2 implements MakePrinter{
//컬러프린트 기능 X
	@Override
	public void print(String doc) {
		System.out.println(doc);
		System.out.println("ColorNone");
	}
}



//class TEst implements CCTest{}

public class PrintDiver4 {
	public static void main(String[] arg) {
		String myDoc="report";
		MakePrinter H1 = new Prn66Dv2();
		MakePrinter H2 = new Prn88Dv2();
		
		H1.print("Prn66Dv "+ myDoc);
		H1.printColorY("Prn66Dv "+ myDoc);
		System.out.println();
		H2.print("Prn88Dv "+ myDoc);
		
		CCTest.Test();
		//TEst.Test();

	}
}
