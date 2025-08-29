package com.Ecommerce.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {
		
	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
		
		@FindBy(id="Email")
		private WebElement EmailTextField;
		
		@FindBy(id="Password")
		private WebElement passwordTextField;
		
		@FindBy(xpath="//input[@value='Log in']")	
		private WebElement loginbutton;
		
		
		public void login(String email,String password) {
			
			EmailTextField.sendKeys(email);
			passwordTextField.sendKeys(password);
			
			loginbutton.click();
		}	
}
	


