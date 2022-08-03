package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBaseClass;

public class DashBoard extends TestBaseClass {
	
	public DashBoard() {
		
		
      PageFactory.initElements(driver, this);	
		
	}
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement Search_ComPny;
	
	public void EnterCompeny(String SearchCompny) 
	{
	
		Search_ComPny.sendKeys(SearchCompny);
			
	}
	
@FindBy(partialLinkText="AXIS")
private WebElement Move_OnWipro;

public void ClickOnWIPRO()
{
	
Actions act =new Actions(driver);
act.moveToElement(Move_OnWipro).click().build().perform();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
