package FileHandling;

import java.io.IOException;

public class User {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filepath=System.getProperty("user.dir")+"\\src\\FileHandling\\TestData.xls";
		
		Xls_Reader xl=new Xls_Reader(filepath);
		
		System.out.println(xl.getColumnCount("Sheet1"));
		System.out.println(xl.getRowCount("Sheet1"));
		System.out.println(xl.getCellData("Sheet1", 1, 1));
		System.out.println(xl.getCellData("Sheet1", 1, 2));
		
		
		  xl.setCellData("Sheet1", 2, 1, "Shaikh");
		  
		  System.out.println(xl.getCellData("Sheet1", 2, 1));
		  
		 
		
		int rows=xl.getRowCount("Sheet1");
		int cols=xl.getColumnCount("Sheet1");
		
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				System.out.print(xl.getCellData("Sheet1",r,c)+" ");
			}
			System.out.println();
		}



	}

}
