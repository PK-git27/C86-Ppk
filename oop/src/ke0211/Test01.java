package ke0211;

public class Test01 {
	
	/**
	 * 方法重载
	 */
	int	abs(int num){
		/*三元表达式
		return num > 0? num : -num;
		*/
		if(num>0){
			return num;
		}else{
			return -num;
		}
		
	}
	//重载
	double abs(double num){
		return num > 0? num : -num;
	}
	
	float abs(float num){
		return num > 0? num : -num;
	}
	
	byte abs(byte num){
		return num > 0? num : (byte)-num;
	}
	/**
	 * 重载的要素：
	 * 1.方法名相同
	 * 2.参数不同
	 * 		1.参数类型不同
	 * 		2.参数数量不同
	 * 		3.参数顺序不同
	 * @param args
	 */
	public static void main(String[] args) {
		
		Test01 d=new Test01();
		System.out.println(d.abs(5));
		System.out.println(d.abs(-8));
		
		/**The method abs(int) in the type Test01 is not applicable for the arguments (double)
		 * 没有重载报错 只能接受int值
		 */
		System.out.println(d.abs(-5.5));
		System.out.println(d.abs(-5.1f));
	}
}
