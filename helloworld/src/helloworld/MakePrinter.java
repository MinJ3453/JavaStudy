package helloworld;

interface MakePrinter {
	public void print(String doc);
	default void printColorY(String doc) {};
}

interface ColorPinterable extends MakePrinter {
	public void printColor(String doc);
}

interface CCTest {
	static void Test() {
		System.out.println("hello");
	}
}

