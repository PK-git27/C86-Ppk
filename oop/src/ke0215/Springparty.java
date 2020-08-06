package ke0215;

/**
 *春晚 
 *
 */
public class Springparty {

	//界面单
	private Program[] programs=new Program[100];
	//最后一个界面的编号
	private int index = 0;
	
	public void Star(){
		
		for(Program p : programs){
			if(p != null){
				p.show();
			}else{
				System.out.println("难忘今宵---------------");
				break;
			}
		}
	}
	/**
	 * 添加节目
	 * @param s
	 */
	public void addProgram(Program p){
		programs[index]= p;
		index++;
	}
	
	public static void main(String[] args) {
		Springparty sp = new Springparty();
		sp.addProgram(new Singe("黄河大合唱","黄河在咆哮"));
		sp.addProgram(new Dance("黑凤梨","蹦恰恰"));
		sp.addProgram(new Magic("大便活人","美滋滋。。。。。。"));
		sp.addProgram(new Kongfu("如来神掌","如------来------神-------掌"));
		sp.Star();
	}
}
/**
 * 节目类
 * @author pk
 *
 */
class Program{
	String name;
	//内容的属性
	String content;
	
	public void show(){
		System.out.print(name+":");
		System.out.println(content);
	}
}

class Singe extends Program{
	Singe(String name,String content){
		this.name=name;
		this.content=content;
	}
	
	
}

class Dance extends Program{
	Dance(String name,String content){
		this.name=name;
		this.content=content;
	}
	
}

class Magic extends Program{
	Magic(String name,String content){
		this.name=name;
		this.content=content;
	}
	
}

class Kongfu extends Program{
	Kongfu(String name,String content){
		this.name=name;
		this.content=content;
	}
	
}