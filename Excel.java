import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sh1;
	static XSSFRow row;
	 
	public static void main(String[] args) throws Exception {

		System.out.println(getDataMap());
		TestCase(getDataMap(),1);
	}
	
	public static void LoadExcel() throws Exception
	{
		File file=new File("C:\\Users\\Admin\\Downloads\\Cucumber-master (1)\\Cucumber-master\\src\\test\\resources\\Data_Files\\Orders.xlsx");
		fis=new FileInputStream(file);
		wb= new XSSFWorkbook(fis);
		sh1= wb.getSheet("DME_Order");
		fis.close();
		
	}
	public static void  TestCase(List<Map<String,String>> getDataMap,int index) throws Exception
	{
	//	for(Map<String,String> map:getDataMap)
		//{
		Map<String,String> map=getDataMap().get(index);
			
			//Here Goes Your Test Case - With Different Datasets-
			
			System.out.println("Test Case = SendKeys "+map.get("User"));
			
			System.out.println("Test Case = SendKeys "+map.get("Password"));
		//}
		
	}
	  public static List<Map<String,String>> getDataMap() throws Exception
	  {
		 
		  List< Map<String,String>> smap=new ArrayList<Map<String,String>>();
		  int rows =sh1.getLastRowNum();
		  row= sh1.getRow(0);
		  for(int j=1;j<row.getLastCellNum();j++)
		  {
			  Map<String,String> map=new HashMap<>();
			  for(int i=0;i<rows+1;i++)
			  {
				  Row r=CellUtil.getRow(i, sh1);
				  String key=CellUtil.getCell(r, 0).getStringCellValue();
				  String value=CellUtil.getCell(r, j).getStringCellValue();
				  map.put(key,value);
				  
			  }
			  smap.add(map);
		  }
		 
		  return smap;
		  }
	

}
