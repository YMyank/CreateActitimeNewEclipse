package com.actititme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id="logoutLink")
private WebElement lgout;

@FindBy(xpath="//a[@class='content tasks']")
private WebElement taskbtn;


public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public void setLogout() {
	lgout.click();
}


public void setTaskbtn() {
	taskbtn.click();
	
}



}
