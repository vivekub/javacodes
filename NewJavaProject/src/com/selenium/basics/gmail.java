package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
//As an end user I should be able to search any text from www.gmail.com page//

	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Desktop\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("https://www.gmail.com");//Go to web page
		
		
		//WebElement email= driver.findElementByClassName("whsOnd zHQkBf");
		
		
		WebElement email= driver.findElement(By.id("identifierId"));		
		
		email.sendKeys("ubalevivek1");
		//email.click();
		
		WebElement next= driver.findElement(By.id("identifierNext"));
		next.click();
		
		Thread.sleep(5000);
		WebElement ep= driver.findElement(By.name("password"));
		
		ep.sendKeys("vivekubale");
		WebElement pnext= driver.findElement(By.id("passwordNext"));
		pnext.click();
		
		
		//ep.click();		
		
		//email.sendKeys(Keys.ENTER);
		
		//WebElement password= driver.findElement(By.className("OabDMe cXrdqd Y2Zypf"));
	    
	//	password.sendKeys("vivekubale1");
		
	//	WebElement searchbox= driver.findElementByName("q");
		
		//searchbox.sendKeys("W3 schools");
		
		//searchbox.sendKeys(Keys.ENTER);
		
		//WebElement click=driver.findElementByName("btnK");
		
		
		//click.click();//
		
		}}
		