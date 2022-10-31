package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assaignment21 {
	public static WebDriver oBrowser=null;
	public static ActiTime  opage=null;
	public static void main(String[] args)
	{

		launchBrowser();
		Nagavite();
		Login();
		minimizeFlyOutWindow();
		createuser();
		DeleteUser();
		handleAlert();
		logout1();
		
	
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\WEB AUTOMATION\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage=new ActiTime(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Nagavite()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			opage.getUserName().sendKeys("admin");
			opage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			opage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try
		{
			opage.CreateUser().click();
			opage.AddUser().click();
			Thread.sleep(3000);
			opage.FirstName().sendKeys("Rakesh");
			opage.LastName().sendKeys("raki");
			opage.Emailid().sendKeys("rakeshm9628@gmail.com");
			opage.UserName().sendKeys("RAKESHM");
			opage.Password().sendKeys("raki123");
			opage.PasswordCopy().sendKeys("raki123");
			Thread.sleep(3000);
			opage.CreateUser1().click();
			Thread.sleep(2000);
			opage.Clickapplication().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try
		{
			opage.deleteuser().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void handleAlert()
	{
		try
		{
		Alert oAlert=oBrowser.switchTo().alert();
		String content=oAlert.getText();
		System.out.println(content);
		oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logout1()
	{
		try
		{
			Thread.sleep(2000);
			opage.getLogoutLink().click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
