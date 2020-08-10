package com.yc.spring.bean;

import java.util.List;

public class Person {

	private String name;
	
	private String id;
	
	private int age;
	
	private String alisa;
	
	private int Height;
	
	private List<String> Killeds;
	
	private Person friend;
	
	
	/**
	 * 工厂方法
	 */
	public static Person PersonFactory() {
		Person p = new Person();
		p.setAge(30);
		return p;
	}
	
	public Person PersonFactory1() {
		Person p = new Person();
		p.setAge(20);
		return p;
	}
	
	

	public Person() {
		super();
	}
	
	public Person(int age, String name,  String alisa) {
		super();
		System.out.println("==========1===========");
		this.name = name;
		this.age = age;
		this.alisa = alisa;
	}
	

	public Person(String name, int age, String alisa) {
		super();
		System.out.println("==========2===========");
		this.name = name;
		this.age = age;
		this.alisa = alisa;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAlisa() {
		return alisa;
	}

	public void setAlisa(String alisa) {
		this.alisa = alisa;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public List<String> getKilleds() {
		return Killeds;
	}

	public void setKilleds(List<String> killeds) {
		Killeds = killeds;
	}

	public Person getFriend() {
		return friend;
	}

	public void setFriend(Person friend) {
		this.friend = friend;
	}
	
	
	
	
}
