package com.sgtesting.excelassaignments;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Assaignment1 
{

	public static void main(String[] args)
	{
		try 
		{
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet =workbook.createSheet("FlowerName");
			


			XSSFRow row1=sheet.createRow(0);
			XSSFCell cell=row1.createCell(0);
			cell.setCellValue("Daffodit");
			XSSFRow row2=sheet.createRow(1);
			XSSFCell cell2=row2.createCell(0);
			cell2.setCellValue("Lilly");
			XSSFRow row3=sheet.createRow(2);
			XSSFCell cell3=row3.createCell(0);
			cell3.setCellValue("Jasmin");

			XSSFRow row4=sheet.createRow(3);
			XSSFCell cell4=row4.createCell(0);
			cell4.setCellValue("Marigold");


			XSSFRow row5=sheet.createRow(4);
			XSSFCell cell5=row5.createCell(0);
			cell5.setCellValue("Rose");


			XSSFRow row6=sheet.createRow(5);
			XSSFCell cell6=row6.createCell(0);
			cell6.setCellValue("Lotous");


			XSSFRow row7=sheet.createRow(6);
			XSSFCell cell7=row7.createCell(0);
			cell7.setCellValue("Sunflower");



			XSSFRow row8=sheet.createRow(7);
			XSSFCell cell8=row8.createCell(0);
			cell8.setCellValue("Marigold");


			XSSFRow row9=sheet.createRow(8);
			XSSFCell cell9=row9.createCell(0);
			cell9.setCellValue("Hibicus");


			XSSFRow row10=sheet.createRow(9);
			XSSFCell cell10=row10.createCell(0);
			cell10.setCellValue("Tulip");


			XSSFRow row11=sheet.createRow(10);
			XSSFCell cell11=row11.createCell(0);
			cell11.setCellValue("Daisy");

			XSSFRow row12=sheet.createRow(11);
			XSSFCell cell12=row12.createCell(0);
			cell12.setCellValue("Lavender");


			XSSFRow row13=sheet.createRow(12);
			XSSFCell cell13=row13.createCell(0);
			cell13.setCellValue("Dahlia");



			XSSFRow row14=sheet.createRow(13);
			XSSFCell cell14=row14.createCell(0);
			cell14.setCellValue("BlueBell");


			XSSFRow row15=sheet.createRow(14);
			XSSFCell cell15=row15.createCell(0);
			cell15.setCellValue("Wrwelilly");




			XSSFRow row16=sheet.createRow(15);
			XSSFCell cell16=row16.createCell(0);
			cell16.setCellValue("Orchid");


			XSSFRow row17=sheet.createRow(16);
			XSSFCell cell17=row17.createCell(0);
			cell17.setCellValue("iris");



			XSSFRow row18=sheet.createRow(17);
			XSSFCell cell18=row18.createCell(0);
			cell18.setCellValue("calendula");


			XSSFRow row19=sheet.createRow(18);
			XSSFCell cell19=row19.createCell(0);
			cell19.setCellValue("Geranium");

			XSSFRow row20=sheet.createRow(19);
			XSSFCell cell20=row20.createCell(0);
			cell20.setCellValue("Dandelion");
			
			XSSFRow row21=sheet.createRow(20);
			XSSFCell cell21=row21.createCell(0);
			cell21.setCellValue("Cannabis");
			

			String filepath="E:\\EXCEL\\Welcome.xlsx";
			FileOutputStream fout=new 	FileOutputStream(filepath);
			workbook.write(fout);
			fout.close();
			workbook.close();

		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

}


