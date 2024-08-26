package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_PIM {
	
	public Pom_PIM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//-----------Create Employee ID------------
	@FindBy(xpath="//body/descendant::ul[1]/child::li[2]/a")
	private WebElement pim;

	@FindBy(xpath="//div[@id='app']//descendant::div[15]/descendant::button[4]")
	private WebElement addEmpBtn;

	@FindBy(name="firstName")
	private WebElement fname;

	@FindBy(name="middleName")
	private WebElement midName;

	@FindBy(name="lastName")
	private WebElement lname;

	@FindBy(xpath="//form/descendant::div[8]/descendant::div[16]/descendant::input")
	private WebElement empId;

	@FindBy(xpath="//form/descendant::div[8]/descendant::div[21]//label")
	private WebElement createLoginCred;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveBtn;

	@FindBy(xpath="//form/descendant::div[8]/descendant::div[23]/descendant::input[1]")
	private WebElement userName;

	@FindBy(xpath="//form/descendant::div[8]/descendant::div[23]/descendant::input[3]")
	private WebElement statusDisable;

	@FindBy(xpath="//form/descendant::div[8]/descendant::div[42]/descendant::input[1]")
	private WebElement password;

	@FindBy(xpath="//form/descendant::div[8]/descendant::div[42]/descendant::input[2]")
	private WebElement confirmPassword;

	//--------------Employee List details adding-----------------

	@FindBy(name="firstName")
	private WebElement listFName;

	@FindBy(name="middleName")
	private WebElement listMidName;

	@FindBy(name="lastName")
	private WebElement listLName;

	@FindBy(xpath="//body/descendant::form[1]/descendant::input[4]")
	private WebElement listEmpId;

	@FindBy(xpath="//body/descendant::form[1]/descendant::input[5]")
	private WebElement otherId;

	@FindBy(xpath="//body/descendant::form[1]/descendant::input[6]")
	private WebElement driverLicense;

	@FindBy(xpath="//body/descendant::form[1]/descendant::input[7]")
	private WebElement licenseExpDate;

	@FindBy(xpath="//body/descendant::form[1]/descendant::input[8]")
	private WebElement dob;

	@FindBy(xpath="//body/descendant::form[1]/descendant::input[9]")
	private WebElement gender;

	@FindBy(xpath="//body/descendant::button[@type='submit'][1]")
	private WebElement listSaveBtn;

	//---------EmployeeList Validation-----------

	@FindBy(xpath="//header//descendant::nav/ul/li[2]")
	private WebElement empListBtn;

	@FindBy(xpath="//div[@id='app']/descendant::button[4]")
	private WebElement empInfoDrpdown;

	@FindBy(xpath="//div[@id='app']/descendant::div[19]/descendant::input[1]")
	private WebElement searchByempName;

	@FindBy(xpath="//div[@id='app']/descendant::div[19]/descendant::input[2]")
	private WebElement searchByempId;

	@FindBy(xpath="//div[@id='app']/descendant::div[19]/descendant::button[2]")
	private WebElement resetBtn;

	@FindBy(xpath="//div[@id='app']/descendant::div[19]/descendant::button[3]")
	private WebElement searchBtn;

	@FindBy(xpath="//div[@id='app']/descendant::div[@role='table']/child::div[2]/child::div[1]/div/descendant::div[5]")
	private WebElement empIDGot;

	@FindBy(xpath="//div[@id='app']/descendant::div[@role='table']/child::div[2]/child::div[1]/div/child::div[3]/div")
	private WebElement nameGot;

	@FindBy(xpath="//div[@id='app']/descendant::div[@role='table']/child::div[2]/child::div[1]/div/child::div[4]/div")
	private WebElement lastNameGot;

	//---------Create Employee ID Getters---------------

	public WebElement getPim() {
		return pim;
	}

	public WebElement getAddEmpBtn() {
		return addEmpBtn;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getMidName() {
		return midName;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmpId() {
		return empId;
	}

	public WebElement getCreateLoginCred() {
		return createLoginCred;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getStatusDisable() {
		return statusDisable;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	//-----------Employee List details adding getters---------
	public WebElement getListFName() {
		return listFName;
	}

	public WebElement getListMidName() {
		return listMidName;
	}

	public WebElement getListLName() {
		return listLName;
	}

	public WebElement getListEmpId() {
		return listEmpId;
	}

	public WebElement getOtherId() {
		return otherId;
	}

	public WebElement getDriverLicense() {
		return driverLicense;
	}

	public WebElement getLicenseExpDate() {
		return licenseExpDate;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getListSaveBtn() {
		return listSaveBtn;
	}

	//---------EmployeeList Validation getters---------
	public WebElement getEmpListBtn() {
		return empListBtn;
	}

	public WebElement getSearchByempName() {
		return searchByempName;
	}

	public WebElement getEmpInfoDrpdown() {
		return empInfoDrpdown;
	}

	public WebElement getSearchByempId() {
		return searchByempId;
	}

	public WebElement getResetBtn() {
		return resetBtn;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getEmpIDGot() {
		return empIDGot;
	}

	public WebElement getNameGot() {
		return nameGot;
	}

	public WebElement getLastNameGot() {
		return lastNameGot;
	}
}
