package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class MapInterface {
	
	@Test(enabled=false)
	public void test1()
	{
		Map<String, String> map=new HashMap<String, String>();
		//suppose id is string and name is string then use string
		map.put("name1", "Sristi");
		map.put("name2", "Nikhil");
		map.put("name3", "Aniket");
		map.put("name4", "Ganesh");
		map.put("name5", "Jaywant");
		map.put("name6", "Sweety");
		map.put(null, "pratik");
		map.put("name7", "Ashutosh");
		map.put("name4", "Somya");
		//name4 is same it gives you the last one 
		
		
		
		Set<String> keys=map.keySet();
		//ketset is a method that gives u set of keys and its return type is set(set is of string set ) it stored in keys then we iterate key and put it.
		
		for(String key:keys)
		{
			System.out.println(map.get(key));
			//System.out.println(key);
			//map.get gives u values and if you put only key it will gives u only keys that is name1 name2
		}
		
		//System.out.println(map.get("name1"));
		
		
		/*
		 * System.out.println(map.get("name1")); System.out.println(map.get("name2"));
		 * System.out.println(map.get("name3")); System.out.println(map.get("name4"));
		 * System.out.println(map.get("name5")); System.out.println(map.get("name6"));
		 */
		
	}
	@Test
	public void test2()
	{
		Map<String, String> map=new Hashtable<String, String>();
		//suppose id is string and name is string then use string
		map.put("name1", "Sristi");
		map.put("name2", "Nikhil");
		map.put("name3", "Aniket");
		map.put("name4", "Ganesh");
		map.put("name5", "Jaywant");
		map.put("name6", "Sweety");
		//map.put(null, "pratik");
		map.put("name7", "Ashutosh");
		map.put("name4", "Somya");
		//name4 is same it gives you the last one 
		
		
		
		Set<String> keys=map.keySet();
		//ketset is a method that gives u set of keys and its return type is set(set is of string set ) it stored in keys then we iterate key and put it.
		
		for(String key:keys)
		{
			System.out.println(map.get(key));
			//System.out.println(key);
			//map.get gives u values and if you put only key it will gives u only keys that is name1 name2
		}
		
		//System.out.println(map.get("name1"));
		
		
		/*
		 * System.out.println(map.get("name1")); System.out.println(map.get("name2"));
		 * System.out.println(map.get("name3")); System.out.println(map.get("name4"));
		 * System.out.println(map.get("name5")); System.out.println(map.get("name6"));
		 */
		
	}



}
