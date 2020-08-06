package ke0214;

public class Manager extends Employee{

	private String department;
	public Manager(String name,float basic,String address,String department){
		super(name,basic,address);
		this.department =department;
	}
	public void show(){
		super.show();
		System.out.println("部门："+department);
	}
}
