package practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exercise {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/practise.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet row = wb.getSheetAt(0);
		int col = row.getRow(1).getLastCellNum();
	
		
		
		
		
		
		
		
	}
	
}
