package com.tanvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tanvi_selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		Thread.sleep(2000);
//		WebDriverWait wait=new WebDriverWait(driver,20);
		
//		WebElement e1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
//		Thread.sleep(2000);
		driver.close();
	}
}
