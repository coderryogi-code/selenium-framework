package com.frameworks.MavenProject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Day2_TestTask {
	public static void main(String[] args) throws Exception {
		File file = new File("/Users/yogeshpraveen/Testing/Frameworks/TestData/Test1.xlsx");
		FileInputStream read = new FileInputStream(file);
		Workbook wrkb = new XSSFWorkbook(read);
		Sheet sheet = wrkb.getSheet("TD2");
		
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(lastRowNum + " , " + physicalNumberOfRows + " , " + lastCellNum);
		

		for (int i = 0; i < lastRowNum; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < 4; j++) {
				Cell cell = row.getCell(j);
				
//				String value = cell.getStringCellValue();
				System.out.println(cell);
				System.out.println(cell.getCellType());
			} 
		}
	}
}



