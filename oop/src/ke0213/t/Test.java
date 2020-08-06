package ke0213.t;

public class Test {
	
	public static void main(String[] args) {
		/**
		 * 1.每个类，系统都会默认提供一个无参数的构造方法
		 * 2.如果自定义有参数的构造方法，那么无参数的构造方法就会失效
		 * 3.每个构造方法都必须先执行 父类的构造方法
		 */
		Person p=new Person("周通",23);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Student s=new Student("李忠",40,"15588");
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sn);
	}
}
