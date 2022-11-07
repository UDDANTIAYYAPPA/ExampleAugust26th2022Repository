package com.sgtesting.excelassaignments;

import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assaignment5 
{

	public static void main(String[] args) 
	{
		try
		{
			XSSFWorkbook workbook=new XSSFWorkbook();
			XSSFSheet sheet=workbook.createSheet("Sheet1");
			String flower[]= {"Andrapradesh","Karnataka ","Goa","Assam","Bihar","Arunachala","Chattisgarh","KERALA","TAMILNADU","MEGALAYA",
					"Andrapradesh","Karnataka ","Goa","Assam","Bihar","Arunachala","Chattisgarh","KERALA","TAMILNADU","MEGALAYA"};
			//	int row =flower.length;
			//	int column=flower[0].length;
			//	System.out.println(row);
			//		System.out.println(column);
			for(int r=0;r<20;r++)
			{
				XSSFRow row1 =sheet.createRow(r);
				for(int c=0;c<=r;c++)
				{
					if(r>=2 && c<=r-1)
					{
						System.out.print("    ");
					}
					else
					{

						XSSFCell cell=row1.createCell(c);
						String val=flower[c];

						cell.setCellValue( val);
					}
					System.out.println();
				}

			}
			String filepath="E:\\EXCEL\\Welcome.xlsx";
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
