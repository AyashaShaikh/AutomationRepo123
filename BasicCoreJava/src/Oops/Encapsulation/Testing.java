package Oops.Encapsulation;

public class Testing {
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if(age>0)//control initialize.
		this.age = age;
	}

	public void test()
	{
		System.out.println("Your age is="+age);
	}

}
