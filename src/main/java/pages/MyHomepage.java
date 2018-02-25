package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomepage extends ProjectMethods{
	
	public MyHomepage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;
	
	public MyLeadsPage clickLeads()
	{
		click(eleLeads);
		return new MyLeadsPage();
	}
	
}
