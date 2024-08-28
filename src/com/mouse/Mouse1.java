package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse1 {
	
String URL="https://www.easemytrip.com";
@Test
	public void M1() throws Exception
	{
	
	System.setProperty("webdriver.chrome.driver", "./Chrome_driver_jars/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(URL);
	
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Login or Signup']"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"shwlogn\"]/span[1]")).click();
	Thread.sleep(3000);
	driver.quit();
	
	}
}
