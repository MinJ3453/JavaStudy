package helloworld;

class Circle{
	private double rad = 0;
	final double PI = 3.14;
	
	
	public void setRad(double R) {
		if(R < 0) {
			rad = 0;
			return;
		}
		rad = R;
	}
	
	public double getArea() {
		return (rad*rad)*PI;
	}
	
	
}

public class makePrivate {
	public static void main(String[] arg) {
		
		Circle CC = new Circle();
		//CC.rad = -1;
		CC.setRad(10);
		
		
		System.out.println(CC.getArea());
		
	}
}
