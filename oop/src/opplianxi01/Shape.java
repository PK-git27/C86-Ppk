package opplianxi01;

public class Shape {

	protected double Width;
	protected double Height;
	private double Area;
	public void getArea(){
		Area=Width*Height;
		System.out.println("面积是："+Area);
	}
}
