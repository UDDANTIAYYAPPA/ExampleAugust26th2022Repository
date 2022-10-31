package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionNo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		tutorials();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ECLIPSTOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.w3schools.com/");
			Thread.sleep(500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void tutorials()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"navbtn_tutorials\"]")).click();
			Thread.sleep(500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
