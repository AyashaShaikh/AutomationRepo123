package Oops.Abstraction;

public class jwelleryshop implements sell {

	
	  
	  public void jwellery() { System.out.println("Necklace"); } public void
	  grocery() { System.out.println("Chimney"); }
	  
	  public void clothing() { System.out.println("Kids wear");
	  
	  } public void seafood() { System.out.println("Fish");
	  
	  } public void vegetables() { System.out.println("Leafy vegies");
	  
	  } public void furniture() { System.out.println("Chairs"); }
	  
	  
	  
	  public static void main(String[] args) { jwelleryshop jw=new jwelleryshop();
	  jw.clothing(); jw.furniture(); jw.jwellery(); jw.seafood(); jw.vegetables();
	  jw.grocery(); }
	  
	 
}
