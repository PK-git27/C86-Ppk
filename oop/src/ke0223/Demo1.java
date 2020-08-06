package ke0223;
import java.util.Scanner;
/**
 * 
 * try:  检测，检查
 * catch： 捕获异常 解决异常
 * finally 最终执行的代码块（不管是否有异常出现）
 * 
 * 1.try + catch 组合
 * 2.try + catch catch... 组合，catch的异常不能重复
 * 3.try + catch catch...+finally 组合
 *
 *
 */
public class Demo1 {

	public static void main(String[] args) {

		a();
	}

	public static void a() {

		c();
	}

	public static void b() {

		int a23 = 1;
		int []a={1,5,0,22,41};
		Scanner sc = new Scanner(System.in);
		System.out.println("=======开始=======");
		boolean w = true;
		while(w){
			try{
				System.out.println("请输入数组下标：");
				int index = sc.nextInt();
				int value =100 / a[index];
				System.out.println("该值是："+value);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("数组索引错误："+e.getMessage());
			}catch(ArithmeticException e){
				System.out.println("数学计算错误："+e.getMessage());
			}finally{
				System.out.println("本次循环结束！");
			}
		}
		System.out.println("-------结束-------");
	}

	public static void c() {

		b();
	}
}
