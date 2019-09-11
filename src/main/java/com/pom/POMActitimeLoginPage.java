package com.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.AutoConstant;
import com.generics.ExcelLibrary;

public class POMActitimeLoginPage implements AutoConstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTexfield;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public POMActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 0));
		passwordTexfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 1));
		loginButton.click();		
	}
}