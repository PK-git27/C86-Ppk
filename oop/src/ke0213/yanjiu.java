package ke0213;

public class yanjiu extends Student{
	
	String address;
	/**
	 * 子类可以重写父类方法
	 * 
	 * 重载：同类，同名，不同参
	 * 
	 * 重写：子类，同名，同参！
	 */
	public void show(){
		System.out.println(address);
	}
}
