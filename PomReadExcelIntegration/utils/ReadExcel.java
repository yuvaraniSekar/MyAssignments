package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

public static String[][] receiveData(String readExcelFile) throws IOException {
	
	XSSFWorkbook wb = new XSSFWorkbook("./data/"+readExcelFile+".xlsx");
	
	XSSFSheet ws = wb.getSheetAt(0);
	
	//locate particular row
//	String stringCellValue = ws.getRow(1).getCell(1).getStringCellValue();
//	System.out.println(stringCellValue);
	//locate entire row
	int rowCount = ws.getLastRowNum();
	System.out.println(rowCount);
	//locate entire column
	short columnCount = ws.getRow(1).getLastCellNum();
	System.out.println(columnCount);
	String read[][] = new String[rowCount][columnCount];
	//entire row iteration
	for (int i = 1; i <=rowCount; i++) {
		for (int j = 0; j <columnCount; j++) {
			String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
			//System.out.println(stringCellValue2);
			read[i-1][j]= stringCellValue2;
		}
	}


wb.close();
return read;
}	


}
