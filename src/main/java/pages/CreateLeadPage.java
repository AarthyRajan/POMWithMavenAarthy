package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage  extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}	

@FindBy(how=How.ID,using="createLeadForm_companyName")
private WebElement eleComName;

	public CreateLeadPage CompName(String cName)
	{
	
		type(eleComName,cName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirName;
	
	public CreateLeadPage FirName(String FName)
	{
	
		type(eleFirName,FName);
		return this;
	}
		@FindBy(how=How.ID,using="createLeadForm_lastName")
		private WebElement eleLasName;
		
		public CreateLeadPage LasName(String LName)
		{
			type(eleLasName,LName);
			return this;
}
		@FindBy(how=How.NAME,using="submitButton")
		private WebElement elesubmitButton;
		
		public ViewLeadsPage clickSubmit()
		{
			click(elesubmitButton);
			return new ViewLeadsPage();
}
}
