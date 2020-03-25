package excel
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

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

class LoginSteps {

	
	@Given('The Login page is loaded successfully')
	def The_Login_page_is_loaded_successfully() {

		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Login Page/The Login page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I login the system with valid "(.*)" username and "(.*)" password')
	def I_login_the_system_with_valid_username_password(String username, String password) {
		Excel obj=new Excel();
		int result = Integer.parseInt(username);
		List<Map<String,String>> data=obj.getDataMap();
		Map<String,String> map=data.get(result);
		
		System.out.println("Test Case = SendKeys "+map.get("User"));

		KeywordUtil.logInfo("The Name is"+map.get("User"))
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Login Page/Login with username and password'), [('username') : map.get("User")
			, ('password') : password], FailureHandling.STOP_ON_FAILURE)
	}


}