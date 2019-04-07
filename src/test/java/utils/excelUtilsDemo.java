package utils;

public class excelUtilsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath + "\\excel\\data.xlsx", "Sheet1");
		
		System.out.println(excel.getRowCount());
		System.out.println(excel.getColCount());
		System.out.println(excel.getCellDataString(0, 0));
		
		System.out.println(excel.getCellDataNumeric(1, 5));

	}

}
