package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SnapDealPage 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	WebElement SignIn;
	public WebElement getCreateSignIn()
	{
		return SignIn;
	}
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[1]")
	
	
	WebElement CreateAccount;
	public WebElement getCreateAccount()
	{
		return CreateAccount;
	}
	@FindBy(xpath="//*[@id=\"inputValEnter\"]")
	WebElement Search;
	public WebElement getSearch()
	{
		return Search;
	}
	@FindBy(xpath="//*[@id=\"checkUser\"]")
	WebElement Continue;
	public WebElement getContinue()
	{
		return Continue;
	}
	@FindBy (xpath="//*[@id=\"inputValEnter\"]")
	WebElement products;
	public WebElement getProducts()
	{
		return products;
	}
	@FindBy (xpath="//*[@id=\"content_wrapper\"]/div[7]/div[5]/div[3]/div[2]/div/div[2]/input")
	WebElement Selected;
	public WebElement getSelection()
	{
		return Selected;
	}
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span")
	WebElement Searching;
	public WebElement getsearching()
	{
		return Searching;
	}
	@FindBy(xpath="//*[@id=\"content_wrapper\"]/div[7]/div[5]/div[3]/div[2]/div/div[2]/input")
	WebElement PinCode;
	public WebElement getPinCode()
	{
		return PinCode;
	}
	@FindBy(xpath="//*[@id=\"content_wrapper\"]/div[7]/div[5]/div[3]/div[2]/div/div[2]/button")
	WebElement Check;
	public WebElement getCheck()
	{
		return Check;
	}
	@FindBy(xpath="//*[@id=\"682371075796\"]/div[2]/a/picture/img")
	WebElement SelectItem;
	public WebElement getSelectItem()
	{
		return SelectItem;
	}
	@FindBy(xpath="//*[@id=\"add-cart-button-id\"]/spans")
	WebElement ItemAddedToCart;
	public WebElement getItemAddedToCart()
	{
		return ItemAddedToCart;
	}
	
	
	public  SnapDealPage(WebDriver driver)
	{
		 {
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		 }
		
	}

}
