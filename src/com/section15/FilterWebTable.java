package com.section15;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterWebTable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Filter the web table using java streams
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("input[id='search-field']")).sendKeys("Rice");
		
		List<WebElement> VegFruits=driver.findElements(By.xpath("//tr/td[1]"));
		//returns 1
		List<WebElement> FilteredList=VegFruits.stream().filter(VegFruit->VegFruit.getText().contains("Rice")).collect(Collectors.toList());
		//returns 1
		Assert.assertEquals(VegFruits.size(), FilteredList.size());
		
		
	}

}
