package helloworld;

class SuperCLS{
	protected static int count = 0;
	
	public SuperCLS() {
		count++;
	}
}

class SubCLS extends SuperCLS{
	public SubCLS() {
		System.out.println(count);
	}
}

public class MakeProtected {
	
	public static void main(String[] arg) {
		
		new SubCLS();
		new SubCLS();
		new SubCLS();
		
	}
	
}


