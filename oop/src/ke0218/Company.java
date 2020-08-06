package ke0218;

import java.util.Random;
public class Company {

	public static void main(String[] args) {
		
		Company company = new Company("华为",100);
		company.count1();
		company.count2();
		company.dismiss();
		
	}
	
	protected static Employer[] employers;
	protected String name;
	
	public Company(String name,int number){
		this.name=name;
		//传入员工数量，创建员工数组
		employers = new Employer[number];
		for (int i = 0; i < number; i++) {
			employers[i]= recruitByInternet();
		}
	}
	
	public Employer recruitByInternet(){
			Random rd = new Random();
			switch(rd.nextInt(7)){
			case 0:
				return new Employer1();
			case 1:
				return new Employer2();
			case 2:
				return new Employer3();
			case 3:
				return new Employer4();
			case 4:
				return new Employer5();
			case 5:
				return new Employer6();
			default:
				return new Employer7();
			}
		
	}
	/**
	 * 统计每个技术会的人数
	 */
	public void count1(){
		//定义三个计数器
		int java=0,html=0,mysql=0;
		for(Employer e:employers){
			//接口当作抽象类来使用
			if (e instanceof Java) {
				java++;
			}
			if (e instanceof Html) {
				html++;
			}
			if (e instanceof MySQL) {
				mysql++;
			}
		}
		System.out.printf("会Java的有%s人，会Html的有%s人，会MySQL的有%s人。\n", java, html, mysql);
	}
	/**
	 * 分别统计出会一项技术 两项技术 三项技术的
	 */
	public void count2() {
		int c1 = 0, c2 = 0, c3 = 0;
		for (Employer e : employers) {
			int count = 0;
			if (e instanceof Java) {
				count++;
			}
			if (e instanceof Html) {
				count++;
			}
			if (e instanceof MySQL) {
				count++;
			}
			switch (count) {
			case 1:
				c1++;
				break;
			case 2:
				c2++;
				break;
			case 3:
				c3++;
				break;
			}
		}
		System.out.printf("会一项技术的有%s人，会两项技术的有%s人，会三项技术的有%s人。\n", c1, c2, c3);
	}
	
	/**
	 * 请辞退年龄在 40 岁以上的只会一项技术的男程序员,  在辞退前后, 请打印所有员工信息, 以作验证
	 */
	public void dismiss() {
		for (int i = 0; i < employers.length; i++) {
			Employer e = employers[i];
			int count = 0;
			if (e instanceof Java) {
				count++;
			}
			if (e instanceof Html) {
				count++;
			}
			if (e instanceof MySQL) {
				count++;
			}
			if (e.age > 40 && count == 1 && e.sex == 1) {
				// 辞退就是将数组的元素设置为空 null
				employers[i] = null;
				System.out.printf("辞退员工：姓名%s，性别%s，年龄%s\n", e.name, e.sex, e.age);
			}
		}
	}
}

interface Java{
	
}
interface Html{
	
}
interface MySQL{
	
}

abstract class Employer{
	static final String fname = "至高之拳";
	static int count = 0;
	
	Random rd = new Random();
	String name = fname + ++count;
	int age = rd.nextInt(31)+20;
	int sex = rd.nextInt(2);//0女性 1 男性
	int salary = (rd.nextInt(51)+50)*100; //薪资5000-10000
	/**
	 * 展示员工信息
	 */
	public void show(){
		System.out.printf("员工：姓名%s，性别%s，年龄%s，薪资：%s元\n",name,sex,age,salary);
		
	}
	
}

class Employer1 extends Employer implements Java{
	
}
class Employer2 extends Employer implements Html{
	
}
class Employer3 extends Employer implements MySQL{
	
}
class Employer4 extends Employer implements Java,Html{
	
}
class Employer5 extends Employer implements Html,MySQL{
	
}
class Employer6 extends Employer implements Java,MySQL{
	
}
class Employer7 extends Employer implements Java,Html,MySQL{
	
}
