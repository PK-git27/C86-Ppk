package ke0213.t;

public class Person {
	
	String name;
	int age;
	String id;
	
	public Person(){
		
	}
	public Person(String name,int age){
		/**
		 * 父类的构造方法负责初始化属于它的成员变量
		 */
		this.age=age;
		this.name=name;
	}
}
