package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataExcelSheet {
	public static void main(String[] args) throws Exception {
		//open workboook
		String path="D:\\\\Selenium\\\\TestProject\\\\User.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook book=WorkbookFactory.create(file);
		
		//open sheet
		Sheet s = book.getSheet("Sheet1");
		//Identify Row
		Row r = s.getRow(0);
		//Identify cell
		Cell c = r.getCell(0);
	    //fetch cell value
		String value = c.getStringCellValue();
		System.out.println(value);
		
	}
}
