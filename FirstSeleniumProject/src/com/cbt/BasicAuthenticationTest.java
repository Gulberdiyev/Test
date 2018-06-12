package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationTest {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\murat\\Documents\\selenium dependecies\\drivers\\chromedriver.exe"); 
		
		//create driver object
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		//findElement - -> finds element on a page
		//locator --> is a way of finding element on a page used by selenium. Locators are represented in a class called "By" in selenium.
		//by.name("username") --> how to find it
		//sendKeys() --> types on element (types username)
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		//click() --> clicks 
		
		driver.findElement(By.name("login")).click();

		
		String expected = "Find a Flight";
		String actual = driver.getTitle();
		if(actual.contains(expected)) {
			System.out.println("pass");
			
		}else {
			
			System.out.println("fail");
		}

	}
}
