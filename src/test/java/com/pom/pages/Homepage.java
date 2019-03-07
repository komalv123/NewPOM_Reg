package com.pom.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.TestBase;

public class Homepage 
{
	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	WebElement objreg;
	
	public void loadHomePage()
	{
		PageFactory.initElements(TestBase.driver,this);
	}
	
	public void clickregister()
	{
		objreg.click();
	}
	
//	public static void main(String[] args) throws IOException 
//	{
//		TestBase tb=new TestBase();
//		tb.openBrowser("chrome");
//		tb.applicationUrl();
//		tb.maxwindow();
//		tb.pageloadtm();
//		
//		Homepage hp=new Homepage();
//		hp.loadHomePage();
//		hp.clickregister();
//	}
}
