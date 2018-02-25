package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods
{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="To Create Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}			
@Test (dataProvider="fetchData")

public void createLead(String uName,String pwd,String cName,String FName,String LName,String VComName)
{
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogIn()
	.clickcrm()
	.clickLeads()
	.clickcreateLead()
	.CompName(cName)
	.FirName(FName)
	.LasName(LName)
	.clickSubmit();
	//.verifyLead(VComName);
}

}
