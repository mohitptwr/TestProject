package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateDataInSheet {
	public static void main(String[] args) throws Exception {
		//open workboook
				String path="D:\\Selenium\\TestProject\\User.xlsx";
				FileInputStream file=new FileInputStream(path);
				Workbook book=WorkbookFactory.create(file);
				
				//Create sheet
				Sheet s = book.createSheet("Automation");
				//Create Row
				Row r = s.createRow(0);
				//Create Cell
				Cell c = r.createCell(0);
				//set cell value
				c.setCellValue("Selenium_3.141.59");
				
				//Save the Workbook
				book.write(new FileOutputStream(path));
				System.out.println("Execution Completed");
				
	}

}
