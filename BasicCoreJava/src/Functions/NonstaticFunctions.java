package Functions;

public class NonstaticFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//below is obj is reference after new is object these 3 names must be same
		NonstaticFunctions obj=new NonstaticFunctions();
		int add=obj.sum(10,20);
		
		System.out.println(add);
		//static fun variable from other class use calss name
		Function1.sum(10, 20);
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}

}
