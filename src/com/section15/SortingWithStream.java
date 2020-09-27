package com.section15;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on first column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture all webelements into list 
		List<WebElement> VegFruitsLists=driver.findElements(By.xpath("//tr/td[1]"));

		//Capture text of all webelements by using map method and store text using collect method into list
		List<String> OriginalList=VegFruitsLists.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort the original list
		List<String> OriginalSortedList=OriginalList.stream().sorted().collect(Collectors.toList());
	
		//Compare original list with sorted list
		Assert.assertTrue(OriginalList.equals(OriginalSortedList));
		
		//Scan the name column with getText if Beans found print price of beans
		//Here when filter method gets passed then only map and collect method executes
		List<String> Price=VegFruitsLists.stream().filter(s->s.getText().contains("Beans"))
		.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		System.out.println(Price.get(0));
	
	}
	
	private static String getPriceVeggie(WebElement s)
	{
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
