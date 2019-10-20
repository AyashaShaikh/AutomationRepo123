package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {
		
// TODO Auto-generated method stub
		String filepath=System.getProperty("user.dir")+"\\src\\FileHandling\\TestData.xls";
System.out.println(filepath);
		
		FileInputStream file=new FileInputStream(filepath);
		//import and thows declaration add for above and below
		
		HSSFWorkbook ws=new HSSFWorkbook(file);
		//for workbook these classe are in jar file
		//IOexception can handle both or you can use exception that is parent of all
		
		
		HSSFSheet sheet=ws.getSheet("Sheet1");
		
		HSSFRow row=sheet.getRow(0);
		
		HSSFCell cell=row.getCell(0);
		
		cell.setCellValue("Ayasha");
		
		FileOutputStream file2=new FileOutputStream(filepath);
		ws.write(file2);
	}

}
