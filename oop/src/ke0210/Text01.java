package ke0210;
import java.util.Random;
public class Text01 {
	public static void main(String[] args) {
		int []arr=new int[50];
		Random rd=new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=rd.nextInt(41)+60;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int a:arr){
			System.out.print(a+"\t");
		}
		System.out.println();
		//输出前三名
		System.out.println("前三名的分数为：");
		int curIndex = 0;
		for(int i=0;i<3;i++){
			int curScore = arr[curIndex];
			for(int j=curIndex;j<arr.length;j++){
				if(arr[j]==curScore){
					System.out.println(arr[j]);
				}else{
					curIndex=j;
					break;
				}
			}

		}
	}
}
