package Functions;

public class TestAccessModPackageLevel {
	
	//call class within the package
	public static void main(String[] args) {
		
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		obj.noAccessModFunction();
		obj.ProtectedFunction();
		
		
	}

}
