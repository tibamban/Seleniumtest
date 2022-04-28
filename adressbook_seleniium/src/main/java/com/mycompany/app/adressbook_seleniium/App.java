package com.mycompany.app.adressbook_seleniium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","/home/ubuntu/selenium/chromedriver");
    	ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	System.out.println("Well here we are with Selenium !");
    	driver.get("http://54.89.187.59:8888/");
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	 driver.findElement(By.className("v-button")).click();
    	 driver.findElement(By.id("gwt-uid-5")).sendKeys("Duverger");
    	 driver.findElement(By.id("gwt-uid-7")).sendKeys("Pierre");
    	 driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
    	 driver.findElement(By.id("gwt-uid-11")).sendKeys("mail.com");
    	 driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
    	 driver.findElement(By.className("v-button-primary")).click();
    	 //Thread.sleep(5000);
    	 driver.quit();
    }
}
