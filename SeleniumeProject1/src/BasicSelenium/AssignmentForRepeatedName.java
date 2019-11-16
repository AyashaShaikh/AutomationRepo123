package BasicSelenium;

public class AssignmentForRepeatedName {

	public static void main(String[] args) {
		//How many time does n repeates
		//Logic string legth i.e. 5 then how many time does n replace by nothing then 5-3=2
		String name="Anand";
		System.out.println(name.length()-name.replace("n", "").length());
		
	}
}
