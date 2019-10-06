package DataTypesAndVariables;

import Functions.AccessModifiers;
//this statment is used to call other function from different pakg
public class TestAccessModProjectLevel extends AccessModifiers{
	//extend is keyword to acquire properties of parent class 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		
		TestAccessModProjectLevel obj2=new TestAccessModProjectLevel();
		obj2.ProtectedFunction();
		
		

	}

}
