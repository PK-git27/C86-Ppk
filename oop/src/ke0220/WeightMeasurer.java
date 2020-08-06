package ke0220;
/**
 * 
 * 测量体重
 *
 */
public class WeightMeasurer implements IMeasurer{

	public double measure(Object obj) {
		if(obj instanceof Person){
			Person person = (Person)obj;
			return person.getWeight();
			
		}else{
			return -1;
		}
	}

}
