package Oops.Inheritance;

//right of extends is parent and left of extends is child
//parent super class
public class Mobile extends Telephone {

	
		public void texting()
		{
			System.out.println("Texting from Mobile");
		}
//arg change in child class then u call 
//parent child same function and same parameters then overiding
		
		public void calling()
		{
			System.out.println("Calling from Mobile");
		}
		//calling() from telephone also from mobile =override symbol green arrow

}



