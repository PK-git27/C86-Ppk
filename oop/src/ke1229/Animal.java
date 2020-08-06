package ke1229;

public class Animal {

	private String name;
	private double weight;
	
	//与类同名无返回值，也不能使用void修饰
	//每个类都默认有一个无参数的构造函数
	//一旦定义了带参数的构造函数，默认的消失，如需使用必须定义
	public Animal(){
		System.out.println("�޲����Ĺ��캯��");
	}
	
	public Animal(String name,double weight){
		this.name=name;
		this.weight=weight;
	}
	//属性私有化
	public void setname(String name){
		this.name=name;
	}
	
	public void setweight(double weight){
		this.weight=weight;
	}
	
	public String getName(){
		return this.name;
	}
	public double getweight(){
		return this.weight;
	}
	
	public void showInfo(){
		System.out.println("名称"+name+"\t体重"+weight);
	}
}
