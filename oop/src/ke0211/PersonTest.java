package ke0211;

public class PersonTest {
	
	public static void main(String[] args) {
		/**
		 * The constructor Person() is undefined
		 * Person()构造方法未定义
		 */
		Person p1=new Person("耗子哥",'男',18);
		p1.show();
		
		
		Person p2=new Person("孙妹妹",'女',30);
		p2.show();
		
		Person p3=new Person("桥臂螺",'女',20);
		
		Person p4=new Person("黑凤梨",'女',80);
		
		p1.marry(p2);
		p1.marry(p3);
		p3.showCount();
		
		/**
		 * 不创建对象，不影响对对静态属性的访问，原因：静态的属性不属于对象
		 * 属于类，只有一个
		 * 对count的访问不需要创建对象
		 * 
		 * The static field Person.count should be accessed in a static way
		 * 静态属性 Person.count 请使用类来访问==》 该属性不属于某个对象
		 * 是属于类的
		 * 
		 */
		//不建议使用这种方式
		System.out.println(p1.count);
		System.out.println(p2.count);
		System.out.println(p3.count);
		//建议使用这种方式
		System.out.println(Person.count);
	}
}
