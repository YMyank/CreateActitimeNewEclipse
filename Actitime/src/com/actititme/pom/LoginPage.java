package com.actititme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untxb;
	
  @FindBy(name="pwd")
  private WebElement pwtxb;
  
  @FindBy(xpath="//div[text()='Login ']")
  private WebElement lgbtn;
  
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
public void setLogin(String un, String pw) {
	untxb.sendKeys(un);
	pwtxb.sendKeys(pw);
	lgbtn.click();
}
}
