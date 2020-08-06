/**
 * 测试类
 * @author pk
 *
 */
public class Test02 {
	
	public static void main(String[] args) {
		Student s01=new Student();
		//调用成员函数：对象名.成员函数(实参列表)
		s01.showInfo();
		//s01.sid=100;   属性私有化后，无法直接访问
		//实体类提供对外访问的setter方法
		s01.setAge(23);
		s01.setSname("liu");
		s01.setSid(22222);
		s01.showInfo();
		//获取学号
		int sid=s01.getSid();
		System.out.println("查询的学号如下"+sid);
		
		Student s02=new Student(5555);
		s02.setSid(5555);
		s02.showInfo();
		System.out.println("++++++++++++++++++++++++++++++++");
		Student s03=new Student(555666);
		s03.showInfo();
		Student s04=new Student(222,"jj",666);
		s04.showInfo();
	}
}
