package PomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login {
	public Pom_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="username")
	private WebElement uname;

	@FindBy(name="password")
	private WebElement pass;

	@FindBy(xpath="//button")
	private WebElement logInBtn;

	@FindBy(xpath="//body//descendant::h6")
	private WebElement pageName;

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogInBtn() {
		return logInBtn;
	}

	public WebElement getPageName() {
		return pageName;
	}

	
}
