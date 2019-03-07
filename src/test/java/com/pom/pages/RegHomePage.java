package com.pom.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pom.base.TestBase;

public class RegHomePage 
{
	@FindBy(how=How.XPATH,using="//img[@src='/images/banner2.gif']")
	WebElement objreghmpg;
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objsignoff;
	
	public void loadRegHomePage()
	{
		PageFactory.initElements(TestBase.driver,this);
	}
	
	public void verifyreghmpg()
	{
		boolean act=objreghmpg.isDisplayed();
		boolean exp=true;
		Assert.assertEquals(act, exp);
		System.out.println("Register home page is displayed");
	}
	
	public void clicksignoff()
	{
		objsignoff.click();
	}
	public static void main(String[] args) throws IOException 
	{
		TestBase tb=new TestBase();
		tb.openBrowser("chrome");
		tb.applicationUrl();
		tb.maxwindow();
		tb.pageloadtm();
		
		Homepage hp=new Homepage();
		hp.loadHomePage();
		hp.clickregister();
		
		Regipage lp=new Regipage();
		lp.loadRegPage();
		System.out.println("******************************************");
		lp.enterfirstname("leena");
		lp.enterLastName("jadhav");
		lp.enterphone("123456");
		lp.enterusername("leenaj@gmail.com");
		lp.enteraddress("wai");
		lp.entercity("satara");
		lp.enterstate("maharashtra");
		lp.enterpincode("412803");
		lp.enteremail("leenaj");
		lp.enterpassword("leena");
		lp.enterconpsw("leena");
		System.out.println("*****************************************");
		lp.clickOnRegi();
		
		RegHomePage rh=new RegHomePage();
		rh.loadRegHomePage();
		rh.clicksignoff();
	}
}
