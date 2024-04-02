package com.pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class myClass01 {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\sindh\\Desktop\\TestPOI.xlsx");
		FileInputStream input = new	FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(input);
		HSSFSheet sh = wb.getSheetAt(0);
		HSSFRow row = sh.getRow(1);
		HSSFCell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);
		wb.close();
				
	}

}
