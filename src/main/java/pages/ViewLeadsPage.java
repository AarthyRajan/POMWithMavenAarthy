package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadsPage 
extends ProjectMethods{
	
	public ViewLeadsPage() {
		PageFactory.initElements(driver,this);
	}	
@FindBy(how=How.ID,using="viewLead_companyName_sp")
private WebElement eleviewLead;

	public ViewLeadsPage verifyLead(String VComName)
	{
		verifyPartialText(eleviewLead,VComName);
		return this;
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Edit')]")
	private WebElement eleEditButton;
	public OpenTapsCRMPage clickEditButton() 
	{
		click(eleEditButton);
		return new OpenTapsCRMPage();
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Delete')]")
	private WebElement eleDeleteButton;
public MyLeadsPage ClickDelete() 
{
	click(eleDeleteButton);
	return new MyLeadsPage();
}
}

