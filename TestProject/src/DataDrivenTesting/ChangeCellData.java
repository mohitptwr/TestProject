package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ChangeCellData {
	public static void main(String[] args) throws Exception {
		String path="D:\\Selenium\\TestProject\\User.xlsx";
		//Read Data
		FileInputStream file=new FileInputStream(path);
		//open workbook
		Workbook book=WorkbookFactory.create(file);
		//open sheet
		Sheet s = book.getSheet("Sheet1");
		//Identify Row
		Row r = s.getRow(0);
		//Change the value of the cell
		Cell c = r.getCell(0);
		
		c.setCellValue("Mohit");
		System.out.println(c);
		//Save the changes
		FileOutputStream op=new FileOutputStream(path);
		book.write(op);	
	}
}
