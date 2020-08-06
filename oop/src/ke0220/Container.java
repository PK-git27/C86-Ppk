package ke0220;
/**
 * 
 * 容器类
 *
 */
public class Container {
	
	//存放对象的数组
	private Object [] objects = new Object[100];
	//存放对象在第几个元素上,元素位置的下标值
	private int index;
	
	private IMeasurer measurer;
	
	private double min = -1;
	private double max = -1;
	private Object maxObject;
	private Object minObject;
	
	
	public void addObject(Object obj){
		if(index==100){
			System.out.println("容器已满！！！");
			return;
		}
		if(obj==null){
			System.out.println("测量对象不能为空");
			return;
		}
		objects[index] = obj;
		index++;
		
	}
	
	public void setMeasurer(IMeasurer m){
		this.measurer = m;
	}
	/**
	 * 实现对象数组的测量，得出结论
	 */
	public void measure(){

		max = -1;
		min = -1;
		maxObject = null;
		minObject = null;
		for(Object obj : objects){
			if(obj==null){
				break;
			}
			double value = measurer.measure(obj);
			if(min==-1 || min>value){
				min = value;
				minObject = obj;
			}
			if(max==-1 || max<value){
				max = value;
				maxObject = obj;
			}
		}
	}
	
	public double getMax(){
		return max;
	}
	
	public double getMin(){
		return min;
	}

	public Object getMaxObject() {
		return maxObject;
	}

	public Object getMinObject() {
		return minObject;
	}

	
	
}
