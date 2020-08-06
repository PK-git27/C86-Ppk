package ke1229;

public class Text01 {
	public static void main(String[] args) {
		
		Animal a=new Animal();//调用无参数的构造函数
		a.setname("哈士奇");
		a.setweight(50);
		a.showInfo();
		//
		Animal b=new Animal("八哥",40);
		b.showInfo();
	}
}
