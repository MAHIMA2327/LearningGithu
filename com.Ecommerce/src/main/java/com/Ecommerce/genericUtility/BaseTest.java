package com.Ecommerce.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstant{
	
	FileUtility f = new FileUtility();
	WebDriverUtility w = new WebDriverUtility();
	public WebDriver driver;
	
	@BeforeSuite
	public void toConnectServer() {
		Reporter.log("==server started==",true);
	}
	
	@BeforeTest
	public void toConnectDatabase() {
		Reporter.log("==database connected successfully==",true);
	}
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(@Optional("chrome") String browser) {
		//String browser = f.retriveDataFromProperty(PROP_PATH,"browser");
		String url= f.retriveDataFromProperty(PROP_PATH,"url");
		switch(browser) {
		case "chrome":
		  driver=new ChromeDriver();
		break;
		case"edge":
		driver=new EdgeDriver();
		break;
		default:
			Reporter.log("==Invalid browser==",true);
		}
		Reporter.log("==" + browser + "launched successfully", true);
		w.maximizeWindow(driver);	
		w.implicitWait(driver,10);
		w.launchApplication(url,driver);
	}	
		
@AfterTest
public void toCloseDb() {
	Reporter.log("==Database closed successfully==", true);
}

 @AfterSuite
 		public void toCloseServer() {
	Reporter.log("==server closed successfully==", true);
}



			
			
	}
	
	

