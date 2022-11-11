package com.sgtesting.excelassaignments;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assaignment3 {

	public static void main(String[] args) {
		try
		{
			XSSFWorkbook workbook=new XSSFWorkbook();
			XSSFSheet sheet=workbook.createSheet("Sheet1");

			XSSFRow row=sheet.createRow(0);
			row.createCell(4).setCellValue("Bangalore");

			XSSFRow row1=sheet.createRow(1);
			row1.createCell(4).setCellValue("MYSORE");


			XSSFRow row2=sheet.createRow(2);
			row2.createCell(4).setCellValue("Mangalore");

			XSSFRow row3=sheet.createRow(3);
			row3.createCell(4).setCellValue("HUBLI");
			XSSFRow row4=sheet.createRow(4);
			row4.createCell(4).setCellValue("HASSAN");
			XSSFRow row5=sheet.createRow(5);
			row5.createCell(4).setCellValue("DHARAMASTALA");

			XSSFRow row6=sheet.createRow(6);
			row6.createCell(4).setCellValue("DHARAVADA");

			XSSFRow row7=sheet.createRow(7);
			row7.createCell(4).setCellValue("SHIVAMOGGA");

			XSSFRow row8=sheet.createRow(8);
			row8.createCell(4).setCellValue("DEVANAHALLI");

			XSSFRow row9=sheet.createRow(9);
			row9.createCell(4).setCellValue("KOLAR");
			XSSFRow row10=sheet.createRow(10);
			row10.createCell(4).setCellValue("CHIKKABALLAPURA");
			XSSFRow row11=sheet.createRow(11);
			row11.createCell(4).setCellValue("GOWRIBIDANUR");
			XSSFRow row12=sheet.createRow(12);
			row12.createCell(4).setCellValue("DODDABALLAPURA");

			XSSFRow row13=sheet.createRow(13);
			row13.createCell(4).setCellValue("KOLAR");
			XSSFRow row14=sheet.createRow(14);
			row14.createCell(4).setCellValue("CHIKKABALLAPURA");
			XSSFRow row15=sheet.createRow(15);
			row15.createCell(4).setCellValue("GOWRIBIDANUR");
			XSSFRow row16=sheet.createRow(16);
			row16.createCell(4).setCellValue("DODDABALLAPURA");

			XSSFRow row17=sheet.createRow(17);
			row17.createCell(4).setCellValue("KOLAR");
			XSSFRow row18=sheet.createRow(18);
			row18.createCell(4).setCellValue("CHIKKABALLAPURA");
			XSSFRow row19=sheet.createRow(19);
			row19.createCell(4).setCellValue("GOWRIBIDANUR");


			String filepath="E:\\ExcelPOI";
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
