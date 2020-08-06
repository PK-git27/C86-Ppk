package ke0216;
/**
 * 抽象类
 * 	抽象方法：是没有方法体的方法，在参数列表后面直接用；结束方法的定义
 * 
 * 1.抽象类是用 abstract 修饰的类
 * 2.有抽象方法的类一定是抽象类
 * 3.抽象类不一定有抽象方法
 * 4.抽象类不能直接创建，只能用来继承
 * 5.抽象类希望子类继承抽象类（类的模板），子类必须实现抽象法，否者子类也必须是抽象类
 * 6.构造方法和静态方法不能用 abstract 修饰
 *
 */
public abstract class Demo1 {
	/**
	 *方法定义的必要因素
	 *1.返回值
	 *2.方法名
	 *3.参数列表
	 *4.方法体
	 * 
	 */
	abstract void test();
	public void test1(){
		Person p = new Teacher();
		p.work();
		p.paly();
		
		p = new Programer();
		p.work();
		
	}
	
}
abstract class Person{
	String name;
	abstract void work();
	
	abstract void paly();
}

class Teacher extends Person{
	void work(){
		System.out.println("老师教书");
	}
	void paly(){
		System.out.println("老师打游戏");
	}
}
abstract class Worker extends Person{
	
}

class Programer extends Person{
	void work(){
		System.out.println("程序员写代码");
	}
	void paly(){
		System.out.println("程序员打游戏");
	}
	
}

