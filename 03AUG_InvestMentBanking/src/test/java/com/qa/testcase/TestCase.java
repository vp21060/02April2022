package com.qa.testcase;

import org.testng.annotations.Test;

import com.qa.testBase.TestBaseClass;

public class TestCase extends TestBaseClass{
	
	@Test
	public void LoginPage() throws InterruptedException
	{
		
		
		Login.InSerMail("vp21060@gmail.com");
		Login.insertPass("vilas@1995");
		Login.ClickOnLoginBt();
		Thread.sleep(5000);
		Dash.EnterCompeny("Wipro");
		Thread.sleep(1000);
		Dash.ClickOnWIPRO();
	
		
;
		
	}
	
	
	
	
	
	

}
