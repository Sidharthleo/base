package com.adactin.base;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public static WebDriver driver;
	
		
	public static WebDriver getBrower(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+("\\driver\\chromedriver.fake.96.exe"));
			
			     driver =new ChromeDriver();
			    
			}
			else if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir")+("\\driver\\msedgedriver.exe"));
				
				driver =new EdgeDriver();
				
				
		}
			} catch (Exception e) {

		  e.printStackTrace();
		  
		}
		
		driver.manage().window().maximize();
	return driver;
		}
	public static void getUrl(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
 		
	}

}
