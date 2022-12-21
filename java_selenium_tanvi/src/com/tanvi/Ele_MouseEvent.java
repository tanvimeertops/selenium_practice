package com.tanvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ele_MouseEvent 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tanvi_selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement flights=driver.findElement(By.linkText("Flights"));
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(home).build();
		a1.perform();
		Thread.sleep(2000);
		Action a2=actions.moveToElement(flights).build();
		a2.perform();
	}
}
