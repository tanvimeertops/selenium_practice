package com.tanvi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EleCheckBox {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tanvi_selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);
	
		driver.findElement(By.cssSelector("input[value='checkbox1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='checkbox2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='checkbox3']")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.cssSelector("input[value='checkbox"+i+"']")).click();
			Thread.sleep(2000);
		}
	
		driver.close();
	}
}

	

