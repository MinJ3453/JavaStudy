package helloworld;

class Friend{
	
	protected String name;
	protected String phone;
	
	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("name : "+ name);
		System.out.println("phone : "+ phone);
	}
}

class UnivFriend extends Friend{
	
	private String major;
	
	public UnivFriend(String na, String ma ,String ph) {
		super(na, ph);
		major = ma;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("major : "+ major);
	}
}

class CompFriend extends Friend{
	
	private String department;
	
	public CompFriend(String na, String de ,String ph) {
		super(na, ph);
		department = de;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("department : "+ department);
	}
}



public class MyFriends2 {
	public static void main(String[] arg) {
		Friend[] frns=new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend("LEE","computer","010-1234-3434");
		frns[cnt++] = new CompFriend("SEO","R&D","010-4356-3434");
		frns[cnt++] = new UnivFriend("YOON","computer","010-1234-5474");
		
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo();
			System.out.println();
		}
		
	}
}
