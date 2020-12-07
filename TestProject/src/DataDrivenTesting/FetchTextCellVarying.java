package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchTextCellVarying {
	public static void main(String[] args) throws Exception {
		String path="D:\\Selenium\\TestProject\\User.xlsx";
		//Read
		FileInputStream fis=new FileInputStream(path);
		//open excel
		Workbook book=WorkbookFactory.create(fis);
		//open sheet
		Sheet s = book.getSheet("Sheet5");
		
		int row = s.getLastRowNum();
		
		//fetch value from excel sheet where cell count is varying in each row
		for (int i = 0; i <=row; i++) {
			Row r = s.getRow(i);
			short cell_count = r.getLastCellNum();
			for (int j = 0; j <=cell_count; j++) {
				String val = r.getCell(j).toString();
				System.out.print(val+" ");
				/*if (val.equals("INTEGER")) {
					double num = val.getNumericCellValue();
					System.out.print(num+" ");
				} else {
					String sol = val.getStringCellValue();
					System.out.print(sol+" ");
				}*/
			}
			System.out.println(" ");
		}
		
	}

}
