package Constructor;

public class User {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.color="Black";
		car1.type="Automatic";
		car1.model="Sedan";
		car1.specification();
		// TODO Auto-generated method stub

		Car car2=new Car();
		car2.color="Red";
		car2.type="Automatic";
		car2.model="SUV";
		car2.specification();
	
		Car car3=new Car();
		car3.color="White";
		car3.type="Automatic";
		car3.model="Hatchback";
		car3.specification();
		//every time repeating for specification and initializing instance variable
		
		Car car4=new Car("Sedan", "Black", "Manual");
		car4.specification();
		
		/*
		 * Car car5=new Car("Sedan", "Black, "Manual");" car5.specification();
		 */
	}

}
