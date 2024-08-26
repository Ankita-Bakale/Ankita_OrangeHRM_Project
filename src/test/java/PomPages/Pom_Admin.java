package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Admin {
	public Pom_Admin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/descendant::ul[1]/child::li[1]/a")
	private WebElement AdminBtn;
	
	public WebElement getAdminBtn() {
		return AdminBtn;
	}


	//----------Organization Structure--------------
	@FindBy(xpath="//header//descendant::nav/ul/li[3]")
	private WebElement organizationDrpDown;

	@FindBy(xpath="//header//descendant::nav/ul/li[3]/descendant::ul/li[3]/a")
	private WebElement structureOption;

	@FindBy(xpath="//div[@id='app']/descendant::div[21]/label/input")
	private WebElement editToggle;

	@FindBy(xpath="//body/descendant::ul[5]/child::li[2]/descendant::button[1]")
	private WebElement engineeringDrpDwn;
	
	@FindBy(xpath="//div[contains(text(), \"Quality Assurance\")]/parent::div/descendant::button[3]")
	private WebElement addJob;

	@FindBy(xpath="//form/descendant::input[1]")
	private WebElement unitId;

	@FindBy(xpath="//form/descendant::input[2]")
	private WebElement jobName;

	@FindBy(xpath="//form/descendant::textarea")
	private WebElement jobDescription;

	@FindBy(xpath="//form/descendant::button[2]")
	private WebElement jobSaveBtn;

	@FindBy(xpath="//body/descendant::ul[6]/child::li[2]/descendant::button[1]")
	private WebElement newJobDrpdwn;

	//-----------Add Skills---------------

	@FindBy(xpath="//header//descendant::nav/ul/li[4]")
	private WebElement qualificationDrpDown;

	@FindBy(xpath="//header//descendant::nav/ul/li[4]/ul/li[1]")
	private WebElement skillsOption;

	@FindBy(xpath="//div[@id='app']/descendant::div[21]/button")
	private WebElement addSkillsBtn;

	@FindBy(xpath="//form/descendant::input")
	private WebElement skillName;

	@FindBy(xpath="//form/descendant::textarea")
	private WebElement description;

	@FindBy(xpath="//form/descendant::button[2]")
	private WebElement skillSaveBtn;

	//-------------Delete Language----------------
	@FindBy(xpath="//header//descendant::nav/ul/li[4]/ul/li[4]")
	private WebElement languagesOption;

	@FindBy(xpath="//div[@id='app']/descendant::div[19]/descendant::button[2]")
	private WebElement deleteBtn;

	@FindBy(xpath="//div[@id='app']/descendant::button[19]")
	private WebElement alertAccept;

	//---------Edit Membership Details------------
	@FindBy(xpath="//header//descendant::nav/ul/li[4]/ul/li[5]")
	private WebElement membershipOption;

	@FindBy(xpath="//div[@id='app']/descendant::div[19]/descendant::button[3]")
	private WebElement editBtn;

	@FindBy(xpath="//form/descendant::input")
	private WebElement memberShipName;

	@FindBy(xpath="//form/descendant::butto")
	private WebElement membershipSaveBtn;

	//----------Organization Structure Getters--------------
	public WebElement getOrganizationDrpDown() {
		return organizationDrpDown;
	}

	public WebElement getStructureOption() {
		return structureOption;
	}

	public WebElement getEditToggle() {
		return editToggle;
	}

	public WebElement getEngineeringDrpDwn() {
		return engineeringDrpDwn;
	}

	public WebElement getAddJob() {
		return addJob;
	}

	public WebElement getUnitId() {
		return unitId;
	}

	public WebElement getJobName() {
		return jobName;
	}

	public WebElement getJobDescription() {
		return jobDescription;
	}

	public WebElement getJobSaveBtn() {
		return jobSaveBtn;
	}

	public WebElement getNewJobDrpdwn() {
		return newJobDrpdwn;
	}

	//-------------Add Skills Getters--------------

	public WebElement getQualificationDrpDown() {
		return qualificationDrpDown;
	}

	public WebElement getSkillsOption() {
		return skillsOption;
	}

	public WebElement getAddSkillsBtn() {
		return addSkillsBtn;
	}

	public WebElement getSkillName() {
		return skillName;
	}

	public WebElement getSkillDescription() {
		return description;
	}

	public WebElement getSkillSaveBtn() {
		return skillSaveBtn;
	}

	//-------------Delete Languages Getters-----------
	public WebElement getLanguagesOption() {
		return languagesOption;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getAlertAccept() {
		return alertAccept;
	}

	//------------Edit Membership Details Getters--------------
	public WebElement getMembershipOption() {
		return membershipOption;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getMemberShipName() {
		return memberShipName;
	}

	public WebElement getMembershipSaveBtn() {
		return membershipSaveBtn;
	}
}
