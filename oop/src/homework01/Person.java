package homework01;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	private Person partner;
	
	public Person(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	
	public boolean marry(Person p){
		if(this.gender!="男"&&this.gender!="女"){
			System.out.println("没有性别开什么玩笑？？");
			return false;
		}
		if(p.gender!="男"&&p.gender!="女"){
			System.out.println("没有性别开什么玩笑？？");
			return false;
		}
		if(this.gender==p.gender){
			System.out.println("同性无法结婚");
			return false;
		}
		if(this.gender=="男"&&this.age<22){
			System.out.println(this.name+"未到法定结婚年龄！！不能结婚");
			return false;
		}
		if(p.gender=="男"&&p.age<22){
			System.out.println(p.name+"未到法定结婚年龄！！不能结婚");
			return false;
		}
		if(this.gender=="女"&&this.age<20){
			System.out.println(this.name+"未到法定结婚年龄！！不能结婚");
			return false;
		}
		if(p.gender=="女"&&p.age<20){
			System.out.println(p.name+"未到法定结婚年龄！！不能结婚");
			return false;
		}
		if(this.partner!=null||p.partner!=null){
			System.out.println("某一方已婚！！无法结婚");
			return false;
		}
		System.out.println(this.name+"\t"+p.name+"分手快乐");
		this.partner=p;
		p.partner=this;
		return true;
		
	}
	public boolean fall(Person p){
		
		if(this.partner!=p.partner){
			System.out.println("没结婚 你离你🐎呢");
			return false;
		}else{
			this.partner=null;
			p.partner=null;
			System.out.println(this.name+p.name+"离婚快乐");
					
		}
		return true;
	}
	
}
