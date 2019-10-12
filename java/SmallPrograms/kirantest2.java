package SmallPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class kirantest2 {

public String sup="";

public String[][] getExcelData() throws IOException {
	String[][] tabArray = null;
	FileInputStream fis=new FileInputStream("F://Selenium//RestAssured//TestWorkbook.xlsx");

	XSSFWorkbook Wb = new XSSFWorkbook(fis);
	String sheetname = "testdata";
//	System.out.println(sheetname);

	XSSFSheet Ws = Wb.getSheet(sheetname);
	int totalRows = Ws.getLastRowNum() + 1;
	int totalCols = Ws.getRow(0).getLastCellNum();
	tabArray = new String[totalRows][totalCols];
	for (int intRowCounter = 0; intRowCounter < totalRows; intRowCounter++) {
		for (int intColCounter = 0; intColCounter < totalCols; intColCounter++) {

			XSSFCell Cell = Ws.getRow(intRowCounter).getCell(intColCounter);

			tabArray[intRowCounter][intColCounter] = Cell.getStringCellValue();
//			System.out.print(" " + tabArray[intRowCounter][intColCounter]);
		}

//		System.out.println(" ");
	}
	return tabArray;

}
@Test
public  void test() throws IOException 
{
	kirantest2 kt2=new kirantest2();
	String [][]data=kt2.getExcelData();
		for (String[] i:data)
	{
		for (String j:i)
		{
//			System.out.print(j +" ");
			if (j.equals("K3"))
			{
				
				String ch=j;
				kirann k1=new kirann();
				k1.kirannn=ch;
				System.out.println(sup);	
			}

		}
//		System.out.println(" ");

	}
}



}