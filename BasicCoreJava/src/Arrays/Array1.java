package Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//storing homogenous type of data
		String[] str=new String[13];
		str[0]="Pramila";
		str[1]="sristi";
		str[2]="Fatema";
		str[3]="Arsh";
		str[4]="Swomya";
		str[5]="Fatema";
		str[6]="Seema";
		str[7]="Ruhan";
		str[8]="Rizwan";
		str[9]="Ridan";
		str[10]="Ayasha";
		str[11]="Anand";
		str[12]="Rish";
		
		//System.out.println(str[9]);
		/*
		 * for(int i=0; i<=12; i++) { System.out.println(str[i]); }
		 */
		
		//same thing happens like above
		  for(int i=0; i<str.length; i++) 
		  {
			  System.out.println(str[i]); 
		   }
		 
	//str.length is used to put the length of the array without hardcoding means i<=12 so put the above	
	System.out.println(str.length);
	
	//array size beyond initizialization=array index of bound exception
	//string default is null 
	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 12
	//at Arrays.Array1.main(Array1.java:25)
	//integer is default 0
	
		//Enhanced for loop or for each loop
		//You can print the entire thing not the specific one
		/*
		 * for(String s:str) { System.out.println(s); }
		 */
		
		//ctrl shift backslash

}
}
