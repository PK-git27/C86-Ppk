package ke0220;

public class Person {

	private String name;
	
	private double height;
	
	private double weight;
	
	private double eatmoney;
	
	private double allmoney;
	

	public Person(String name, double height, double weight, double eatmoney, double allmoney) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.eatmoney = eatmoney;
		this.allmoney = allmoney;
	}

	/*
	 * 属性方法：设值方法set，取值方法get
	 */
	
	public void setName(String name){
		if(name==null){
			System.out.println("请输入用户名!");
			return;
		}
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setWeight(double weight){
		this.height = weight;
	}
	
	public double getWeight(){
		return weight;
	}

	public double getEatmoney() {
		return eatmoney;
	}

	public void setEatmoney(double eatmoney) {
		this.eatmoney = eatmoney;
	}

	public double getAllmoney() {
		return allmoney;
	}

	public void setAllmoney(double allmoney) {
		this.allmoney = allmoney;
	}
	
	
}
