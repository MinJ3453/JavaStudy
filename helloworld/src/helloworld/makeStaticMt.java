package helloworld;

class SC{
	static int add(int num1, int num2) {
		return num1 +num2;
	}
	static int min(int num1, int num2) {
		return num1 -num2;
	}
	
	public static void main(String[] arg) {
		System.out.println(SC.add(1, 2));
		System.out.println(SC.add(5, 2));
	}
	
}

class makeStaticMt {
	public static void main(String[] arg) {
		System.out.println(SC.add(1, 2));
		System.out.println(SC.add(5, 2));
	}
}


