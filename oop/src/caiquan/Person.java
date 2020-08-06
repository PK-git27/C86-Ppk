package caiquan;
import java.util.Scanner;
public class Person {
	private String name="耗子哥";//玩家名称
	private int score;//分数
	
	public String showFist(){
		System.out.println("石头   剪刀   布");
		System.out.println(name+"出：");
		Scanner sc=new Scanner(System.in);
		String fist=sc.nextLine();
		return fist;
	}
	
	public void addScore(int score){
		this.score+=score;
	}
	public int getScore(){
		return this.score;
	}
	public String getName(){
		return this.name;
	}

}
