package com.ibm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminPage{
	WebDriver driver;
	WebDriverWait wait;
   @FindBy(xpath="//*[@id='side-menu']/li[2]/a")
   WebElement catalogEle;
   @FindBy(xpath="//*[@id='side-menu']/li[2]/ul/li[4]/a")
   WebElement productsEle;
   @FindBy(xpath="//input[@type='search']")
   WebElement searchProductEle;
   @FindBy(xpath="//*[@id='dataTableExample2']/tbody/tr/td[9]/div/button")
   WebElement actionEle;
   @FindBy(xpath="//*[@id='dataTableExample2']/tbody/tr/td[9]/div/ul/li[2]/a")
   WebElement deleteEle;
   @FindBy(xpath="/html/body/div[4]/div[7]/div/button")
   WebElement confDeleteEle;
   @FindBy(xpath="//table[@id='dataTableExample2']/tbody/tr/td")
   WebElement deletedProductSearch;
   @FindBy(xpath="//*[@id='wrapper']/nav/div[2]/ul/li/a")
   WebElement logOutEle;
	public AdminPage(WebDriver driver,WebDriverWait wait)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wait=wait;
	}
	public void clckOnCatalog()
	{
		catalogEle.click();
	}
	public void clickOnProducts()
	{
		productsEle.click();
	}
	public void searchProductToBeDeleted(String prd)
	{
		searchProductEle.sendKeys(prd);
	}
	public void clickOnAction()
	{
		actionEle.click();
	}
	public void selectDelete()
	{
		deleteEle.click();
	}
	public void clickOnConfirmDelete()
	{
		confDeleteEle.click();
	}
	public void searchDeletedProduct(String dprd)
	{
		searchProductEle.sendKeys(dprd);
	}
	public void verifyDeletedProduct(String noRecFound)
	{
		Assert.assertTrue(deletedProductSearch.getText().trim().equals(noRecFound));//verify that product has been deleted from the list.
	}
	public void clickOnLogOut()
	{
		logOutEle.click();
	}
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
