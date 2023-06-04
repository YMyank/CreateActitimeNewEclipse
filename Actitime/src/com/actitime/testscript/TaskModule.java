package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule  extends BaseClass{
	@Test
	public void createTask() {
		Reporter.log("Create Task", true);
	}

}
