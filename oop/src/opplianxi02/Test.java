package opplianxi02;

public class Test {

	public static void main(String[] args) {
		Rect r1=new Rect();
		r1.setHeigth(20);
		r1.setWidth(5);
		r1.setHigh(2.0);
		r1.getArea();
		r1.getV();
		
		Rect r2=new Rect(5,5,5);
		r2.getArea();
		r2.getV();
	}
}

