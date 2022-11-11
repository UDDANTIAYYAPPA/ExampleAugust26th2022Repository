package com.sgtesting.excelassaignments;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assaignment6
{

	public static void main(String[] args) 
	{
		try
		{
		String excelfilepath="E:\\EXCEL\\Countryname.xlsx";
		FileInputStream fin=new FileInputStream(excelfilepath);
		
		
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		int col=sheet.getRow(1).getLastCellNum();
		for(int r=0;r<=rows;r++)
		{
		    XSSFRow row=sheet.getRow(r);
		 
		    for(int c=0;c<1;c++)
		    {
		      XSSFCell cell= row.getCell(c);
		      switch(cell.getCellType())
		      {
		      case STRING:System.out.println(cell.getStringCellValue()); break;
		     
		      }
		      System.out.print("     ");
		    }
		   System.out.println();    
		}
		  
		
	    }catch(Exception e)
		{
		e.printStackTrace();
		}
}
}

