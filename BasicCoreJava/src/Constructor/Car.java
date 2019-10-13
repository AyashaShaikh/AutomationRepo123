package Constructor;

public class Car {
	String model;//instance variable
	String color;
	String type;
	
	//constructor name same to the class name looking same function but no return type
	//default constructor is public
	//object is always created default constructor if we donot define the constructor 
	//it is of public class what the class name 
	public Car()//initiaze obj variable or instance variable
	{
		
	}
	
	public Car(String model, String color, String type)
	//parameterized constructor//local variable
	{
		
		//model=model;//instance variable and local variable name same use 'this' keyword to identify instance variable
		this.model=model;
		this.color=color;
		this.type=type;
	}
	//more than one constructor constructor overloading
	public void specification()
	{
		System.out.println("The "+color+" "+model+" is "+type);
		//if bgin and end no ""
	}

}
