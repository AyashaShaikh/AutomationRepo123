package Arrays;

public class TwoDimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data=new String[5][2];
		//5row length
		//Row 1
		data[0][0]="Username1";
		data[0][1]="Password";
		
		//Row 2
		data[1][0]="Username2";
		data[1][1]="Password2";
		
		
		//Row 3
		data[2][0]="Username3";
		data[2][1]="Password3";
		
		//Row 4
		data[3][0]="Username4";
		data[3][1]="Password4";
		
		//Row 5
		data[4][0]="Username5";
		data[4][1]="Password5";
		
		
		
		/*
		 * for(int r=0; r<=4; r++) { for(int c=0; c<=1; c++) {
		 * System.out.println(data[r][c]); } }
		 */
		
		//Don't need to hardcoded length of row and column it will give u runtime same thing.
		
		for(int r=0; r<data.length; r++)
			
		{
			for(int c=0; c<data[0].length; c++)
			
			{
				System.out.println(data[r][c]); } }
			
			//This will print the lenth of array -1, so don't need <= we put only <

	}

}
