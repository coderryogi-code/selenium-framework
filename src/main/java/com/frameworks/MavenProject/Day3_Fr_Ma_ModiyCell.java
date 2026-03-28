package com.frameworks.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Day3_Fr_Ma_ModiyCell {

	public static void main(String[] args) throws Exception {

		File nfile = new File("/Users/yogeshpraveen/Testing/Frameworks/TestData/Test1.xlsx");
		FileInputStream read = new FileInputStream(nfile);
		Workbook wrkb = new XSSFWorkbook(read);
		Sheet sheet = wrkb.getSheet("TD2");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);

		DataFormatter dataFormatter = new DataFormatter();
		String frmtclvlue = dataFormatter.formatCellValue(cell);

		//checking the equality of the cell value is vishal
		if(frmtclvlue.equals("Vishal")) {
			//If yes --> replace the celldata as Ashok
			cell.setCellValue("Ashok");
		}

		//to save the file -> object->file->fileoutputstreamclass -> save
		FileOutputStream save = new FileOutputStream(nfile);

		//Write in workbook
		wrkb.write(save);
		System.out.println("Done");

		//Insert value in the cell
		Row row2 = sheet.getRow(3);
		Cell cell2 = row2.createCell(3);
		cell2.setCellValue("Greens");

		FileOutputStream fileoutputstream = new FileOutputStream(nfile);
		wrkb.write(fileoutputstream);
		System.out.println("Writing Done");

		//Get the celldata as string by adding a new row
		Row row9 = sheet.createRow(9);
		Cell cell0 = row9.createCell(0);
		cell0.setCellValue("Tech");

		FileOutputStream fileoutputstream1 = new FileOutputStream(nfile);
		wrkb.write(fileoutputstream1);
		System.out.println("New Row created");
	}
}

