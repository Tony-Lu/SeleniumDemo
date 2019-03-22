package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		//super();
		
		try {
//			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {

		//getRowCount();
//		getCellDataString(0, 0);
//		getCellDataNumeric(1, 1);
	}

	public static int getRowCount() {
		
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows is: " + rowCount);
		return rowCount;
	}
	
	public static int getColCount() {
		
		int colCount = 0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of columns is: " + colCount);
		return colCount;
	}

	public static String getCellDataString(int rowNum, int colNum) {
		
		String cellData = null;
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellData);
		return cellData;
	}
	
	public static void getCellDataNumeric(int rowNum, int colNum) {
		
		//double cellData = (Double) null;
		double cellData1 = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();			
		//System.out.println(cellData1);
		//return cellData1;
	}
	
		
	

}


