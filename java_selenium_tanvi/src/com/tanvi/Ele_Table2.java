package com.tanvi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Table2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tanvi_selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);
		
		List<WebElement> th= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Total heading is.. "+th.size());
		
		List<WebElement> tr= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total heading is.. "+tr.size());
		
		for(int i=1;i<=th.size();i++)
		{
			String value=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();
			System.out.print ("		"+value);
			Thread.sleep(1000);
		}
//		for(int i=1;i<=tr.size();i++)
//		{
//			String value=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]/a")).getText();
//			System.out.println("   "+value);
//			Thread.sleep(1000);
//		}
		
		for(int i=1;i<=tr.size();i++)
		{
			for(int j=1;j<=5;j++)
			{
				String value=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("		"+value);
			}
			Thread.sleep(1000);
			System.out.println();
		}
	}
}
