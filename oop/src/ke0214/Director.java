package ke0214;

public class Director extends Employee{

	private float transportAllowance;
	public Director(String name,float basic,String address,float transportAllowance){
		super(name,basic,address);
		this.transportAllowance=transportAllowance;
	}
	public void show(){
		super.show();
		System.out.println("津贴："+transportAllowance);
	}
}
