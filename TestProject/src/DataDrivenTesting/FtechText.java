package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FtechText {
	public static void main(String[] args) throws Exception {
		String path="D:\\Selenium\\TestProject\\User.xlsx";
		//Read
		FileInputStream file=new FileInputStream(path);
		//open Workbook
		Workbook book=WorkbookFactory.create(file);
		//open sheet
		Sheet s = book.getSheet("Sheet4");
		
		//Identify Row
		for (int i = 0; i <=1; i++) {
			Row r = s.getRow(i);
			for (int j = 0; j <=1; j++) {
				String val = r.getCell(j).toString();
				System.out.println(val+" ");
			}
			System.out.println(" ");
		}
		}
	}


