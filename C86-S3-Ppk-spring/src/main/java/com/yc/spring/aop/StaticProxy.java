package com.yc.spring.aop;

public class StaticProxy {

	public static void main(String[] args) {
		ProxySubject ps = new ProxySubject();
		ps.say();
	}
}

//抽象主题
interface Subject{
	void say();
}

class RealSubject implements Subject{
	
	public void say() {
		System.out.println("你好当事人");
	}
}

class ProxySubject implements Subject{
	RealSubject rs = new RealSubject();
	public void say() {
		System.out.println("你好律师");
		rs.say();
	}
}




