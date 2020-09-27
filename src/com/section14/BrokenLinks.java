package com.section14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 //Step 1 is to get all urls tied up to the links using Selenium
		//Java methods will call URL's and gets you the status code
		//if status code >400 then that url is not working-> link which tied to url is broken link
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert a =new SoftAssert();
		//For Soft Assert we have to import TESTNG jar
		//Soft assertion do not stops the execution like Hard Asertion when assertion fails
		for(WebElement link:links)
		{
			
			   String url= link.getAttribute("href");
			   
			 //we are opening urls with the help of java methods
			 HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			//In above statement openConnection is method of URL class and
			//new URL(url) is a way of writing object and here it is used to call method 'openConnection'
			//parameter url is passed to URL class constructor which we have to open
			//(HttpURLConnection) written in front of new keyword is nothing but type casting
			//It is converting URL class object into HttpURLConnection object
			
			 conn.setRequestMethod("HEAD");//type of connection you want to made
			 //There are many HTTP request methods amongs which HEAD is there so we passed it in above method
			 
			 conn.connect();
			 //This connects to URL 
			 
			 
			 int respCode = conn.getResponseCode();
			 //Gives the status code
			 
			 System.out.println(respCode);
			  a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
			  //if respcode<400 fails the msg in double quotes prints after complete execution of code with the help of
			  //method a.assertAll(); 
		}

		a.assertAll();
	}

}
