package helloworld;

class Person {
	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable{

		System.out.println("bye");
	}
}

public class finalize_M {
	public static void main(String[] arg) {
		Person p = new Person("min");
		p.name = null;
		
		System.gc();

	}
}
