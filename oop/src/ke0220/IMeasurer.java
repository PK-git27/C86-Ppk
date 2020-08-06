package ke0220;

/**
 * 
 * 测量工具接口
 *
 */
public interface IMeasurer {

	/**
	 * 用于测量某个对象的属性值，并返回
	 * @param obj
	 * @return
	 */
	double measure(Object obj);
	
}
