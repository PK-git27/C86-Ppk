package ke0215;

public class Parent {

	String name = "杰子哥";
	String like;
	String buff = "天音波";
	
	public void showName(){
		System.out.println(this.name);
	}
	
	public void showbuff(){
		System.out.println(this.buff);
	}
	public static void main(String[] args) {
		Child c =new Child();
		c.showName();
		
		Parent p=new Child();
		p.showName();
		
		System.out.println("============================");
		Child c1=new Child();
		Parent p1=c1;
		p1.name="孙子妹";
		p1.like="AJ";
		c1.edu="小学生";
		
		System.out.println(c1.name);
		System.out.println(c1.edu);
		System.out.println(c1.like);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println(p1.name);
		System.out.println(p1.like);
		
		System.out.println("---------方法测试1--------");
		p1.showName();
		p1.showbuff();
		System.out.println("---------方法测试2--------");
		c1.showName();
		c1.showbuff();
		
		System.out.println("---------属性测试1--------");
		System.out.println(c1.buff);
		System.out.println(p1.buff);
		System.out.println(c1.name);
		System.out.println(p1.name);
	}
}

class Child extends Parent{
	String name = "耗子哥";
	String edu;
	String buff = "天崩地裂";
	
	public void showName(){
		super.showName();
		System.out.println(this.name);
	}
	public void showbuff(){
		super.showbuff();
		System.out.println(this.buff);
	}
	
}
