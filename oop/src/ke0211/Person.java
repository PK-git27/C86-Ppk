package ke0211;

public class Person {

	private String name;
	private char sex;
	private int age;
	
	public void show(){
		System.out.println("姓名："+name+"  性别："+this.sex+"  年龄："+age);
		//使用this调用其他实例方法
		this.hello();
	}
	
	public void hello(){
		System.out.println("你好"+this.name);
	}
	
	//结婚系统
	private Person partner;
	public void marry(Person partner){
		this.show();
		partner.show();
		if(this.sex==partner.sex){
			System.out.println("++++++++++++同性不能结婚吗？+++++++++++++");
			return;
		}
		if(this.sex=='男'&&this.age<22||this.sex=='女'&&this.age<20){
			System.out.println("相谈恋爱？你配不上她！！！！！！！");
			return;
		}
		if(partner.sex=='男'&&partner.age<22||partner.sex=='女'&&partner.age<20){
			System.out.println("+++t还小 ！！！你俩不合适！+++");
			return;
		}
		if(this.partner!=null){
			System.out.println("+++俺结婚了！+++");
			return;
		}
		if(partner.partner!=null){
			System.out.println("+++t结婚了！+++");
			return;
		}
		
		this.partner=partner;
		partner.partner=this;
		System.out.println("+++++++++++++++++++++++++++++bbbb头屑捞++++++++++++++++++++++++++++++++++++++");
	}
	/**
	 * 如果想知道某个类创建过多少对象
	 * static 表示该属性或方法是静态的，静态的属性不属于某个对象
	 */
	static int count;
	/**
	 * This method has a constructor name
	 * 这个普通方法用了构造方法 的名字
	 */
	public  Person(String name,char sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
		System.out.println("构造方法执行。。。");
		count++;
	}
	/**
	 * Cannot make a static reference to the non-static field name
	 * 不能在静态成员方法中访问非静态成员变量
	 */
	public static void showCount(){
		System.out.println("你创建了"+count+"个对象");
	}
	/**
	 * 	静态成员变量
	 * 	在成员变量前加static关键字，可以将其声明为静态成员变量；
		如果类中成员变量被定义为静态，那么不论有多少个对象，静态成员变量只有一份内存拷贝，即所有对象共享该成员变量；
		静态成员变量的作用域只在类内部，但其生命周期却贯穿整个程序。
		
	 * 	静态成员变量的注意事项
	 * 	和程序同生命周期；
		在没有实例化对象时，可以通过类名访问静态成员变量；
		也可以通过对象访问静态成员变量，但不论使用的是哪个对象，访问到的都是同一个变量；
		静态成员变量在声明时最好初始化，如果不进行初始化，系统会默认初始化为0。
		
	 * 	静态成员方法
	 * 	在成员方法前加static关键字，可以将其声明为静态成员方法；
		静态成员方法只能对类的静态成员变量进行操作；
		静态成员方法没有this引用；
		在没有实例化对象时，可以通过类名访问静态成员方法。
		
	 *	静态方法的用途：
	 *		使用静态方法定义工具类
	 * 
	 */
}
