package com.tanvi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tanvi_selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("rahuljava");
		//Thread.sleep(2000);
		
		driver.findElement(By.name("btnK")).click();
		//Thread.sleep(2000);
		
		driver.close();
	}
}
