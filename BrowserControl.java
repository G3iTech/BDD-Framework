package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserControl extends WebConnector {
	
	@Before
	public void openBrowser() {
		
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "../BDDFramework/src/test/java/resources/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "../BDDFramework/src/test/java/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if (browserType.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "../BDDFramework/src/test/java/resources/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
	}
	
	@After
	public void closeBrowser() {
		
		driver.quit();
		
	}

}
