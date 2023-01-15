package helloworld;

class simple{
	private int date;
	
	simple(int date){
		this.date=date;
	}
	
	int getDate() {
		return this.date;
	}
}

public class thisMakeClase {
	
	
	public static void main(String[] arg) {
		
		simple box = new simple(100);
		System.out.println(box.getDate());
	}
	
}
