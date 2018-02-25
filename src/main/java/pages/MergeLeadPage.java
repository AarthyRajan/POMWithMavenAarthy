package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage() 
	{
		PageFactory.initElements(driver,this);
	}	 
	@FindBy (how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFinButton;
public FindLeadsPage clickFromLead() 
{
	click(eleFinButton);
	switchToWindow(1);
	return new FindLeadsPage();
}

@FindBy (how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
private WebElement eleFindToLead;
public FindLeadsPage clickToLead() 
{
click(eleFindToLead);
switchToWindow(1);
return new FindLeadsPage();
}
@FindBy(how=How.LINK_TEXT,using="Merge")
private WebElement eleClickMerge;

public MergeLeadPage clickMergeLeadButton() 
{
click(eleClickMerge);
return this;
}
public ViewLeadsPage AlertAccept() 
{
	acceptAlert();
	return new ViewLeadsPage();
}

}

