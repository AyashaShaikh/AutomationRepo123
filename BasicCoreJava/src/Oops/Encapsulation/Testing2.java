package Oops.Encapsulation;

public class Testing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t=new Testing();
		
		//t.age=-10;
		t.setAge(-10);//it is getting any value - also 
		//after initializing in setter if we give - value it will show 0
		t.test();
		//data members publicily expose use can add wrong data like - 
		//make it private also want to expose getter=pass; sett=initialize

	}

}
