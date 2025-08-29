package com.Ecommerce.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseClass{
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}
		@FindBy(linkText="Log in")
		private WebElement loginLink;
		
		public WebElement getLoginLink() {
			return loginLink;
			
		}
		public WebElement getProductAddToCart(WebDriver driver,String productName)
		{
			return driver.findElement(By.xpath("//a[text()='"+productName+"']/../..//input[@value='Add To Cart']"));
			
			
			
		}
			
	}

