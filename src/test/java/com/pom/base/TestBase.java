package com.pom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase 
{
	public static WebDriver driver;
	Properties prop=new Properties();
	
	public void openBrowser(String browsernm) throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\Automation\\NewPOM_Reg\\src\\test\\java\\com\\pom\\config\\config.properties");
		prop.load(fis);
		System.out.println("Open chrome browser");
		if(prop.getProperty("browser").equalsIgnoreCase(browsernm))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome_exe_path"));
			driver=new ChromeDriver();
			System.out.println("Chrome browser get opened successfully");
		}
		else if(prop.getProperty("browser").equalsIgnoreCase(browsernm))
		{
			System.setProperty("webdriver.ie.driver", prop.getProperty("ie_exe_path"));
			driver=new InternetExplorerDriver();
			System.out.println("Internet Explorer browser get opened successfully");
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "firefox_exe_path");
			driver=new FirefoxDriver();
			System.out.println("Firefox browser get opened successfully");
		}
	}
	
	public void applicationUrl()
	{
		TestBase.driver.get(prop.getProperty("url"));
		System.out.println("Application url get opened");
	}
	
	public void maxwindow()
	{
		TestBase.driver.manage().window().maximize();
	}
	
	public void pageloadtm()
	{
		TestBase.driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		System.out.println("Webpage loaded");
	}
	
//	public static void main(String[] args) throws FileNotFoundException 
//	{
//		TestBase tb=new TestBase();
//		tb.openBrowser("chrome");
//		tb.applicationUrl();
//		tb.maxwindow();
//		tb.pageloadtm();
//	}
}
