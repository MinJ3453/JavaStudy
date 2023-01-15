package helloworld;

class point33 implements Cloneable{
	int num;
	
	public point33(int num) {
		this.num = num;
	}

	public void change33(int num) {
		this.num = num;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class REpoint33 implements Cloneable{
	
	point33 n;
	
	public REpoint33(int num) {
		n = new point33(num);
	}
	
	public void REchange33(int num) {
		n.change33(num);
	}
	
	public void show33 () {
		System.out.println(n.num);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		REpoint33 copy = (REpoint33)super.clone();
		copy.n = (point33)n.clone();
		
		return copy;
	}
}

public class Cloneable_M {
	public static void main(String[] arg) {
		REpoint33 p = new REpoint33(1);
		REpoint33 p2;
		
		try {
			p2 = (REpoint33)p.clone();
			p.REchange33(3);
			p.show33();
			p2.show33();
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			
		}

	}
}
