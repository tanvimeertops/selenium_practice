package com.tanvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Name 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tanvi_selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("rahul@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("rahul123344");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		driver.close();		
	}
}
