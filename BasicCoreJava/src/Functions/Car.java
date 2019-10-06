package Functions;

public class Car {
	String color;
	
	 static int wheels;
	 
	String model;
	String brand;
	
	public void powerSteering()
	{
		System.out.println("All "+wheels+" wheels support power steering");
	}
	//concat
	public void lookAndFeel()
	{
		System.out.println(brand+" has "+color+" color in "+model+" car");
	}
}
