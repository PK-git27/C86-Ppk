/**
 * 学生类
 * @author pk
 *
 */
public class Student {
	private int sid;//学号 成员属性 成员变量 全局变量 基本数据类型
	private String sname;//姓名 引用类型
	private int age;//年龄
	Address addr=new Address();//地址 引用类型
	
	public Student(){
		System.out.println("无参数的构造函数");
	}
	
	public Student(int sid){
		System.out.println("带一个参数的构造函数");
		this.sid=sid;
	}
	
	public Student(int sid,String saname,int age){
		this.sid=sid;
		this.sname=sname;
		this.age=age;
	}
	
	//属性私有化后，需要外界赋值 对外提供相应的setter方法 set属性名（）
	public void setSid(int Sid){
		this.sid=Sid;
	}
	public void setSname(String Sname){
		this.sname=Sname; 
	}
	public void setAge(int Age){
		if(Age<6){
			System.out.println("���䲻�Ϸ�������������ֵΪĬ��ֵ6.");
			this.age=6;
		}else{
			this.age=Age;
		}
	}
	
	//外界想访问某个属性值  对外提供相应的getter方法 get属性名（）
	public int getSid(){
		return this.sid;
	}
	public int getAge(){
		return this.age;
	}
	public String getSname(){
		return this.sname;
	}
	
	//输出信息 行为
	//成员函数 方法
	/**
	 * 如何定义成员函数
	 * public 返回值类型 函数名（形参列表）{
	 * 
	 *      [return  值;]
	 * }
	 */
	public void showInfo(){
		System.out.println("学号："+sid+"\t姓名："+sname+"\t年龄："+age);
	}
}
