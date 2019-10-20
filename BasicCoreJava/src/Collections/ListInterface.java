package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.testng.annotations.Test;

public class ListInterface {
	
	@Test(enabled=false)
	//it disable above test case.
	
	public void test()
	{
		//import list from java.util
		List list=new ArrayList<>();
		//list is interface and linked arraylist is class , we can't create obj of list but can refer.
		list.add("Ayasha");
		list.add(10);
		list.add(true);
		list.add(new ListInterface());
		//array list is of object type
		//you can also create your obj and store it in object e.
		//This means you can add any type data coz object is super class of all the classes.
		//This one is non generic
		//use when we are not sure which kind of data we are going to use
	}
	
	@Test
	
	public void test2()
	{
		//This one is generic , above one is raw we have overcome and make it generice
		List <String> list=new ArrayList<>();
		list.add("Fatema");
		list.add("Irfan");
		list.add("Shaikh");
		list.add("Fatema");
		list.add("Irfan");
		list.add("Shaikh");
		
		//type of array object and list for enhance for loop or for each
		for(String s:list)
		{
			System.out.println(s);
		}
		//reason is you must know what kind of data we are using 
		}

	@Test
	public void test3()
	{
		//This one is generic , above one is raw we have overcome and make it generice
	//Import java.util
		List <String> list=new LinkedList<>();
		list.add("Fatema");
		list.add("Irfan");
		list.add("Shaikh");
		list.add("Fatema");
		list.add("Irfan");
		list.add("Shaikh");
		
		//type of array object and list for enhance for loop or for each
		for(String s:list)
		{
			System.out.println(s);
		
		}
		//reason is you must know what kind of data we are using 
		}

		@Test
		public void test4()
	{
		//This one is generic , above one is raw we have overcome and make it generice
		List <String> list=new Vector<>();
		list.add("Fatema");
		list.add("Irfan");
		list.add("Shaikh");
		list.add("Fatema");
		list.add("Irfan");
		list.add("Shaikh");
		
		//type of array object and list for enhance for loop or for each
		for(String s:list)
		{
			System.out.println(s);
		}
		//reason is you must know what kind of data we are using 
		}


}
