package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyTotalRows {
	public static void main(String[] args) throws Exception {
		String path="D:\\Selenium\\TestProject\\User.xlsx";
		//Read File
		FileInputStream file=new FileInputStream(path);
		
		//open workbook
		Workbook book=WorkbookFactory.create(file);
		
		//open sheet
		Sheet s = book.getSheet("Sheet3");
		
		//Verify Row count
		int n = s.getLastRowNum();
		
		System.out.println("Toatal no. of rows count "+n);
		
		//Verify total cell counts
		Row c = s.getRow(0);
		
		short ce = c.getLastCellNum();
		System.out.println("Toatal no. of cells count "+ce);
	}
}
