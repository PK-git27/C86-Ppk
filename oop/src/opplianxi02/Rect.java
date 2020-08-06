package opplianxi02;

public class Rect extends Shape{

	protected double High;
	private double V;
	
	public void setWidth(double a){
		this.Width=a;
	}
	public void setHeigth(double b){
		this.Height=b;
	}
	public void setHigh(double c){
		this.High=c;
	}
	public void getV(){
		V=High*Height*Width;
		System.out.println("体积是："+V);
	}
	
	
	
	public  Rect(){
		
	}
	public  Rect(double a,double b,double c){
		this.Width=a;
		this.Height=b;
		this.High=c;
	}
}
