package caiquan;
import java.util.Random;

public class Ipad {
	private String name="蠢货";
	private int score;
	
	public String showFist(){
		Random rd=new Random();
		int num=rd.nextInt(3);
		String fist;
		if(num==0) fist="石头";
		else if(num==1) fist="剪刀";
		else fist="布";
		return fist;
	}
	
	public void addScore(int score){
		this.score+=score;
	}

	public  int getScore(){
		return this.score;
	}
	
	public String getName(){
		return this.name;
	}
}