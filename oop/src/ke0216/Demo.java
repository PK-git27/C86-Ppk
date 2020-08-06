package ke0216;
import java.util.Random;
public class Demo {

	public static void main(String[] args) {
	
		Animal a = new Cat();
		if(a instanceof Cat){
			System.out.println("a是一只猫");
		}
		if(a instanceof Dog){
			System.out.println("a是一只狗");
		}
		Demo d = new Demo();
		d.showResult();
	}
	
	Animal []animals = new Animal[100];
	public Demo(){
		Random rd = new Random();
		for (int i = 0; i < animals.length; i++) {
			Animal a =null;
			int A = rd.nextInt(3);
			switch(A){
			case 0:
				a = new Cat();
				break;
			case 1:
				a = new Dog();
				break;
			case 2:
				a = new Fish();
				break;
			}
			animals[i] = a;
		}
	}
	
	public void showResult(){
		
		int count0=0,count1=0,count2=0;
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Cat){
				count0++;
				Cat cat = (Cat)animals[i];
				cat.eat();
			}
			if(animals[i] instanceof Dog){
				count1++;
				Dog dog = (Dog)animals[i];
				dog.play();
			}
			if(animals[i] instanceof Fish){
				count2++;
				Fish fish = (Fish)animals[i];
				fish.swim();
			}
			
		}
		System.out.println("🐱的数量："+count0);
		System.out.println("🐕的数量："+count1);
		System.out.println("🐟的数量："+count2);
	}
}

class Animal{
	
}

class Cat extends Animal{
	
	public void eat(){
		System.out.println("🐱吃🐟");
	}
}

class Dog extends Animal{
	
	public void play(){
		System.out.println("🐕玩🐕");
	}
}
class Fish extends Animal{
	
	public void swim(){
		System.out.println("🐟🏊‍");
	}
	
}