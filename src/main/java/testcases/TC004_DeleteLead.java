package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods
{
	@BeforeTest
	public void setData() 
	{
		testCaseName="TC004_DeleteLead";
		testDescription="To Delete Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test (dataProvider="fetchData")
	public void DeleteLead(String uName,String pwd,String EdiName,String Message)
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
		.ClickDelete()
		.clickFindLeads()
		.sendEditName(EdiName)
		.clickFindButton()
		.VerifyMessage(Message);
	}	
		
}
