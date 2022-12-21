package com.tanvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_DynamicXpath2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tanvi_selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("tanvi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tanvi12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(2000);
		
		
		String msg=driver.findElement(By.xpath("//label[text()='User-ID must not be blank']")).getText();
		System.out.println("Your Msg is.. "+msg);
		Thread.sleep(2000);
		driver.close();
	}
}
