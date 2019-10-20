package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetInterface {
	
	//It doesn't suppor primitive datatypes so put Integer
	
	@Test(priority=2)
	public void test1()
	{
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		//list allows duplicate entries and set doesn't allow duplicate entries
		
		for(int a:set)
		{
			System.out.println(a);
		}
		System.out.println("*********First************");
	}
	
	@Test(priority=1)
	public void test2()
	{
		Set<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		//list allows duplicate entries and set doesn't allow duplicate entries
		
		for(int a:set)
		{
			System.out.println(a);
		}
		System.out.println("**********Second***********");
	}
	
	@Test(priority=0)
	public void test3()
	{
		Set<Integer> set=new TreeSet<>();
		set.add(30);
		set.add(10);
		set.add(10);
		set.add(20);
		//list allows duplicate entries and set doesn't allow duplicate entries
		
		for(int a:set)
		{
			System.out.println(a);
		}
		System.out.println("**********Third***********");
	}


}
