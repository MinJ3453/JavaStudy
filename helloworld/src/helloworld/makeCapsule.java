package helloworld;

class Access {
	
	void oneTake() {
		System.out.println("first Access");
	}
	
	void twoTake() {
		System.out.println("second Access");
	}
	
	void take() {
		oneTake();
		twoTake();
	}
}

class merge {
	void takeOrder(Access cap) {
		cap.take();
	}
}

public class makeCapsule {
	public static void main(String[] arg) {
		
		merge CC = new merge();
		
		CC.takeOrder(new Access());
		
	}
}
