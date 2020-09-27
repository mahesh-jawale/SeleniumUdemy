package com.section12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//1.Print the count of links on web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.Print the count of links from footer section
		WebElement footerSection=driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		System.out.println(footerSection.findElements(By.tagName("a")).size());
		
		//3.Print the count of links from first column of footer section
		WebElement columnFirst=footerSection.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(columnFirst.findElements(By.tagName("a")).size());
		
		//4.Click on each link in the column and check if pages are opening
		for(int i=1;i<columnFirst.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);//opens link in separate tab
			columnFirst.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
		//5.Print title of every page opened
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
			
		
	}

}
