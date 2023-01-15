package helloworld;

class Box{
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}

public class InterfaceOfOverride {
	public static void main(String[] arg) {
		
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		WrapBox(box1);
		WrapBox(box2);
		WrapBox(box3);
	}
	
	public static void WrapBox(Box box) {

		if(box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap(); //Box -> GoldPaperBox 형변환
		}else if (box instanceof PaperBox) {
			((PaperBox)box).paperWrap(); //Box -> PaperBox 형변환
		}else {
			box.simpleWrap();
		}
		
		
	}
}
