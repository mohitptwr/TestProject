package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompareDateoftwoSheet {
	public static void main(String[] args) throws Exception {
		String path="D:\\Selenium\\TestProject\\User.xlsx";
		//Read
		FileInputStream file=new FileInputStream(path);
		//open Workbook
		Workbook book=WorkbookFactory.create(file);
		//open sheet
		Sheet s1 = book.getSheet("Sheet6");
		Sheet s2 = book.getSheet("Sheet7");
		String d1 = s1.getRow(0).getCell(0).toString();
		String d2 = s2.getRow(0).getCell(0).toString();
		if (d1.equals(d2)) {
			System.out.println("Date is same");
		}
		else {
			System.out.println("Date is not same");
		}
		
	}
}
