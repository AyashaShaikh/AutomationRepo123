package Functions;

public class AccessModifiers {

		// TODO Auto-generated method stub
		//No need of main function
		//Define a class within the class
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		
		obj.publicFunction();
		obj.privateFunction();
		obj.noAccessModFunction();
		obj.privateFunction();
		
	}
		//Throughout the project
		public void publicFunction()
		{
			System.out.println("Public Fucntion");
		}
		
		//Within the class
		private void privateFunction()
		{
			System.out.println("Private Function");
		}
		
		//Within the package and by using child class can be accessed throughout the project.
		protected void ProtectedFunction()
		{
			System.out.println("Protected Function");
		}
		
		//Within the package
		void noAccessModFunction()
		{
			System.out.println("NoAccessMod Function");
		}
		

	}


