package helloworld;

class Man2{
	String name;
	public void tellYourName() {
		System.out.println("name :"+ name);
	}
}

class BsMan2 extends Man2{
	String com; //필드
	String pos;
	
	public BsMan2(String name, String com, String pos){ //생성자
		this.com = com; 
		this.pos = pos;
		this.name = name; //상위 클래스 초기화
	}
	
	public void tellYourInfo() {
		System.out.println("com :"+ com);
		System.out.println("pos :"+ pos);
		tellYourName();
	}
}

public class NewFile {
	
	public static void main(String[] arg) {
		
		BsMan2 man = new BsMan2("Min","helloworld","staff");
		man.tellYourInfo();
	}
	
}

