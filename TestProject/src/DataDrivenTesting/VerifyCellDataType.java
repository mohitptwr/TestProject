package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyCellDataType {
	public static void main(String[] args) throws Exception {
		String path="D:\\Selenium\\TestProject\\User.xlsx";
		
		//Read File
		FileInputStream file=new FileInputStream(path);
	    
		//open workbook	
		Workbook book=WorkbookFactory.create(file);
		
		//open Sheet
		Sheet s = book.getSheet("Sheet1");
		
		//Identify Row
		Row r = s.getRow(0);
		
		//Identify Cell
		Cell c = r.getCell(0);
		
		//verify cell type
		CellType cellType = c.getCellType();
		if (cellType.equals("INTEGER")) {
			System.out.println("Data is integer");
			double val=c.getNumericCellValue();
			System.out.println(val);
		} else {
			String value = c.getStringCellValue();
			System.out.println(value);
		}
		
	}

}
