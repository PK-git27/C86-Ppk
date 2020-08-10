package com.yc.spring;

public class Hello {

	private int a;
	
	public Hello() {
		System.out.println("=========Hello 无参数的构造函数==========");
	}

	public Hello(int a) {
		System.out.println("=========Hello 有参数的构造函数==========");
		this.a = a;
	}


	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void init() {
		System.out.println("==============方法被创建===================");
	}
	
	public void destroy() {
		System.out.println("==============方法被销毁===================");
	}

	public void sayHello() {
		System.out.println("你好世界");
	}
}
