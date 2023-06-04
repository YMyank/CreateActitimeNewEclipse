package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actititme.pom.HomePage;
import com.actititme.pom.TaskListPage;

public class CustomerMudule extends BaseClass{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
		Reporter.log("Create customer", true);
	/*	HomePage hp=new HomePage(driver);
		hp.setTaskbtn();
		TaskListPage t= new TaskListPage(driver);
		t.getAddNewbtn().click();
		t.getNewCust().click();
		t.getCustName().sendKeys("HDFC_001");
		t.getCustDescp().sendKeys("Banking");
		t.getSelectCust().click();
		t.getExistCust().click();
		t.getCreateCustBtn().click();*/
		
		
	}

}
