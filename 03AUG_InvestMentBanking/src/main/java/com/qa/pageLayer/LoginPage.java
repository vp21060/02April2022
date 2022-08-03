package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBaseClass;

public class LoginPage extends TestBaseClass {
	
	public LoginPage()
	{
		
		
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter email']")
	private WebElement USr_mail;
	
	public void InSerMail(String email)
	{
		USr_mail.sendKeys(email);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	private WebElement Insrt_pass;
	
	public void insertPass(String pass)
	{
		Insrt_pass.sendKeys(pass);
	}
	
	@FindBy(xpath="//div[@class='mt-3 d-grid']")
	private WebElement Logi_n;
	
	public void ClickOnLoginBt()
	{
		
		Logi_n.click();
		
	}
	
	
	
	

}
