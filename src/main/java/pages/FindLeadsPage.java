package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods
{
	
	public FindLeadsPage() 
	{
		PageFactory.initElements(driver,this);
	}	
	
@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
private WebElement eleEditName;

public FindLeadsPage sendEditName(String EdiName)
{
	type(eleEditName,EdiName);
	return this;
}
@FindBy (how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
private WebElement eleFinButton;

public FindLeadsPage clickFindButton()
{
	click(eleFinButton);
	return this;
}

public ViewLeadsPage clickEditName()
{
	click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	return new ViewLeadsPage();
}
@FindBy (how=How.XPATH,using="//div[@class='x-paging-info']")
private WebElement eleMessage;
public FindLeadsPage VerifyMessage(String Message)
{
	verifyPartialText(eleMessage,Message);
	return this;
}
@FindBy(how=How.NAME,using="firstName")
private WebElement eleFirstName;
public FindLeadsPage sendFirstName(String FirstNameMerge)
{
	type(eleFirstName,FirstNameMerge);
	return this;
}

@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
private WebElement eleFindLeadMerge;
public FindLeadsPage FindLeadMerge()
{
	click(eleFindLeadMerge);
	return this;
}
@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[1]")
	private WebElement eleFirstMergeLead;
	public MergeLeadPage clickFirstMergeLead()
	{
		click(eleFirstMergeLead);
		return new MergeLeadPage();
		
	}
	@FindBy(how=How.NAME,using="firstName")
	private WebElement eleSecondName;
	public FindLeadsPage sendSecondName(String SecondNameMerge)
	{
		type(eleFirstName,SecondNameMerge);
		return this;
	}
	
}






