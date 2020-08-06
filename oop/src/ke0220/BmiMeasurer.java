package ke0220;
/**
 * 
 *测量肥胖指数
 *
 */
public class BmiMeasurer implements IMeasurer{

	@Override
	public double measure(Object obj) {
		if(obj instanceof Person){
			Person person = (Person)obj;
			//体重/身高的平方=bmi值
			return person.getWeight() / (person.getHeight()*person.getHeight());
			
		}else{
			return -1;
		}
	}

	
	
}
