package com.section14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookiesAndMaxWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//How to delete cookies, Specific cookie, Maximize windows
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize window of browser
		driver.manage().window().maximize();
		
		//Deletes all cookies of browser
		driver.manage().deleteAllCookies();
		
		//Deletes specified cookie
		//driver.manage().deleteCookieNamed("dd");
		
		driver.get("https://www.javatpoint.com/");
		
		
	}

}
