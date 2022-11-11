package com.sgtesting.excelassaignments;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assaignment4 {

	public static void main(String[] args)
	{
		try
		{
			XSSFWorkbook workbook=new XSSFWorkbook();
			XSSFSheet sheet=workbook.createSheet("Sheet1");
			Object flower[][]= {{"rose","red"},{"lotous","yellow"},{"dasavala","white"},{"Chrysanthemum","green"},
			{"rose","red"},{"lotous","yellow"},{"dasavala","white"},{"Chrysanthemum","green"},
			{"rose","red"},{"lotous","yellow"},{"dasavala","white"},{"Chrysanthemum","green"},
			{"rose","red"},{"lotous","yellow"},{"dasavala","white"},{"Chrysanthemum","green"},
			{"rose","red"},{"lotous","yellow"},{"dasavala","white"},{"Chrysanthemum","green"}};
			int row =flower.length;
			int column=flower[0].length;
			System.out.println(row);
			System.out.println(column);
			for(int r=0;r<row;r++)
			{
				XSSFRow row1 =sheet.createRow(r) ;
				for(int c=0;c<column;c++)
				{
					 XSSFCell cell=row1.createCell(c);
					 Object val=flower[r][c];
					 if(val instanceof String)
					 {
						 cell.setCellValue((String) val);
					 }
				
				}
				System.out.println("      ");

			}
			String filepath="E:\\ExcelPOI";
			FileOutputStream fout=new 	FileOutputStream(filepath);
			workbook.write(fout);
			fout.close();
			workbook.close();
			System.out.println("updated");

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}

