package org.utilities;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	public static WebDriver driver;
	
	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		 return driver = new ChromeDriver();
		 
		}
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	public static void implicitywait(long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		

	}
	public static void sendkeys(WebElement e,String name) {
		try{
			e.sendKeys(name);
		}
		catch (Exception ex) {
			jsSendKeys(e, name);
			ex.printStackTrace();
		}
	}
	public static void click(WebElement e) {
		try{
			e.click();
		}
		catch (Exception ex) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", e);
		}
	}
	public static void jsClick(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	public static void jsSendKeys(WebElement e,String input) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+input+"')", e);
	}
	public static String getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
		return text;
		

	}
	public static String getAttribute(WebElement e) {
		String att = e.getAttribute("value");
		System.out.println(att);
		return att;
		

	}
	public static void quit() {
		driver.quit();

	}
	
	public static void submit(WebElement e) {
		e.submit();

	}
	public static int selectByIndex(WebElement e,int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
		return index;

	}
	public static String selectByValue(	WebElement e,String value) {
		Select s1 = new Select(e);
		s1.selectByValue(value);
		return value;

	}
	public static String slectByVisible(WebElement e,String visible) {
		Select s2 = new Select(e);
		s2.selectByVisibleText(visible);
		return visible;


	}
	
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
		
	}
	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return 	title;
	}

	
	public static String getPropertyValue(String key) {
		String value=null;
		try {
			Properties pr= new Properties();
			pr.load(new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\config.properties"));
			 value = pr.get(key).toString();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

