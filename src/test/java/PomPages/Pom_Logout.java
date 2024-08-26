package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Logout {
	public Pom_Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//body//descendant::ul[2]/li//i")
	private WebElement profileDrpdwn;

	@FindBy(xpath="//body//descendant::ul[3]/child::li[4]/a")
	private WebElement logOutBtn;

	public WebElement getProfileDrpdwn() {
		return profileDrpdwn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
}
