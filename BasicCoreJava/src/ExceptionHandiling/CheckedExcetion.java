package ExceptionHandiling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExcetion {
	//compiler checked that is checked
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Step 1");
		
		//Interupted exception
		Thread.sleep(2000);//static method call by class name..throws you do or pass it
		//throws used to pass the exception the the next user. 
		
		System.out.println("Step 2");
		
		FileInputStream file=new FileInputStream("");
		//throws only suggest nothing doing
		//import fileinputstream, still showing excetion
		//creat obj of class not in pakage
		
		
	}

}
