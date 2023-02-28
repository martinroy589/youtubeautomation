package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import pageObjects.Search;

public class BaseClass {
 
		public WebDriver driver;
		public Search search;
		public static org.apache.log4j.Logger Logger;
		public Properties configProp;
}
