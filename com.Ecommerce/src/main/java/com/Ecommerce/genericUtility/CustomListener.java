package com.Ecommerce.genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class CustomListener implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
				String name=result.getMethod().getMethodName();
				TakesScreenshot ts=(TakesScreenshot) BaseTest.sdriver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				File dest=new File("./src/main/resources/screenshot/"+ name +".png");
				try {
					Files.copy(src, dest);
				}
				catch(IOException e)
				{
					//TODO Auto-generates catch block
					e.printStackTrace();
				}
				System.out.println("Screenshot taken successfully");
				
		
	}
}

	
	

}
