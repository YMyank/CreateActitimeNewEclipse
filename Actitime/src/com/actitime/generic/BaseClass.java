package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actititme.pom.HomePage;
import com.actititme.pom.LoginPage;
import com.beust.jcommander.Parameter;

public class BaseClass {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	static{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}
	
	public  WebDriver driver;
	@Parameters("browser")
@BeforeTest
public void OpenBrowser(String browser) {
	Reporter.log("Open Browser", true);
	if(browser.contains("chrome")) {
	driver=new ChromeDriver();
	}
	else if(browser.contains("firefox")) {
		driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

@BeforeMethod
public void Login() throws IOException, InterruptedException {
	Reporter.log("Login to the Application ", true);
	FileLib f=new FileLib();
	String url = f.getPropertyData("URL");
	driver.get(url);
	String un = f.getPropertyData("USERNAME");
	String pw = f.getPropertyData("PASSWORD");

	LoginPage lp=new LoginPage(driver);
	lp.setLogin(un, pw);
	Thread.sleep(5000);
	}

@AfterMethod
public void logout() throws InterruptedException {
	Reporter.log("logout",true);
	HomePage h=new HomePage(driver);
	Thread.sleep(3000);
	h.setLogout();
}

@AfterTest
public void closeBrowser() {
	Reporter.log("closeBrowser", true);
	driver.close();
	}


}
