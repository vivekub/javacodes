package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {
//As an end user I should be able to search any text from www.google.com page//

	
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Desktop\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("https://www.google.com");//Go to web page
	
		
		WebElement searchbox= driver.findElementByName("q");
		
		searchbox.sendKeys("W3 schools");
		
		searchbox.sendKeys(Keys.ENTER);
		
		WebElement click=driver.findElementByName("btnK");
		
		
		click.click();
		
		
		
	
		
		
		
		}
		
}