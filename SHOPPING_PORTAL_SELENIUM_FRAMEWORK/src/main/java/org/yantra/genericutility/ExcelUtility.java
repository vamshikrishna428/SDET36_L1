package org.yantra.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class has reusable methods
 * 
 * @author Vamshi
 *
 */
public class ExcelUtility {
	/**
	 * this method is used to initialize excel
	 * 
	 * @param excelpath
	 */
	Workbook workbook;

	public void Initialize(String excelpath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public String getExcelData(String sheetName, int rowNum, int cellNum) {
		DataFormatter dataformater = new DataFormatter();
		String data = dataformater.formatCellValue(workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
		return data;
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 */
	public void setExcelData(String sheetName, int rowNum, int cellNum, String result) {
		workbook.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(result);

	}

	/**
	 * 
	 * 
	 *  
	 * 
	 * 
	 */
	public void saveExcelData(String excelpath) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * this method is used to close workbook
	 */
	public void closeWorkbook() {
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
