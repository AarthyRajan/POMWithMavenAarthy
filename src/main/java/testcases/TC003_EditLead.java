package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods
{
	@BeforeTest
	public void setData() 
	{
		testCaseName="TC003_EditLead";
		testDescription="To Edit Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}			
@Test (dataProvider="fetchData")

public void EditLead(String uName,String pwd,String EdiName,String EdiComapnyName)
{
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogIn()
	.clickcrm()
	.clickLeads()
	.clickFindLeads()
	.sendEditName(EdiName)
	.clickFindButton()
	.clickEditName()
	.clickEditButton()
	.enterupdateCopName(EdiComapnyName)
	.clickUpdate();
}
}
