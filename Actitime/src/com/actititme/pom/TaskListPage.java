package com.actititme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewbtn;
	
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement custName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDescp;
	
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCust;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement existCust;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}


public WebElement getAddNewbtn() {
	return addNewbtn;
}


public WebElement getNewCust() {
	return newCust;
}


public WebElement getCustName() {
	return custName;
}


public WebElement getCustDescp() {
	return custDescp;
}


public WebElement getSelectCust() {
	return selectCust;
}


public WebElement getExistCust() {
	return existCust;
}


public WebElement getCreateCustBtn() {
	return createCustBtn;
}

}
