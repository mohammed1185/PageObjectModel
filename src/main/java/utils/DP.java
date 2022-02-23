package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DP {

	
	public static String [][] getData(String sheetName) {
		String [][] testData = new String[2][3];
		
		try {
			FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			int columCount = sheet.getRow(0).getLastCellNum();
			
			testData = new String[rowCount][columCount];
			for(int i = 1; i<= rowCount; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j<columCount; j++) {
					String cellData = row.getCell(j).getStringCellValue();
					testData[i-1][j]= cellData;
				}
			
				
			}
			
	
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

		
		return testData;
	}
	
	
}
