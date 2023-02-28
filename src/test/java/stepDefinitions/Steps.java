package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Search;

public class Steps extends BaseClass {
	
	@Before 
	public void setup() throws IOException{
		
		configProp = new Properties();
		FileInputStream configPropfile= new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		Logger = Logger.getLogger("youtube"); //added logger
		PropertyConfigurator.configure("log4j.properties"); //added logger
	
		String br = configProp.getProperty("browser");

	
		if (br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
		driver = new ChromeDriver();
		
		}
		
		else if (br.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
		driver = new FirefoxDriver();
		}
		else if (br.equals("edgepath"))
		{
		System.setProperty("webdriver.edge.driver",configProp.getProperty("edgepath"));
		driver = new EdgeDriver();
		}
		
		Logger.info("********Launching Browser***********");
		
		
	
	}
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	     
		search = new Search(driver);
	}

	@Then("User opens URL {string}")
	public void user_opens_url(String url) {
		Logger.info("**********Opening URL*************");
		driver.get(url);
	}

	@When("User click on search bar")
	public void user_click_on_search_bar() {
		Logger.info("********clicking on searchbar**********");
	    search.clickonsearchbar();
	}
	

	@When("enter the keywords {string}")
	public void enter_the_keywords(String keyword) {
	 Logger.info("********* Entering keyword*********");
	 search.Enterkeyword(keyword);
	}

	@Then("click on the search button")
	public void click_on_the_search_button() {
		Logger.info("********clicking on search button ***********");

		search.Clickonsearchbutton();
	}

	@Then("play the first vedio")
	public void play_the_first_vedio() {
	   
	}

	@Then("hit like button")
	public void hit_like_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
