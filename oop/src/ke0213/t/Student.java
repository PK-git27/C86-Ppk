package ke0213.t;

public class Student extends Person{

	
	String sn;
	public Student(String name,int age,String sn){
		super(name,age);//super 用于指向父类对象
		/**
		 * 子类的构造方法则只需考虑自己的成员变量，不必去关注父类情况
		 */
		this.sn=sn;
	}
}
