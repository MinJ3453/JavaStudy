package helloworld;

class Prn66Dv implements ColorPinterable{
//컬러프린트 기능 O
	@Override
	public void printColor(String doc) {
		System.out.println(doc);
		System.out.println("ColorOk");
	}
	
	@Override
	public void print(String doc) {
		System.out.println(doc);
		System.out.println("ColorNone");
	}
}

class Prn88Dv implements MakePrinter{
//컬러프린트 기능 X
	@Override
	public void print(String doc) {
		System.out.println(doc);
		System.out.println("ColorNone");
	}
}

public class PrintDiver3 {
	public static void main(String[] arg) {
		String myDoc="report";
		ColorPinterable H1 = new Prn66Dv();
		MakePrinter H2 = new Prn88Dv();
		
		H1.printColor("Prn66Dv "+ myDoc);
		H1.print("Prn66Dv "+ myDoc);
		System.out.println();
		H2.print("Prn88Dv "+ myDoc);
	}
}
