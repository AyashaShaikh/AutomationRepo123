package Functions;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj=new MethodOverloading();
		obj.sum(10, 20);
		// hover overloaded all function but in overriding only one shows at compile time

	}
	public void sum(int a, int b) 
	{
		System.out.println(a+b);
	}
	//if you want to use same function then u add one parameter
	public void sum(int a, int b, int c) {
		
		System.out.println(a+b+c);
	}

	
}
