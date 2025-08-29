package com.Ecommerce.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BaseClass{
	public RegisterPage(WebDriver driver) {
		super(driver);
	} 
	public WebElement getGenderRadioButton(WebDriver driver,String gender) {	
	return driver.findElement(By.xpath("//label[text()='"+gender +"']"));
	}
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
	
	
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id="register_button")
	 WebElement registerButton;
	
	public void registration(WebDriver driver,String gender,String firstName,String lastName, String email,String password) {
	
	getGenderRadioButton(driver,gender).click();
	firstNameTextField.sendKeys(firstName);
	lastNameTextField.sendKeys(lastName);
	emailTextField.sendKeys(email);
	passwordTextField.sendKeys(password);
	confirmPasswordTextField.sendKeys(password);
	registerButton.click();
	
	
	
	
		
	}

}
