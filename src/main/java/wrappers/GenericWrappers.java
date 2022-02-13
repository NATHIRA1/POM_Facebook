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
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.ImmutableBiMap.Builder;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
	
	private static final String Fileutils = null;
	private static final CharSequence CharSequence = null;
	public  RemoteWebDriver driver;
	
	public static  Properties  prop;
	
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
	
	public void unLoadObjects() {
		
		prop=null;
	}

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				
				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				 driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				
				
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				
				 driver = new FirefoxDriver();
				
				
			}else if(browser.equalsIgnoreCase("ie")) {
				
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				
				 driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+browser+" is launched with given url "+url+"successfully");
			
			reportStep("The browser "+browser+" is launched with given url "+url+"successfully", "Pass");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			
		//	System.err.println("The browser "+browser+" is not lanched due to session not create error");
			
			reportStep("The browser "+browser+" is not lanched due to session not create error", "Fail");
			
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			
			//System.err.println("The browser "+browser+" is not launched as url doesnot contain http/https");
			
			reportStep("The browser "+browser+" is not launched as url doesnot contain http/https", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
		}
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			
			reportStep("The element with id "+idValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idValue+" is not interactable with application");
			
			reportStep("The element with id "+idValue+" is not interactable with application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element With id "+idValue+" is not entered with data "+ data +" due to unknown error");
			
			reportStep("The element With id "+idValue+" is not entered with data "+ data +" due to unknown error", "fail");
		}
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			
			//System.out.println("The element with Name "+nameValue+" is entered with data "+data);
			
			reportStep("The element with Name "+nameValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with name "+nameValue+" is not found in the DOM");
			 
			 reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
			
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with name "+nameValue+" is not interactable with application");
			
			reportStep("The element with name "+nameValue+" is not interactable with application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with name "+nameValue+" is not entered with data"+data +" due to unknown error");
			
			reportStep("The element with name "+nameValue+" is not entered with data"+data +" due to unknown error", "fail");
		}
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			
			//System.out.println("The element with Xpath "+xpathValue+" is entered data"+ data);
			
			reportStep("The element with Xpath "+xpathValue+" is entered data"+ data, "pass");
			
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with Xpath "+xpathValue+" is not found in the DOM");
			
			reportStep("The element with Xpath "+xpathValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with Xpath "+xpathValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+xpathValue+" is not interactable with application");
			reportStep("The element with Xpah "+xpathValue+" is not interactable with application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathValue+" is not stable in the application");
			
			reportStep("The element with Xpath "+xpathValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+xpathValue+"is not entered with data"+ data +" due to unknown error");
			reportStep("The element with Xpath "+xpathValue+"is not entered with data"+ data +" due to unknown error", "fail");
		}
		
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			String actualTitle = driver.getTitle();
			
			if(actualTitle.equals(title)) {
				
				//System.out.println("The tittle of the page "+actualTitle+" is matched with expected title"+ title);
				
				reportStep("The tittle of the page "+actualTitle+" is matched with expected title"+ title, "pass");
			}else {
				
				//System.err.println("The tittle of the page "+actualTitle+" is not matched with expected title"+ title);
				
				reportStep("The tittle of the page "+actualTitle+" is not matched with expected title"+ title, "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page is not verified due to unknown error");
			reportStep("The title of the page is not verified due to unknown error", "fail");
		}
			
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementById(id).getText();
			
			if(actualText.equals(text)) {
				 
				//System.out.println("The element with id "+id+" holding the text "+actualText+"is matched with expected text "+text);
				
				reportStep("The element with id "+id+" holding the text "+actualText+"is matched with expected text "+text, "pass");
			}else {
				
				//System.err.println("The element with id "+id+" holding the text "+actualText+"is not matched with expected text "+text);
				
				reportStep("The element with id "+id+" holding the text "+actualText+"is not matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not interactable with application");
			reportStep("The element with id "+id+" is not interactable with application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not verfied due to unknown error");
			
			reportStep("The element with id "+id+" is not verfied due to unknown error", "fail");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			
			if(actualText.equals(text)) {
				
				//System.out.println("The element with Xpath "+xpath+" holding the text "+actualText+" is matched with expected text "+text);
				
				reportStep("The element with Xpath "+xpath+" holding the text "+actualText+" is matched with expected text "+text,"pass");
			}else {
				
				//System.err.println("The element with Xpath "+xpath+" holding the text "+actualText+" is not matched with expected text "+text);
				
				reportStep("The element with Xpath "+xpath+" holding the text "+actualText+" is not matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in DOM ");
			
			reportStep("The element with xpath "+xpath+" is not found in DOM ", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpath+" is not interactable with the application");
			
			reportStep("The element with xpath "+xpath+" is not interactable with the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+xpath+" is not verified due to unknown error");
			
			reportStep("The element with Xpath "+xpath+" is not verified due to unknown error", "fail");
		}	
		
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			
			if(actualText.contains(text)) {
				
				//System.out.println("The element with xpath "+xpath+" holding the text "+actualText+" is partially matched with expected text "+text);
				
				reportStep("The element with xpath "+xpath+" holding the text "+actualText+" is partially matched with expected text "+text, "pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" holding the text "+actualText+" is not even partially matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualText+" is not even partially matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in DOM ");
			
			reportStep("The element with xpath "+xpath+" is not found in DOM ", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
			
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpath+" is not interactable with the application");
			
			reportStep("The element with xpath "+xpath+" is not interactable with the application", "fail");
			
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+xpath+" is not verified due to unknown error");
			
			reportStep("The element with Xpath "+xpath+" is not verified due to unknown error", "fail");
			
			
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(id).click();
			
			//System.out.println("The element with id "+id+" is clicked");
			
			reportStep("The element with id "+id+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not visible in the application");
			
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is disabled  in the application");
			
			reportStep("The element with id "+id+" is disabled  in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not stable in the application");
			
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable with the application");
			
			reportStep("The element with id "+id+" is not interactable with the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not clicked due to unknown error");
			
			reportStep("The element with id "+id+" is not clicked due to unknown error", "fail");
		}
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByClassName(classVal).click();
			
			//System.out.println("The element with ClassName "+classVal+" is clicked");
			
			reportStep("The element with ClassName "+classVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with ClassName "+classVal+" is not found in the DOM");
			
			reportStep("The element with ClassName "+classVal+" is not found in the DOM", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with ClassName  "+classVal+" is not visible in the application");
			reportStep("The element with ClassName  "+classVal+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			
			//System.err.println("The element with ClassName "+classVal+" is disabled  in the application");
			
			reportStep("The element with ClassName "+classVal+" is disabled  in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with ClassName "+classVal+" is not stable in the application");
			
			reportStep("The element with ClassName "+classVal+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not interactable with the application");
			
			reportStep("The element with ClassName "+classVal+" is not interactable with the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with ClassName "+classVal+" is not clicked due to unknown error");
			reportStep("The element with ClassName "+classVal+" is not clicked due to unknown error", "fail");
		}
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(name).click();
			
			//System.out.println("The element with Name "+name+" is clicked");
			
			reportStep("The element with Name "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with Name "+name+" is not found in the DOM");
			
			reportStep("The element with Name "+name+" is not found in the DOM", "fail");
				
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Name  "+name+" is not visible in the application");
			
			reportStep("The element with Name  "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Name "+name+" is disabled  in the application");
			reportStep("The element with Name "+name+" is disabled  in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Name "+name+" is not stable in the application");
			
			reportStep("The element with Name "+name+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+name+" is not interactable with the application");
			reportStep("The element with Name "+name+" is not interactable with the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Name "+name+" is not clicked due to unknown error");
			
			reportStep("The element with Name "+name+" is not clicked due to unknown error", "fail");
		}
		
		
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		
		
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with LinkText "+name+" is clicked");
			
			reportStep("The element with LinkText "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with LinkText "+name+" is not found in the DOM");
			
			reportStep("The element with LinkText "+name+" is not found in the DOM", "fail");

			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with LinkText  "+name+" is not visible in the application");
			
			reportStep("The element with LinkText  "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			
			//System.err.println("The element with LinkText "+name+" is disabled  in the application");
			
			reportStep("The element with LinkText "+name+" is disabled  in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with LinkText "+name+" is not stable in the application");
			reportStep("The element with LinkText "+name+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not interactable with the application");
			
			reportStep("The element with LinkText "+name+" is not interactable with the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with LinkText "+name+" is not clicked due to unknown error");
			
			reportStep("The element with LinkText "+name+" is not clicked due to unknown error", "fail");
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The element with LinkText "+name+" is clicked");
			
			reportStep("The element with LinkText "+name+" is clicked", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with LinkText "+name+" is not found in the DOM");
			
			reportStep("The element with LinkText "+name+" is not found in the DOM", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with LinkText  "+name+" is not visible in the application");
			
			reportStep("The element with LinkText  "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			
			//System.err.println("The element with LinkText "+name+" is disabled  in the application");
			
			reportStep("The element with LinkText "+name+" is disabled  in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with LinkText "+name+" is not stable in the application");
			
			reportStep("The element with LinkText "+name+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not interactable with the application");
			reportStep("The element with LinkText "+name+" is not interactable with the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with LinkText "+name+" is not clicked due to unknown error");
			
			reportStep("The element with LinkText "+name+" is not clicked due to unknown error", "fail");
		}
		
	}

	public void clickByXpath(String...xpathVal) {
		// TODO Auto-generated method stub
		
		String xpath=null;
		
		try {
			
			if(xpathVal[0].contains("$option$")) {
				
				
				xpath=xpathVal[0].replace("$option$", xpathVal[1]);
			}else {
				
				xpath=xpathVal[0];
			}
			driver.findElementByXPath(xpath).click();
			
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "pass");
			
			
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is disabled  in the application");
			
			reportStep("The element with xpath "+xpathVal+" is disabled  in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable with the application");
			
			reportStep("The element with xpath "+xpathVal+" is not interactable with the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			
			
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
		
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			
			reportStep("The element with xpath "+xpathVal+" is clicked", "pass");
			
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
			
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath  "+xpathVal+" is not visible in the application");
			
			reportStep("The element with xpath  "+xpathVal+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is disabled  in the application");
			
			reportStep("The element with xpath "+xpathVal+" is disabled  in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable with the application");
			
			reportStep("The element with xpath "+xpathVal+" is not interactable with the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		
		String actualText = null;
		
		try {
			 actualText = driver.findElementById(idVal).getText();
			
			//System.out.println("The element with id "+idVal+" contains the text "+actualText);
			
			reportStep("The element with id "+idVal+" contains the text "+actualText, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with id "+idVal+" is not found in the DOM");
			
			reportStep("The element with id "+idVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			
			reportStep("The element with id "+idVal+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idVal+" is not interactable with application");
			
			reportStep("The element with id "+idVal+" is not interactable with application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			
			
			reportStep("The element with id "+idVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			System.err.println("The element with id "+idVal+" is failed due to unknown error");
			
			
			reportStep("The element with id "+idVal+" is failed due to unknown error", "fail");
		}
		return actualText;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		String actualText = null;
		
		try {
			actualText = driver.findElementByXPath(xpathVal).getText();
			
			reportStep("The element with Xpath "+xpathVal+" get the actual text "+actualText , "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpathVal+" is not found in the DOM");
			
			reportStep("The element with Xpath "+xpathVal+" is not found in the DOM", "fail");
			
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not interactable with application");
			
			reportStep("The element with xpath "+xpathVal+" is not interactable with application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is failed due to unknown error");
			
			reportStep("The element with xpath "+xpathVal+" is failed due to unknown error", "fail");
		}
		
		
		return actualText;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement s1 =driver.findElementById(id);
			Select sel1 = new Select(s1);
			sel1.selectByVisibleText(value);
			
			//System.out.println("The element with id "+id+" is selected with visible text "+value);
			
			reportStep("The element with id "+id+" is selected with visible text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not visible in the application");
			
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not selected  text "+value+"due to id "+ id +" disabled in the application");
			
			reportStep("The element with id "+id+" is not selected  text "+value+"due to id "+ id +" disabled in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not interactable with application");
			
			reportStep("The element with id "+id+" is not interactable with application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not stable in the application ");
			
			reportStep("The element with id "+id+" is not stable in the application ", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not selected the text "+value+" due to unknown error");
			
			reportStep("The element with id "+id+" is not selected the text "+value+" due to unknown error", "fail");
		}
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement s1 =  driver.findElementById(id);
			
			Select sel1 = new Select(s1);
			
			sel1.selectByIndex(value);
			
			//System.out.println("The element with id "+id+" is selected with indexValue "+value);
			
			reportStep("The element with id "+id+" is selected with indexValue "+value, "fail");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with id "+id+" is not found in the DOM");
			
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not visible in the application");
			
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not selected  indexValue"+ value + "due to id "+ id + "disabled in the application");
			
			reportStep("The element with id "+id+" is not selected  indexValue"+ value + "due to id "+ id + "disabled in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not interactable with application");
			
			reportStep("The element with id "+id+" is not interactable with application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not stable in the application ");
			
			reportStep("The element with id "+id+" is not stable in the application ", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not selected the indexValue "+ value + "due to unknown error");
			
			reportStep("The element with id "+id+" is not selected the indexValue "+ value + "due to unknown error", "fail");
		}
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		 try {
			Set<String> s1 = driver.getWindowHandles(); 	
			 
			 for(String eachid1 : s1) {
				 
				 driver.switchTo().window(eachid1);
		
				 break;
			 }
			 
			// System.out.println("The window switched to parent window");
			 
			 reportStep("The window switched to parent window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			
			//System.err.println("With that session id no such window");
			
			reportStep("With that session id no such window", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("Window not switched to primary window due to unknown error");
			
			reportStep("Window not switched to primary window due to unknown error", "fail");
		}
		 	
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> s1 = driver.getWindowHandles(); 
						 
			 for(String eachid1 : s1) {
				 
				 driver.switchTo().window(eachid1);
	 
				 
			 }
			 //System.out.println("The window switched to last window");
			 
			 reportStep("The window switched to last window", "pass");
			 
			 
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			
			//System.err.println("With that session id no such window");
			
			reportStep("With that session id no such window", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("Window not switched to last window due to unknown error");
			
			reportStep("Window not switched to last window due to unknown error", "fail");
		}
		 
		 
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().accept();
			
			//System.out.println("alert is accepted");
			
			reportStep("alert is accepted", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No alert present for accepting");
			
			reportStep("No alert present for accepting", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			
			//System.err.println("unexpected alert opened on the applicatoion");
			
			reportStep("unexpected alert opened on the applicatoion", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("alert not accepted due to unknown error");
			
			reportStep("alert not accepted due to unknown error", "fail");
		}
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().dismiss();
			
			//System.out.println("alert is dismissed");
			
			reportStep("alert is dismissed", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("No alert present for dismissing ");
			
			reportStep("No alert present for dismissing ", "fail");
			
			
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("alert not dismissed due to unknown error");
			
			reportStep("alert not dismissed due to unknown error", "fail");
		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		
		String actualText= null;
		
		try {
			 actualText = driver.switchTo().alert().getText();
			
			//System.out.println(" The alert is holding the text "+actualText);
			
			reportStep(" The alert is holding the text "+actualText, "pass");
			
			
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No alert present for getting the text ");
			
			reportStep("No alert present for getting the text ", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("text not get from the alert due to unknown error");
			
			reportStep("text not get from the alert due to unknown error", "fail");
		}
		return actualText;
		
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		
        try {
        	
        	
        	number = (long) (Math.floor( Math.random()*100000000)+100000);
        	
        	File tmp  = driver.getScreenshotAs(OutputType.FILE);
    		File dest = new File("./reports5/screenshots3/"+number+".jpg");
			FileUtils.copyFile(tmp,dest);
			
			//System.out.println("Snapshot is succesful");
			
		//	reportStep("Snapshot is succesful", "pass");
			
			
			
		}
        
        
        
        catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("Snapshot is failed due to IOException");
			
			reportStep("Snapshot is failed due to IOException", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("Snapshot is failed due to unknown error");
			
			reportStep("Snapshot is failed due to unknown error", "fail");
		}
        
        return number;
        
        
		
		
		
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
		try {
			driver.close();
			
			reportStep("The current browser tab is closed successfully", "pass", false);
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The browser  is not closed due to unknown error");
			
			reportStep("The browser  is not closed due to unknown error", "fail");
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
		try {
			driver.quit();
			
			reportStep("The all browser tabs is closed successfully", "pass", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The browsers  is not closed due to unknown error");
			
			reportStep("The browsers  is not closed due to unknown error", "fail");
		}
		
	}

	

	public void scrolldown(String Xpath) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(Xpath).sendKeys(Keys.PAGE_DOWN);
			
			//System.out.println("The element with Xpath "+Xpath+" is present in the DOM and page is scrolldown");
			
			//reportStep("The element with Xpath "+Xpath+" is present in the DOM and page is scrolldown", "fail");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+Xpath+" is not found in the DOM");
			
			//reportStep("The element with Xpath "+Xpath+" is not found in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Page is not scrolldown due to unknown error");
			
			//("Page is not scrolldown due to unknown error", "fail");
		}
		
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(time);
			//System.out.println("The webpage is slept with given time "+time+" sucessfully");
			
			reportStep("The webpage is slept with given time "+time+" sucessfully", "pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The webpage is not slept with given time "+time+" due to interrupted exception");
			
			reportStep("The webpage is not slept with given time "+time+" due to interrupted exception", "fail");
			
			
			
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The webpage is not slept with given time "+time+" due to unknown error");
			
			reportStep("The webpage is not slept with given time "+time+" due to unknown error", "fail");
		}
		
	}

	

	public void selectVisibileTextByName(String Name, String Value) {
		// TODO Auto-generated method stub
		try {
			WebElement s1 =driver.findElementByName(Name);
			Select sel1 = new Select(s1);
			sel1.selectByVisibleText(Value);
			
			//System.out.println("The element with Name "+Name+" is selected with visible text "+Value);
			
			reportStep("The element with Name "+Name+" is selected with visible text "+Value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Name "+Name+" is not found in the DOM");
			
			reportStep("The element with Name "+Name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Name "+Name+" is not visible in the application");
			
			reportStep("The element with Name "+Name+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Name "+Name+" is not selected  text "+Value+"due to Name "+ Name +" disabled in the application");
			
			reportStep("The element with Name "+Name+" is not selected  text "+Value+"due to Name "+ Name +" disabled in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Name "+Name+" is not interactable with application");
			
			reportStep("The element with Name "+Name+" is not interactable with application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Name "+Name+" is not stable in the application ");
			
			reportStep("The element with Name "+Name+" is not stable in the application ", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Name "+Name+" is not selected the text "+Value+" due to unknown error");
			reportStep("The element with Name "+Name+" is not selected the text "+Value+" due to unknown error", "fail");
		}
		
		
	}

	public void selectVisibileTextByXpath(String Xpath, String Value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement s1 =driver.findElementByXPath(Xpath);
			Select sel1 = new Select(s1);
			sel1.selectByVisibleText(Value);
			
			//System.out.println("The element with Xpath "+Xpath+" is selected with visible text "+Value);
			
			reportStep("The element with Xpath "+Xpath+" is selected with visible text "+Value, "pass");
			
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+Xpath+" is not found in the DOM");
			
			reportStep("The element with Xpath "+Xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+Xpath+" is not visible in the application");
			
			reportStep("The element with Xpath "+Xpath+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+Xpath+" is not selected  text "+Value+"due to Name "+ Xpath +" disabled in the application");
			
			reportStep("The element with Xpath "+Xpath+" is not selected  text "+Value+"due to Name "+ Xpath +" disabled in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+Xpath+" is not interactable with application");
			
			reportStep("The element with Xpath "+Xpath+" is not interactable with application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+Xpath+" is not stable in the application ");
			
			reportStep("The element with Xpath "+Xpath+" is not stable in the application ", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+Xpath+" is not selected the text "+Value+" due to unknown error");
			
			reportStep("The element with Xpath "+Xpath+" is not selected the text "+Value+" due to unknown error", "fail");
		}
		
		

		
	}

	public void mouseHoverByXpath(String Xpath) {
		// TODO Auto-generated method stub
		
		try {
			Actions  build = new Actions(driver);
			
			WebElement  element =  driver.findElementByXPath(Xpath);
			
			build.moveToElement(element).perform();
			
			//System.out.println("The element  with  Xpath "+Xpath+" is selected with mouse");
			
			reportStep("The element  with  Xpath "+Xpath+" is selected with mouse", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+Xpath+" is not found in the DOM");
			
			reportStep("The element with Xpath "+Xpath+" is not found in the DOM", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+Xpath+" is not visible in the application");
			
			reportStep("The element with Xpath "+Xpath+" is not visible in the application", "fail");
			
			
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+Xpath+" is not interactable with application");
			
			reportStep("The element with Xpath "+Xpath+" is not interactable with application", "fail");
			
			
		}catch (StaleElementReferenceException e) {
			
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+Xpath+" is not stable in the application ");
			
			reportStep("The element with Xpath "+Xpath+" is not stable in the application " , "fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with Xpath "+Xpath+" is failed due to unknown error");
			reportStep("The element with Xpath "+Xpath+" is failed due to unknown error", "fail");
		}
		
	}

}
