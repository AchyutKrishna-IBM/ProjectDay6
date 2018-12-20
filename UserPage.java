package com.ibm.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UserPage 
{
	
WebDriver driver;
WebDriverWait wait;
@FindBy(id="search-box")
WebElement searchProductEle;
@FindBy(xpath="//*[@id='searchproducts-div']/a")
public List<WebElement>clickSearchedProduct;

public UserPage(WebDriver driver,WebDriverWait wait)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
	this.wait=wait;
}
public void searchDeletedProduct(String dlp)
{
	Actions actions=new Actions(driver);
	actions.moveToElement(searchProductEle).click().sendKeys(dlp).build().perform();
}
public void checkDelProd()
{
	if(clickSearchedProduct.size()==0);
	{
		System.out.println("Product is not present in the user page");
	}
}

}
