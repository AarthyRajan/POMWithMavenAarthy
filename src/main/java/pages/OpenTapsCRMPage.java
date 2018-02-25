package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OpenTapsCRMPage 
extends ProjectMethods
{
	
	public OpenTapsCRMPage() 
	{
		PageFactory.initElements(driver,this);
	}	
@FindBy(how=How.ID,using="updateLeadForm_companyName")
private WebElement eleeditCompanyName;
public OpenTapsCRMPage enterupdateCopName(String EdiComapnyName) 
{
type(eleeditCompanyName,EdiComapnyName);
return this;
}
@FindBy(how=How.CLASS_NAME,using="smallSubmit")
private WebElement eleUpdate;
public ViewLeadsPage clickUpdate()
{
	click(eleUpdate);
	return new ViewLeadsPage();
}

}