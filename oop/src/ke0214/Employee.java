package ke0214;

public class Employee {

	private String name;
	
	private float basic;
	
	private String address;
	
	public Employee(String name,float basic,String address){
		
		this.name=name;
		this.basic=basic;
		this.address=address;
	}
	public void show(){
		
		System.out.printf("姓名：%s  底薪：%s 地址：%s\n",name,basic,address);
	}
}
