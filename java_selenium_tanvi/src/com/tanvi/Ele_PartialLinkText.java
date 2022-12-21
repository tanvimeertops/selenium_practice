package com.tanvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tanvi_selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("file:///C:\\Users\\tops technologies\\eclipse-workspace\\selenium_tanvi\\java_selenium_tanvi\\src\\com\\html\\index.html");
		Thread.sleep(3000);
	
//		driver.findElement(By.partialLinkText("Click")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		Thread.sleep(2000);
		//driver.close();
	}
}
