package com.tanvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tanvi_selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
	
		System.out.println("Title is.. "+driver.getTitle());
		System.out.println("Current URL is.. "+driver.getCurrentUrl());
	
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("Your Test HasBeen PAssed..");
		}
		else
		{
			System.out.println("Your Test HasBeen Failed..");
		}
		
		driver.close();
		//driver.quit();
		
		
	}
}
