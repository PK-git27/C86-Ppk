package ke0213.ke0213.work;
import java.util.Scanner;
public class Classes {

	private Student[] students;
	protected Scanner sc=new Scanner(System.in);
	public Classes(){
		students[0]=new Student("张三",20,123);
		students[1]=new Student("李四",21,456);
		students[2]=new Student("王五",25,789);
		
	}
	/**
	 * 提供查找所有的学生信息的方法
	 */
	public void query(){
	
		System.out.println("所有的学生信息如下");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			
		}
		System.out.println("请输入你要查找的学生姓名：");
		String a=sc.nextLine();
	}
	/**
	 * 提供根据姓名查找学生的方法，并将查出的学生信息显示出来
	 */
	public void find(String name){
		
	}
	/**
	 * 根据姓名查找并修改学生年龄的方法
	 */
	public void edit(String name){
		
	}
}
