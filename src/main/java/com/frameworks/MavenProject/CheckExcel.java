package com.frameworks.MavenProject;

import java.io.IOException;

import com.frameworks.utility.ExcelUtiles;

public class CheckExcel extends ExcelUtiles{
	
	public static void main(String[] args) throws Exception {
		CheckExcel check = new CheckExcel();
		check.createCellData("Testdata", 3, 1, "1000");
		System.out.println("Done");
	}
	
	@Override
	public void createCellData(String sheetName, int rownum, int cellnum, String data) throws IOException {
		// TODO Auto-generated method stub
		super.createCellData(sheetName, rownum, cellnum, data);
	}
	
}
