
package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{

	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void unloadObjects() {
		prop=null;
	}
	
	
	public void invokeApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is opened with the correct url: "+url+" successfully");
			reportStep("The browser "+browser+" is opened with the correct url: "+url+" successfully", "pass");
		} catch (SessionNotCreatedException e) {
			//System.err.println("The browser "+browser+" is not opened due to session not created error");
			reportStep("The browser "+browser+" is not opened due to session not created error", "Fail");
		} catch (InvalidArgumentException e) {
			//System.err.println("The browser "+browser+" is not opened as url does not have http/https");
			reportStep("The browser "+browser+" is not opened as url does not have http/https", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The browser "+browser+" is not opened due to unknown error");
			reportStep("The browser "+browser+" is not opened due to unknown error", "fail");
		}
	}

	
	
	
	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with ID "+idValue+ " is entered with data value "+data);
			reportStep("The element with ID "+idValue+ " is entered with data value "+data, "Pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with ID "+idValue+" is not found in the DOM");
			reportStep("The element with ID "+idValue+" is not found in the DOM","Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with ID "+idValue+" is not visible in the application");
			reportStep("The element with ID "+idValue+" is not visible in the application","Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with ID "+idValue+" is not interacted in the application");
			reportStep("The element with ID "+idValue+" is not intetacablte in the application","Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with ID "+idValue+" is not stable in the application");
			reportStep("The element with ID "+idValue+" is not stable in the application","Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with ID "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with ID "+idValue+" is not entered with data "+data+" due to unknown error","Fail");
		}
	}

	
	// update this
	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+ " is entered with text data "+data);
			reportStep("The element with name "+nameValue+ " is entered with text data "+data, "Pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with name "+nameValue+" is not found in the application");
			reportStep("The element with name "+nameValue+" is not found in the application" , "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with name "+nameValue+" is not interacted in the applciation");
			reportStep("The element with name "+nameValue+" is not interacted in the applciation", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with name "+nameValue+" is not Stable in the DOM");
			reportStep("The element with name "+nameValue+" is not Stable in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "Fail");
		} 
	}

	
	
	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+ " is entered with data "+data);
			reportStep("The element with xpath "+xpathValue+ " is entered with data "+data, "Pass");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not found in the applciation");
			reportStep("The element with xpath "+xpathValue+" is not found in the applciation", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not interacted in the applciation");
			reportStep("The element with xpath "+xpathValue+" is not interacted in the applciation", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not Stable in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not Stable in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "Fail");
		} 
	}

	public void verifyTitle(String title) {
		String actualTitle = null;
		try {
			actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("Your page title Is : "+title);
				reportStep("Your page title Is : "+title, "Pass");
			}else {
				//System.err.println("Your page title Is not found : "+title);
				reportStep("Your page title Is not found : "+title, "Fail");
				
			}
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with title "+title+" is not Stable in the DOM");
			reportStep("The element with title "+title+" is not Stable in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with title "+title+" is existing element in DOM has a feature set as hidden");
			reportStep("The element with title "+title+" is existing element in DOM has a feature set as hidden", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with title "+title+" is not interacted in the DOM");
			reportStep("The element with title "+title+" is not interacted in the DOM", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with title "+title+" is not found in the applciation");
			reportStep("The element with title "+title+" is not found in the applciation", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with title "+title+" is not entered with data "+actualTitle+" due to unknown error");
			reportStep("The element with title "+title+" is not entered with data "+actualTitle+" due to unknown error", "Fail");
		} 
	}

	

	
	public void verifyTextById(String id, String text) {
	
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with ID "+id+" is holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with ID "+id+" is holding the text "+actualText+" is matched with expected text "+text, "Pass");
				
			} else {
				//System.err.println("The element with ID "+id+" is holding the text "+actualText+" is not machted with expected text "+text);
				reportStep("The element with ID "+id+" is holding the text "+actualText+" is not machted with expected text "+text, "Fail");
				
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The element with ID "+id+" is not found in the DOM");
			reportStep("The element with ID "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with ID "+id+" is not visible in the application");
			reportStep("The element with ID "+id+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with ID "+id+" is not interacted in the application");
			reportStep("The element with ID "+id+" is not interacted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with ID "+id+" is not Stable in the DOM");
			reportStep("The element with ID "+id+" is not Stable in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with ID "+id+" is not entered with data "+text+" due to unknown error");
			reportStep("The element with ID "+id+" is not entered with data "+text+" due to unknown error", "Fail");
	
		}
	}
	
	

	
	public void verifyTextByXpath(String xpath, String text) {
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			System.out.println(actualText);
			if (actualText.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is matched with expected text: "+text, "Pass");
				
			} else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not machted with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is not machted with expected text: "+text, "Fail");
				
			}
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the DOM");
			reportStep("The element with xpath "+xpath+" is not visible in the DOM", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interacted in the application");
			reportStep("The element with xpath "+xpath+" is not interacted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not Stable in the DOM");
			reportStep("The element with xpath "+xpath+" is not Stable in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" is not entered with data "+text+" due to unknown error");
			reportStep("The element with xpath "+xpath+" is not entered with data "+text+" due to unknown error", "Fail");
	
		}	
	}

	
	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			System.out.println(actualText);
			if (actualText.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" is contains the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is contains the text "+actualText+" is matched with expected text "+text, "Pass");
				
			} else {
				//System.err.println("The element with xpath "+xpath+" is contains the text "+actualText+" is not machted with expected text "+text);
				reportStep("The element with xpath "+xpath+" is contains the text "+actualText+" is not machted with expected text "+text, "Fail");
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the DOM");
			reportStep("The element with xpath "+xpath+" is not visible in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interacted in the application");
			reportStep("The element with xpath "+xpath+" is not interacted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not Stable in the DOM");
			reportStep("The element with xpath "+xpath+" is not Stable in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" is not entered with data "+text+" due to unknown error");
			reportStep("The element with xpath "+xpath+" is not entered with data "+text+" due to unknown error", "Fail");
	
		}
	}

	

	
	public void clickById(String id) {

		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked");
			reportStep("The element with id "+id+" is clicked", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The element with ID "+id+" is not found in the DOM");
			reportStep("The element with ID "+id+" is not found in the DOM", "Fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with ID "+id+" is not Clickable in the application");
			reportStep("The element with ID "+id+" is not Clickable in the application", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with ID "+id+" is not visible in the DOM");
			reportStep("The element with ID "+id+" is not visible in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with ID "+id+" is not interacted in the application");
			reportStep("The element with ID "+id+" is not interacted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with ID "+id+" is not Stable in the DOM");
			reportStep("The element with ID "+id+" is not Stable in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with ID "+id+" is not entered due to unknown error");
			reportStep("The element with ID "+id+" is not entered due to unknown error", "Fail");
		
		}
	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with class name "+classVal+" is Clicked");
			reportStep("The element with class name "+classVal+" is Clicked", "Pass");
		
		} catch (ElementClickInterceptedException e) {
			//System.out.println("Click on the page with Class Name "+classVal+"is clicked");
			reportStep("Click on the page with Class Name "+classVal+"is clicked", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with Class Name "+classVal+" is not visable in the DOM");
			reportStep("The element with Class Name "+classVal+" is not visable in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with Class Name "+classVal+" is not Intertactabel in the application");
			reportStep("The element with Class Name "+classVal+" is not Intertactabel in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with Class Name "+classVal+" is not found in the DOM");
			reportStep("The element with Class Name "+classVal+" is not found in the DOM", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with Class Name "+classVal+" is not found in the Application");
			reportStep("The element with Class Name "+classVal+" is not found in the Application", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with Class Name "+classVal+" is not found due to unknown error");
			reportStep("The element with Class Name "+classVal+" is not found due to unknown error", "Fail");
		
		}
	}
	
	public void clickByName(String name) {
		try {
			driver.findElementByName(name).click();
			//System.out.println("Click on the page with Name "+name+ " is clicked");
			reportStep("Click on the page with Name "+name+ " is clicked", "Pass");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with name "+name+" is not appears in the DOM");
			reportStep("The element with name "+name+" is not appears in the DOM", "Fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with name "+name+" is obscured  in the application");
			reportStep("The element with name "+name+" is obscured  in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with Class Name "+name+" is not interacted in the application");
			reportStep("The element with Class Name "+name+" is not interacted in the application", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with name "+name+" is not found due to unknown error");
			reportStep("The element with name "+name+" is not found due to unknown error", "Fail");
		
		}
	}
	
	public void clickByLink(String name) {
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link text "+name+" is clicked");
			reportStep("The element with link text "+name+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with link text "+name+" is not found in the DOM");
			reportStep("The element with link text "+name+" is not found in the DOM", "Fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with link text "+name+" is obscured  in the application");
			reportStep("The element with link text "+name+" is obscured  in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with link text "+name+" is not interacted in the application");
			reportStep("The element with link text "+name+" is not interacted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with link text "+name+" is not found in the Application");
			reportStep("The element with link text "+name+" is not found in the Application", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with link text "+name+" is not found due to unknown error");
			reportStep("The element with link text "+name+" is not found due to unknown error", "Fail");
		
		}
	}
	
	public void clickByLinkNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element on the page "+name+ " is clicked");
			reportStep("The element on the page "+name+ " is clicked", "Pass");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with link name "+name+" is not selectable in the application");
			reportStep("The element with link name "+name+" is not selectable in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with link name "+name+" is not found in the DOM");
			reportStep("The element with link name "+name+" is not found in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with link Name "+name+" is not found in the Application");
			reportStep("The element with link Name "+name+" is not found in the Application", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with link name "+name+" is not found due to unknown error");
			reportStep("The element with link name "+name+" is not found due to unknown error", "Fail");
		
		}
	}	
	public void clickByXpath(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The link on page with XPath "+xpathVal+ " is clicked");
			reportStep("The link on page with XPath "+xpathVal+ " is clicked", "Pass");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with XPath "+xpathVal+" is obscured  in the application");
			reportStep("The element with XPath "+xpathVal+" is obscured  in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with XPath "+xpathVal+" is not appears in the DOM");
			reportStep("The element with XPath "+xpathVal+" is not appears in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with XPath "+xpathVal+" is not interacted in the application");
			reportStep("The element with XPath "+xpathVal+" is not interacted in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with XPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with XPath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with XPath "+xpathVal+" is not found due to unknown error");
			reportStep("The element with XPath "+xpathVal+" is not found due to unknown error", "Fail");
		
		}
	}
		
	
	public void clickByXpathNoSnap(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The link on page with XPath "+xpathVal+ " is clicked");
			reportStep("The link on page with XPath "+xpathVal+ " is clicked", "Pass");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with link XPath "+xpathVal+" is not visible in the DOM");
			reportStep("The element with link XPath "+xpathVal+" is not visible in the DOM", "Fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with link XPath "+xpathVal+" is obscured  in the application");
			reportStep("The element with link XPath "+xpathVal+" is obscured  in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with link XPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with link XPath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with link XPath "+xpathVal+" is not interacted in the application");
			reportStep("The element with link XPath "+xpathVal+" is not interacted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with link XPath "+xpathVal+" is not found in the Application");
			reportStep("The element with link XPath "+xpathVal+" is not found in the Application", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with link XPath "+xpathVal+" is not found due to unknown error");
			reportStep("The element with link XPath "+xpathVal+" is not found due to unknown error", "Fail");
		
		}
	}
	
	public String getTextById(String idVal) {
		
		String actualText = null;
		try {
			actualText = 	driver.findElementById(idVal).getText();
			//System.out.println("The element with ID "+idVal+" is holding the text: "+actualText);
			reportStep("The element with ID "+idVal+" is holding the text: "+actualText, "Pass");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with ID "+idVal+" is not visible in the DOM");
			reportStep("The element with ID "+idVal+" is not visible in the DOM", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with ID "+idVal+" is not found in the DOM");
			reportStep("The element with ID "+idVal+" is not found in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with ID "+idVal+" is not interacted in the application");
			reportStep("The element with ID "+idVal+" is not interacted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with ID "+idVal+" is not Stable in the DOM");
			reportStep("The element with ID "+idVal+" is not Stable in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with ID "+idVal+" is not entered with data due to unknown error");
			reportStep("The element with ID "+idVal+" is not entered with data due to unknown error", "Fail");
		}
		return actualText;
	}
	
	
	public String getTextByXpath(String xpathVal) {
		String actualText = null;

		try {
			actualText = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The xpath of ' "+xpathVal +" ' text is present: " +actualText);
			reportStep("The xpath of ' "+xpathVal +" ' text is present: " +actualText, "Pass");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not appears in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not appears in the DOM", "Fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not selectable in the application");
			reportStep("The element with xpath "+xpathVal+" is not selectable in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathVal+" is obscured  in the application");
			reportStep("The element with xpath "+xpathVal+" is obscured  in the application", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not entered with data due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not entered with data due to unknown error", "Fail");
		
		}
		return actualText;
	}
	

	
	public void selectVisibileTextById(String id, String value) {
		try {
			Select dropDownLists = new Select(driver.findElementById(id));
			dropDownLists.selectByValue(value);
			waitProperty(2000);
			//System.out.println("User selected Index ID "+value +" from dropdown lists" + id );
			reportStep("User selected Index ID "+value +" from dropdown lists" + id , "Pass");

		} catch (ElementNotSelectableException e) {
			//System.err.println("The element with Select ID "+id+" is not selectable in the DOM " + value);
			reportStep("The element with Select ID "+id+" is not selectable in the DOM " + value, "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with Select ID "+id+" is visible  in the application " + value);
			reportStep("The element with Select ID "+id+" is visible  in the application " + value, "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with Select ID "+id+" is not found in the DOM " + value);
			reportStep("The element with Select ID "+id+" is not found in the DOM " + value, "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with Select ID "+id+" is not entered with data due to unknown error " + value);
			reportStep("The element with Select ID "+id+" is not entered with data due to unknown error " + value, "Fail");
		
		}
	}
	
	
	public void selectIndexById(String id, int value) {
		try {
			Select dropDownLists = new Select(driver.findElementById(id));
			dropDownLists.selectByIndex(value);
			waitProperty(2000);
			//System.out.println("User selected Index ID "+value +" from dropdown lists" + id );
			reportStep("User selected Index ID "+value +" from dropdown lists" + id, "Pass" );
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with Index ID "+value+" is not appears in the DOM");
			reportStep("The element with Index ID "+value+" is not appears in the DOM", "Fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The element with Index ID "+value+" is not selectable in the application");
			reportStep("The element with Index ID "+value+" is not selectable in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with Index ID "+value+" is not found in the DOM");
			reportStep("The element with Index ID "+value+" is not found in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with Index ID "+value+" is not entered with data due to unknown error" + id);
			reportStep("The element with Index ID "+value+" is not entered with data due to unknown error" + id, "Fail");
		
		}	
	}
	
	public void selectIndexByIdStringInt(String id, String value) {
		try {
			Select dropDownLists = new Select(driver.findElementById(id));
			
			int v =Integer.parseInt(value);
			dropDownLists.selectByIndex(v);
			waitProperty(2000);
			//System.out.println("User selected Index ID "+value +" from dropdown lists" + id );
			reportStep("User selected Index ID "+value +" from dropdown lists" + id, "Pass" );
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with Index ID "+value+" is not appears in the DOM");
			reportStep("The element with Index ID "+value+" is not appears in the DOM", "Fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The element with Index ID "+value+" is not selectable in the application");
			reportStep("The element with Index ID "+value+" is not selectable in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with Index ID "+value+" is not found in the DOM");
			reportStep("The element with Index ID "+value+" is not found in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with Index ID "+value+" is not entered with data due to unknown error" + id);
			reportStep("The element with Index ID "+value+" is not entered with data due to unknown error" + id, "Fail");
		
		}	
	}
	
	public void selectIndexByXpathStringInt(String xpath, String value) {
		try {
			Select dropDownLists = new Select(driver.findElementByXPath(xpath));
			
			int v =Integer.parseInt(value);
			dropDownLists.selectByIndex(v);
			waitProperty(2000);
			//System.out.println("User selected Index ID "+value +" from dropdown lists" + id );
			reportStep("User selected Index Xpath "+value +" from dropdown lists" + xpath, "Pass" );
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with Index ID "+value+" is not appears in the DOM");
			reportStep("The element with Index Xpath "+value+" is not appears in the DOM "+ xpath, "Fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The element with Index ID "+value+" is not selectable in the application");
			reportStep("The element with Index Xpath "+value+" is not selectable in the application " + xpath, "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with Index ID "+value+" is not found in the DOM");
			reportStep("The element with Index Xpath "+value+" is not found in the DOM "+ xpath, "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with Index ID "+value+" is not entered with data due to unknown error" + id);
			reportStep("The element with Index Xpath "+value+" is not entered with data due to unknown error" + xpath, "Fail");
		
		}	
	}
	
	public void selectValueTextByXpath(String xpath, String value) {
		try {
			Select dropDownLists = new Select(driver.findElementByXPath(xpath));
			dropDownLists.selectByValue(value);
			waitProperty(4000);
			//System.out.println("User selected Text value xpath "+value +" from dropdown lists" + xpath );
			reportStep("User selected Text value xpath "+xpath +" from dropdown lists " + value, "Pass" );
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with Text value xpath "+value+" is not appears in the DOM");
			reportStep("The element with Text value xpath "+xpath+" is not appears in the DOM "+ value, "Fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The element with Text value xpath "+value+" is not selectable in the application");
			reportStep("The element with Text value xpath "+xpath+" is not selectable in the application "+ value, "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with Text value xpath "+value+" is not found in the DOM");
			reportStep("The element with Text value xpath "+xpath+" is not found in the DOM "+ value, "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with Text value xpath "+value+" is not entered with data due to unknown error" + xpath);
			reportStep("The element with Text value xpath "+xpath+" is not entered with data due to unknown error " +  value, "Fail");
		
		}	
		
	}
	public void selectIndexByXpath(String xpath, int value) {
		try {
			Select dropDownLists = new Select(driver.findElementByXPath(xpath));
			dropDownLists.selectByIndex(value);
			waitProperty(2000);
			//System.out.println("User selected Index xpath "+value +" from dropdown lists" + xpath );
			reportStep("User selected Index xpath "+xpath +" from dropdown lists " + value , "Pass");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with Index xpath "+value+" is not appears in the DOM");
			reportStep("The element with Index xpath "+xpath+" is not appears in the DOM " + value, "Fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The element with Index xpath "+value+" is not selectable in the application");
			reportStep("The element with Index xpath "+xpath+" is not selectable in the application "+ value, "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with Index xpath "+value+" is not found in the DOM");
			reportStep("The element with Index xpath "+xpath+" is not found in the DOM "+ value, "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with Index xpath "+value+" is not entered with data due to unknown error" + xpath);
			reportStep("The element with Index xpath "+xpath+" is not entered with data due to unknown error " + value, "Fail");
		
		}	
	}
	public void switchToParentWindow() {
		try {
			Set<String> parentWindow = driver.getWindowHandles();
		
				for(String eachId : parentWindow) {
				driver.switchTo().window(eachId);
				//System.out.println("The browser is switch to Parent Window");
				reportStep("The browser is switch to Parent Window", "Pass");
				break;
				
			   }
		} catch (NoSuchWindowException e) {
			//System.err.println("Window with title not found");
			reportStep("Window with title not found", "Fail");
		} catch (SessionNotCreatedException e) {
			//System.err.println("The session can not be crated");	
			reportStep("The session can not be crated", "Fail");	
		} catch (WebDriverException e) {
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error ", "Fail");	
		
		}
	}

	public void switchToLastWindow() {
		Set<String> allWindowLast = driver.getWindowHandles();
		
		try {
			for(String eachId : allWindowLast) {
			driver.switchTo().window(eachId);
			//System.out.println("The browser is switch to last Window");
			reportStep("The browser is switch to last Window", "Pass");
		   }
		} catch (NoSuchWindowException e) {
			// System.out.println("  Failed to close " + allWindowLast + " : " );
			reportStep("  Failed to close " + allWindowLast + " : " , "Fail");
		} catch (SessionNotCreatedException e) {
			//System.err.println("The session can not be crated");	
			reportStep("The session can not be crated", "Fail");	
		} catch (WebDriverException e) {
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error", "Fail");
	
		} 
	}
		  
	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			//System.out.println("Alert is not present");
			reportStep("Alert is not present", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error", "Fail");
		
		} 
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			
		} catch (NoAlertPresentException e) {
			//System.out.println("Alert is not present");
			reportStep("Alert is not present", "Fail");
		}  catch (WebDriverException e) {
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error", "Fail");
		
		}
	}

	public String getAlertText() {
		String alertText=null;
		try {
			 alertText=  driver.switchTo().alert().getText();
			 //System.out.println(" The alert is  " + alertText);
			 reportStep(" The alert is  " + alertText, "Pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("No alert is present");
			reportStep("No alert is present", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error", "Fail");
		
		}
		return alertText;
	}

	public long takeSnap() {
	
		long number = 0;
		
		try {		
	
		number = (long) (Math.floor(Math.random()*100000000)+100000);
			
		File tmp = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./reports/screenshots/"+number+".png");
		FileUtils.copyFile(tmp, dest);
		
		} catch (IOException e) {
			//System.err.println("IOException snap is " + e.getMessage());
			reportStep("IOException snap is " + e.getMessage(), "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error", "Fail");
		}
		
		return number;
	}
	
	public void closeBrowser() {
		try {
			driver.close();
			//System.out.println("Browser is closed successfully", false);
			reportStep("Browser is closed successfully", "Pass", false);
		} catch (WebDriverException e) {
			//System.err.println("The browser is not closed due to unknown error");	
			reportStep("The browser is not closed due to unknown error", "Fail");	
		} 
		}
	public void closeAllBrowsers() {
		try {
			driver.quit();
			//System.out.println("All Browsers are closed successfully");
			reportStep("All Browsers are closed successfully", "Pass", false);
		} catch (WebDriverException e) {
			//System.err.println("The browsers are not closed due to unknown error");
			reportStep("The browsers are not closed due to unknown error", "Fail", false);
		} 
	}

	public void waitProperty(long time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void pageDown() {
		
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void selectVisibileTextByName(String name, String value) {
		try {
			Select dropDownLists = new Select(driver.findElementByName(name));
			dropDownLists.selectByValue(value);
			//System.out.println("User selected "+name +" from dropdown lists " + value );
			reportStep("User selected "+name +" from dropdown lists " + value, "Pass" );
		} catch (ElementNotSelectableException e) {
			//System.err.println("The element with Select ID "+name+" is not selectable in the DOM " + value);
			reportStep("The element with Select ID "+name+" is not selectable in the DOM " + value, "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with Select ID "+name+" is visible  in the application " + value);
			reportStep("The element with Select ID "+name+" is visible  in the application " + value, "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with Select ID "+name+" is not found in the DOM " + value);
			reportStep("The element with Select ID "+name+" is not found in the DOM " + value, "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with Select ID "+name+" is not entered with data due to unknown error " + value);
			reportStep("The element with Select ID "+name+" is not entered with data due to unknown error " + value, "Fail");
		
		}
		
	}

	public void mouseHoverByXpath(String xpath) {
		try {
			Actions builder = new Actions(driver);
			WebElement mouseHover = driver.findElementByXPath(xpath);
			builder.moveToElement(mouseHover).perform();
			//System.out.println("User selected mouse hover xpath "+xpath  );
			reportStep("User selected mouse hover xpath "+xpath , "Pass" );
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with mouse hover value xpath "+xpath+" is not appears in the DOM");
			reportStep("The element with mouse hover value xpath "+xpath+" is not appears in the DOM", "Fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The element with mouse hover value xpath "+xpath+" is not selectable in the application");
			reportStep("The element with mouse hover value xpath "+xpath+" is not selectable in the application", "Fail");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with mouse hover value xpath "+xpath+" is not found in the DOM");
			reportStep("The element with mouse hover value xpath "+xpath+" is not found in the DOM", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with mouse hover value xpath "+xpath+" is not entered with data due to unknown error");
			reportStep("The element with mouse hover value xpath "+xpath+" is not entered with data due to unknown error", "Fail");
		}		
	}


	



}
