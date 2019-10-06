package Functions;

public class User {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="Maruti";
		//car1.wheels=4;
		car1.color="Black";
		car1.model="sedan";
		car1.powerSteering();
		car1.lookAndFeel();
		// TODO Auto-generated method stub
		
		Car car2=new Car();
		//car2.brand="Honda";
		car2.wheels=4;
		car2.color="Blue";
		car2.model="SUV";
		car2.powerSteering();
		car2.lookAndFeel();

	}

}
