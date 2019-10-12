package Oops.Inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone=new SmartPhone();
		phone.internet();
		//phone.calling();
		phone.texting();
		
		//Multilevel inheritance-Smartphone-Mobile-Telephone
		// calling from other classes
		
		Telephone phone2=new Telephone();
		phone2.calling();//only call calling () of telephone
		//static poly=gives you option which to select-overloading
		
		phone2=new Mobile();//refrence of telephone and object of mobile//refe of parent and create obj of child class allowed in java
		//you can call only fuction which are present in only parent class
		
		//phone2.tex-you cant use text from mobile even if object of mobile 
		phone2.calling();}
		//dynamic plymorhism=prent refe child object=ohj child=reference of parent it takes recent or call recent one=overriden function call from child class
		//runtime binding, polymorphism
		//enhancing  the functions
		//same method same parameter same parent child-overriding
		//overloading=same function parameters are diff
		//
	
}
