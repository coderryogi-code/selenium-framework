package com.frameworks.MavenProject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2_Fr_Ma_Task {
	public static void main(String[] args) throws Exception {
		//Mention the path of the excel
		File file = new File("/Users/yogeshpraveen/Testing/MavenProject/TestData/Task2F.xlsx");

		//Read objects / bytes from file -> file input stream
		FileInputStream fileinputstream = new FileInputStream(file);

		//Mention the workbook
		Workbook workbook = new XSSFWorkbook(fileinputstream);

		//SheetName
		Sheet sheet = workbook.getSheet("Sheet1");

		//Get the row
		Row row = sheet.getRow(1);

		//Get the Cell
		Cell cell = row.getCell(1);
		System.out.println("To get the particular cell value - " + cell);

		//Get the rows count
		int rcount = sheet.getPhysicalNumberOfRows();
		System.out.println("To get the rows count - " +rcount);

		//Cells Count
		int ccount = row.getPhysicalNumberOfCells();
		System.out.println("To get the cells count - " +ccount);
		System.out.println();

		//	-------------

		//Iterate all the rows but its not used anywhere so its useless
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			//get each row
			Row row1 = sheet.getRow(i);

			//iterate all cells
			for (int j = 0; j < row1.getPhysicalNumberOfCells(); j++) {
				//get each cell
				Cell cell1 = row1.getCell(j);
				//	System.out.println(cell1);

				//To get all values in the string
				DataFormatter dataformatter = new DataFormatter();
				String formatCellValue = dataformatter.formatCellValue(cell1);
				System.out.println(formatCellValue);
			}		
		}
	} 

}
