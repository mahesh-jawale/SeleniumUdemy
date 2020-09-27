package com.section14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
		
		//Global Profile
		DesiredCapabilities dc=new DesiredCapabilities();
		
		//First way to handle SSL certificate
		dc.setAcceptInsecureCerts(true);
		
		//Second way to handle SSL Certificate 
		//dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Local profile based on browser used
		ChromeOptions coptions=new ChromeOptions();
		coptions.merge(dc);
		
		WebDriver driver=new ChromeDriver(coptions);
		driver.get("https://expired.badssl.com/");
		
		
	}

}
