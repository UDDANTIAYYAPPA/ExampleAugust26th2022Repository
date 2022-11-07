package com.sgtesting.excelassaignments;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assaignment2 
{

	public static void main(String[] args)
	{
		try
		{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet1");

	XSSFRow row=sheet.createRow(9);
	   
	
      	row.createCell(0).setCellValue("Blue");
     	row.createCell(1).setCellValue("Red");
     	row.createCell(2).setCellValue("BLACK");
     	row.createCell(3).setCellValue("YELLO");
     	row.createCell(4).setCellValue("GOLD");
     	row.createCell(5).setCellValue("LIGHT RED");
     	row.createCell(6).setCellValue("ORCHID");
     	row.createCell(7).setCellValue("GREEN");
     	row.createCell(8).setCellValue("CHOLOCATE");
     	row.createCell(9).setCellValue("SALMON");
     	row.createCell(10).setCellValue("WHITE");
     	row.createCell(11).setCellValue("IVORY");
     	row.createCell(12).setCellValue("WHEAT");
     	row.createCell(13).setCellValue("DARKRED");
     	row.createCell(14).setCellValue("BROWN");
     	row.createCell(15).setCellValue("SILVER");
     	row.createCell(16).setCellValue("VIOLET RED");
     	row.createCell(17).setCellValue("SANDY BROWN");
     	row.createCell(18).setCellValue("GOLDEN");
     	row.createCell(19).setCellValue("MAROON");
     	String filepath="E:\\EXCEL\\Welcome.xlsx";
    	FileOutputStream fout=new 	FileOutputStream(filepath);
		workbook.write(fout);
		fout.close();
		workbook.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
