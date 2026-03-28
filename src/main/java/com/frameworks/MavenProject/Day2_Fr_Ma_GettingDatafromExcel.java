package com.frameworks.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2_Fr_Ma_GettingDatafromExcel {
	public static void main(String[] args) throws IOException {
		
		//Mention the path of the excel
		File file = new File("/Users/yogeshpraveen/Testing/MavenProject/TestData/Test.xlsx");
		
		//Read objects / bytes from file -> file input stream
		FileInputStream fileinputstream = new FileInputStream(file);
		
		//Mention the workbook
		Workbook workbook = new XSSFWorkbook(fileinputstream);
		
		//SheetName
		Sheet sheet = workbook.getSheet("Testdata");
		
		//Get the row
		Row row = sheet.getRow(2);
		
		//Get the Cell
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
	}
}
