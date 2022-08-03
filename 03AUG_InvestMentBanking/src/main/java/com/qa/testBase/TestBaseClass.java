package com.qa.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.DashBoard;
import com.qa.pageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	
	public static WebDriver driver;
	public LoginPage Login;
	public DashBoard Dash;
	
	
	
	@BeforeMethod 
	public void setUp() throws InterruptedException
	{
		String br = "chrome";              
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("firefox"))	
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("Please provide proper browser name from chrome, firefox, edge");
		}
	
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		Login=new LoginPage();
		Dash=new DashBoard();
		
		
		
		
		
	}


	@AfterMethod
	public void tearDown1()
	{
		driver.close();
	}
	

		
	}
