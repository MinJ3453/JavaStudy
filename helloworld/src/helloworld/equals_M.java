package helloworld;

class makeNum{
	int num;
	
	public makeNum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.num ==((makeNum)obj).num)
			return true;
		else
			return false;
		
	}
}

public class equals_M {
	
	public static void main(String[] arg) {
		makeNum m1 = new makeNum(1);
		makeNum m2 = new makeNum(1);
		
		if(m1.equals(m2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}
}
