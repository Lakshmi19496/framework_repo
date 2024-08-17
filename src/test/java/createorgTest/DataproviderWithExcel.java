package createorgTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class DataproviderWithExcel {
	@Test(dataProvider = "sentData")
	public void sample(String name,String item) {
		System.out.println(name+"   "+item);
	}
	@DataProvider
	public Object[][] sentData() throws Throwable{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet("Sheet1").getLastRowNum();
		short cellCount = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		Object[][] obj=new Object[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				obj[i-1][j]=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
		}
		
		
		return obj;
		
	}

}
