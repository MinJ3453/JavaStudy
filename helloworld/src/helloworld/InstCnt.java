package helloworld;

public class InstCnt {
	static int instNum = 100;
	
	void InstCnt2() {
		instNum++;
		System.out.println(instNum);
	}
	
	void InstCnt3() {
		instNum = 0 ;
		System.out.println(instNum);
	}
	
	void callShowInt() {
		showInt(instNum);
	}
	
	static void showInt(int num) {
		num ++;
		System.out.println(num);
	}
}
