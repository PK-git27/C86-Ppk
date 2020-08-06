package homework01;

public class Text001 {

	public static void main(String[] args) {
		Person p1=new Person("夏克浩",28,"男");
		Person p2=new Person("乔币罗",25,"女");
		
		Person g=new Person("里成呗",22,"男");
		Person f=new Person("朱一丹",25,"女");
		Person q=new Person("朱",25,"女");
		
	
		p1.marry(p2);
		f.marry(p2);
		g.marry(p1);
		f.marry(g);
		f.fall(g);
	}
}
