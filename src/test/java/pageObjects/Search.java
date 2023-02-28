package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	
public WebDriver ldriver;
	public Search(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	
}
	   @FindBy(id="search")
	   @CacheLookup
	   WebElement searchbar;
	  
	  
	  @FindBy(id ="search-icon-legacy")
	  @CacheLookup
	  WebElement searchbutton;
	  
	   //Actions method
	  
	   public String getPageTitle()
	   {
		   return ldriver.getTitle();
	   }
	   
	   public void clickonsearchbar()
	   {
		   searchbar.click();
	   }
	   
	   
	   public void Enterkeyword(String keyword) {
		  searchbar.sendKeys(keyword);
	   }
	   
	   public void Clickonsearchbutton()
	   {
		   searchbutton.click();
	   }

	}



