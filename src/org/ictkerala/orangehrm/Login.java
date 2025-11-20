package org.ictkerala.orangehrm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {

	
	
	    public static void main(String[] args) throws Exception {

	        // Setup ChromeDriver
	 //     WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        // Open OrangeHRM
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();

	        // Enter username
	        driver.findElement(By.name("username")).sendKeys("Admin");

	        // Enter password
	        driver.findElement(By.name("password")).sendKeys("admin123");

	        // Click Login button
	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        // Wait for dashboard load
	        Thread.sleep(3000);

	        // Validate login
	        String url = driver.getCurrentUrl();

	        if (url.contains("dashboard")) {
	            System.out.println("Login SUCCESS – Test Passed");
	        } else {
	            System.out.println("Login FAILED – Test Failed");
	        }

	        // Close browser
	        driver.quit();
	    }
	}

	
	

