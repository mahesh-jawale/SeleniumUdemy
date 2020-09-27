package com.section13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("pun");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ENTER);

	}

}
