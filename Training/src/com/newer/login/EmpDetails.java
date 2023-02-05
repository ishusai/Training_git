package com.newer.login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EmpDetails {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Iswarya\\Desktop\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://leafground.com/window.xhtml;jsessionid=node01kxx478dvfdi3voq5vccrmlst84864.node0");
	    String one= driver.getWindowHandle();
        WebElement open =driver.findElement(By.xpath("//*[text()='Open']"));
        open.click();  
      driver.close();
       driver.switchTo().window(one);
        WebElement multiple =driver.findElement(By.xpath("//*[text()='Open Multiple']"));
	       multiple.click();
	      int Size=driver.getWindowHandles().size();
	      System.out.println("windows opened:"+ Size);
	      
	      
	     
         WebElement cw =driver.findElement(By.xpath("//*[text()='Close Windows']"));
         cw.click();
       Set <String> handles=driver.getWindowHandles();
         for (String allwindows : handles) {
 			if(!allwindows.equals(one)) {
 				driver.switchTo().window(allwindows);
 				driver.close();
 				driver.switchTo().defaultContent();
 			}	
 		
}
	}
}
	
