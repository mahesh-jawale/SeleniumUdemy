package com.section15;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Automating Pagination Scenarios to search the data using do while loop
	
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on first column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<String> Price;
	
		
		//Scan the name column with getText if required item found print price of item using Pagination
		//Here when filter method gets passed then only map and collect method executes
		//When filter method do not get the arugument which is passed in contains method,
		//null will get stored in the s then in map method getPriceVeggie will not invoke
		//because s contains null and collect will not return anything so Price variable became empty
		do
		{
		//Capture all webelements into list 
		//This is to be done for every iteration because every time you have to grap fresh list	
		List<WebElement> VegFruitsLists=driver.findElements(By.xpath("//tr/td[1]"));
		
		Price=VegFruitsLists.stream().filter(s->s.getText().contains("Rice"))
		.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		Price.forEach(a->System.out.println(a));
		
		if(Price.size()<1)
		{
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		
		}while(Price.size()<1);
		
	}
	private static String getPriceVeggie(WebElement s)
	{
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
	
}
