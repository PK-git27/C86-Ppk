package ke0220;

/**
 * 
 * 测量工具(Measurer) 对某类对象的属性值进行测定，选出其中最大和最小的对象 测试的属性值与测试工具有关 使用一个测试对象
 *
 */
public class Demo1 {
	public static void main(String[] args) {

		//创建容器
		Container container = new Container();
		//创建测量身高的测量工具
		HeightMeasurer hm = new HeightMeasurer();
		//设置测量工具
		container.setMeasurer(hm);
		
		container.addObject(new Person("耗子哥",1.68,60,2000,20000)); 
		container.addObject(new Person("杰子哥",1.65,70,3000,50000)); 
		container.addObject(new Person("航子哥",1.70,80,5000,6000)); 
		container.addObject(new Person("樟子哥",1.50,69,300,60000)); 
		
		
		container.measure();
		double max = container.getMax();
		double min = container.getMin();
		Object obj=container.getMaxObject();//
		Person person = (Person) obj;//类型转换
		System.out.println("最高的身高："+person.getName()+"，身高："+max);
		obj=container.getMinObject();//
		person = (Person) obj;
		System.out.println("最矮的身高："+person.getName()+"，身高："+min);
		
		BmiMeasurer bm = new BmiMeasurer();
		container.setMeasurer(bm);
		container.measure();
		max = container.getMax();
		min = container.getMin();
		obj=container.getMaxObject();
		person = (Person) obj;
		System.out.println("最胖的Bmi值："+person.getName()+"，Bmi值："+ max);
		obj=container.getMinObject();
		person = (Person) obj;
		System.out.println("最瘦的Bmi值："+person.getName()+"，Bmi值："+ min);
		
		WeightMeasurer wm = new WeightMeasurer();
		container.setMeasurer(wm);
		container.measure();
		max = container.getMax();
		min = container.getMin();
		obj=container.getMaxObject();
		person = (Person) obj;
		System.out.println("最胖的体重："+person.getName()+"，体重："+ max);
		obj=container.getMinObject();
		person = (Person) obj;
		System.out.println("最瘦的体重："+person.getName()+"，体重："+ min);
		
		EngelMeasurer em = new EngelMeasurer();
		container.setMeasurer(em);
		container.measure();
		max = container.getMax();
		min = container.getMin();
		obj=container.getMaxObject();
		person = (Person) obj;
		System.out.println("最高的恩格尔系数："+person.getName()+"，系数："+ max);
		obj=container.getMinObject();
		person = (Person) obj;
		System.out.println("最低的恩格尔系数："+person.getName()+"，系数："+ min);
		
	}
}
