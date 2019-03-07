package com.pom.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.TestBase;



public class Regipage 
{
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement objfirstname;
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement objlastname;
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	WebElement objphone;
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	WebElement objaddress;
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	WebElement objcity;
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	WebElement objstate;
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	WebElement objpcode;
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	WebElement objemail;
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	WebElement objconpsw;
	@FindBy(how=How.XPATH,using="//input[@name='register']")
	WebElement objregis;
	
	
	public void loadRegPage()
	{
		PageFactory.initElements(TestBase.driver,this);
	}
	
	public void enterfirstname(String fname)
	{
		objfirstname.sendKeys(fname);
		System.out.println("FirstName: "+fname);
	}
	public void enterLastName(String lname)
	{
		objlastname.sendKeys(lname);
		System.out.println("LastName: "+lname);
	}
	public void enterphone(String ph)
	{
		objphone.sendKeys(ph);
		System.out.println("Phone: "+ph);
	}
	public void enterusername(String uname)
	{
		objusername.sendKeys(uname);
		System.out.println("Username: "+uname);
	}
	public void enteraddress(String adr)
	{
		objaddress.sendKeys(adr);
		System.out.println("Address: "+adr);
	}
	public void entercity(String city)
	{
		objcity.sendKeys(city);
		System.out.println("City: "+city);
	}
	public void enterstate(String state)
	{
		objstate.sendKeys(state);
		System.out.println("State: "+state);
	}
	public void enterpincode(String code)
	{
		objpcode.sendKeys(code);
		System.out.println("Pincode: "+code);
	}
	public void enteremail(String email)
	{
		objemail.sendKeys(email);
		System.out.println("Email: "+email);
	}
	public void enterpassword(String password)
	{
		objpassword.sendKeys(password);
		System.out.println("Password: "+password);
	}
	public void enterconpsw(String conpsw)
	{
		objconpsw.sendKeys(conpsw);
		System.out.println("Confirm password: "+conpsw);
	}
	public void clickOnRegi()
	{
		objregis.click();
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
//		
//		Regipage lp=new Regipage();
//		lp.loadRegPage();
//		System.out.println("******************************************");
//		lp.enterfirstname("leena");
//		lp.enterLastName("jadhav");
//		lp.enterphone("123456");
//		lp.enterusername("leenaj@gmail.com");
//		lp.enteraddress("wai");
//		lp.entercity("satara");
//		lp.enterstate("maharashtra");
//		lp.enterpincode("412803");
//		lp.enteremail("leenaj");
//		lp.enterpassword("leena");
//		lp.enterconpsw("leena");
//		System.out.println("*****************************************");
//		lp.clickOnRegi();
//	}
}
