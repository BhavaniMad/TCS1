package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException  {
		
     FileInputStream File=new FileInputStream("C:\\Users\\janardhan\\eclipse-workspace\\TCS1\\TestData\\TestData.xlsx");
     
	 XSSFWorkbook workbook=new XSSFWorkbook(File);	
		
	 XSSFSheet sheet=workbook.getSheet("Sheet1");     //Workbook.getsheet(0)	
		
	int totalrows=sheet.getLastRowNum();
	int totalcells=sheet.getRow(1).getLastCellNum();
	
	System.out.println(totalrows);
	System.out.println(totalcells); 
	 
	 
	   for(int r=0;r<totalrows;r++)
	   {
		   
		XSSFRow Currentrow=sheet.getRow(r);
		   for(int c=0;c<totalcells;c++)
		   {
			String value=Currentrow.getCell(c).toString();   
			System.out.print(value+"    ");   
		   } 
		   
		   System.out.println();
		   
	   }
	
	
	 
	 
	}

}
