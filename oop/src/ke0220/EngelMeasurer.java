package ke0220;

public class EngelMeasurer implements IMeasurer{


	public double measure(Object obj) {
		if(obj instanceof Person){
			Person person = (Person)obj;
			return (person.getEatmoney()/person.getAllmoney())*1.00;
			
		}else{
			return -1;
		}
	}

}
