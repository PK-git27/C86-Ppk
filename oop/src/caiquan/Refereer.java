package caiquan;
import java.util.Scanner;
public class Refereer {
	int count;
	Person person=new Person();
	Ipad ipad=new Ipad();
	
	public void judge(String fistPeople,String fistComputer){
		if(fistPeople.equals("石头") &&fistComputer.equals("剪刀") ||
				fistPeople.equals("剪刀")&&fistComputer.equals("布") ||
	            fistPeople.equals("布")&&fistComputer.equals("石头") ){
	        System.out.println( person.getName()+"胜利");
	        person.addScore(1);
	        }else if(fistPeople.equals(fistComputer)){
	            System.out.println("平局！不得分");
	        }else{
	            System.out.println(ipad.getName()+"胜利");
	            ipad.addScore(1);
	        }
	   }
	
	void judgeThree(){
        if(person.getScore() == ipad.getScore()){
            System.out.println("两人获得平局!!!");
            System.out.println(person.getName()+":"+ipad.getName()+
                    "="+person.getScore()+":"+ipad.getScore());
        }else if(person.getScore() > ipad.getScore()){
            System.out.println(person.getName() + "获得胜利！！！");
            System.out.println(person.getName()+":"+ipad.getName()+
                    "="+person.getScore()+":"+ipad.getScore());
        }else{
        	System.out.println(ipad.getName() + "获得胜利！！！");
            System.out.println(person.getName()+":"+ipad.getName()+
            		"="+person.getScore()+":"+ipad.getScore());
        }
     }
	
	 public void startGame(){
		 Scanner sc=new Scanner(System.in);
		 boolean flag = true;
		 while(flag){
			 System.out.println("游戏开始！");
			 count = 0;
			 while(count<3){
				 System.out.println("请 "+person.getName()+" 出拳！");
				 String fistPeople = person.showFist();
				 String fistComputer = ipad.showFist();
				 System.out.println("对方出："+fistComputer);
				 judge(fistPeople,fistComputer);
				 count++;
			 }
			 judgeThree();
			 System.out.println("是否继续游戏：是，否");
			 String string = sc.nextLine();
			 if(string.equals("否")){
				 System.out.println("game over");
				 flag = false;
			 }
		 }
	 }
}