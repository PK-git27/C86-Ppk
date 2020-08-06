package ke0213;

public class Person {
	
	//protected 父子友好  包内友好
	protected String name;
	//缺省  包内友好 
	int age;
	
	public void play(){
		System.out.println(name+"在打麻将");
	}
}
