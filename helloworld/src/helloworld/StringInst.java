package helloworld;

public class StringInst {
	
	public int num;
	int hello;
	
	public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] arg) {
		
		String str1 = new String("Simple1");
		String str2 = "Simple2"; 
		
		System.out.println(str1); //인스턴스 생성 방법1
		System.out.println(str1.length());
		System.out.println();
		
		System.out.println(str2); //인스턴스 생성 방법2
		System.out.println(str2.length());
		System.out.println();
		
		showString("Funny");
	}
	
}
