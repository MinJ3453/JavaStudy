package helloworld;

class oneAccessBefore {
	void take() {
		System.out.println("first Access");
	}
}

class twoAccessBefore {
	void take() {
		System.out.println("second Access");
	}
}

class mergeBefore {
	void oneAccessM(oneAccessBefore cap) {
		cap.take();
	}
	
	void twoeAccessM(twoAccessBefore cap) {
		cap.take();
	}
}

public class makeCapsuleBefore {
	public static void main(String[] arg) {
		
		mergeBefore CC = new mergeBefore();
		
		
		/*
		 * CC.oneAccessM(new oneAccessBefore()); CC.twoeAccessM(new twoAccessBefore());
		 */
		
		InstCnt AA= new InstCnt();
		/*
		 * AA.InstCnt2(); AA.instNum ++; AA.InstCnt2(); AA.InstCnt3(); AA.InstCnt2();
		 */
		AA.callShowInt();
		//AA.callShowInt(700);
		
	}
}
