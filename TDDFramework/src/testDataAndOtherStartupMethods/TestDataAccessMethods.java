package testDataAndOtherStartupMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataAccessMethods {
	
	File file;
	
	public void testDataFileSet(String fileLocation) {
		this.file = new File(fileLocation);
	}
	
	public String testDataRead(int rowNumber, int CellNumber) throws IOException {
		FileInputStream inputStream = new FileInputStream(file);
	    XSSFWorkbook wb=new XSSFWorkbook(inputStream);
	    XSSFSheet sheet=wb.getSheet("UserDetails");
	    XSSFRow row=sheet.getRow(rowNumber);
	    XSSFCell cell=row.getCell(CellNumber);
	    return cell.getStringCellValue();
	}
	
	public void addRows() {
		
	}
	
	public void addCells() {
		
	}
	
	public void addNewSheet() {
		
	}

}
