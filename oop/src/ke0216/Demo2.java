package ke0216;
/**
 *接口：没有任何实现的方法，只有方法原型的定义 
 *
 *interface 用定义接口与 class 语法类似
 *接口定义的特点：
 *	1.接口中的方法全部都是抽象方法，即使不家 abstract 修饰
 *	2.所有方法访问修饰符都是public， 即使不加它也是public
 *  3.接口不能定义对象属性，定义的属性只能是静态常量
 *
 *使用方式：
 *	1.class 类 implements 接口
 *	2.class 类 implements 接口a，接口b，接口c
 *	3.class 类 extends 类 implements 接口a，接口b，接口c
 */
public class Demo2 {

	
}
/**
 * 接口的使用，接口也可以当成父类使用
 * implements 是实现的意思，接口类通过该关键字使用
 *
 */
class Q implements A{

	public void fun0() {
	}
	public void fun1() {
	}
	public void fun2() {
	}
	
}
/**
 * 接口实现可以允许多实现
 *
 */
class W implements B,C,D{

	public void fun5() {
	}
	public void fun6() {
	}
	public void fun4() {
	}
	
}
/**
 * 接口配合关键字一块实现
 *
 */
class E extends Q implements C,D{
	public void fun5() {
	}
	public void fun6() {
	}
	
}

interface A{
	public void fun0();
	void fun1();
	public void fun2();
	/**
	 * Illegal modifier for the interface field A.a; only public, static & final are permitted
	 * 接口属性只能通过public static final 进行修饰
	 */
	public static  int a=0;
}

interface B{
	void fun4();
}

interface C{
	void fun5();
	void fun6();
}
/**
 * 接口也可以不定义任何的抽象方法，标记接口
 */
interface D{

}
