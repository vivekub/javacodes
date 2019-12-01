package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {
//As an end user I should be able to search any text from www.google.com page//

	
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.google.com/");
}
}