package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	
	public static void main(String[] args) {
		
		//set system properties
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murat\\Documents\\selenium dependecies\\drivers\\chromedriver.exe"); 
		
		//create driver object
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.navigate().to("http://cybertekschool.com");
		
		driver.navigate().back();
	}
	

}
