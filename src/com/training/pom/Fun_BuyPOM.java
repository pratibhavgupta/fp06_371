package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Fun_BuyPOM {

	private WebDriver driver;
	
	public Fun_BuyPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@href=\"/plans?redirectUri=%2F&svodJourney=topNav\"]")
	private WebElement ADD_FREE;
	
	@FindBy(xpath="//div[contains(text(),'Buy Now')]")
	private WebElement Buy_Button;
	
	@FindBy(xpath="//div[@class=\"head-title\"]")
	private WebElement Title;
	
	
	public void MX_67() {
		System.out.println("To validate the Buy Now Button is present on the GO-ADDFREE page");
	
		this.ADD_FREE.click();
		
		this.Buy_Button.click();
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertTrue(this.Title.isDisplayed());
		soft.assertAll();
		
		System.out.println("We are able to access the Buy Now Button");
	}
}
