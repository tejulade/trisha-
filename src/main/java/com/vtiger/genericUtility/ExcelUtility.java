package com.vtiger.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getStringDatafromProperty(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new  FileInputStream("./src/test.resources/TestData/testscriptdata.xlsx");
	
	Workbook Workbook = WorkbookFactory.create(fis);
	return Workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	
	}
	public String getBooleanDatafromProperty(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new  FileInputStream("./src/test.resources/TestData/testscriptdata.xlsx");
		
		Workbook Workbook = WorkbookFactory.create(fis);
		return Workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
	}
	public String NumberDatafromProperty(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new  FileInputStream("./src/test.resources/TestData/testscriptdata.xlsx");
		
		Workbook Workbook = WorkbookFactory.create(fis);
		return Workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
	}
	public LocalDateTime getDateAndTimefromProperty(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new  FileInputStream("./src/test.resources/TestData/testscriptdata.xlsx");
		
		Workbook Workbook = WorkbookFactory.create(fis);
		return Workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
		
	}
	

}
