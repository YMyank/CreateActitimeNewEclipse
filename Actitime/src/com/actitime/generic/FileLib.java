package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileLib {

public String getPropertyData(String key) throws IOException {
	FileInputStream fis= new FileInputStream("./Data/commonTestData.property");
	Properties p= new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
	}


public String getExcelData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./Data/ExcelTestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return value;
}


public void setExcelData(String sheetName, int row, int cell, String setdata) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./Data/ExcelTestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(setdata);
FileOutputStream fos= new FileOutputStream("./Data/ExcelTestData.xlsx");
 wb.write(fos);
	
}

}
