package BusinessLogic;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomPages.Pom_Admin;
import PomPages.Pom_Logout;

@Listeners(BusinessLogic.ListenersClass.class)
public class Admin_Page extends BaseClass{
	Pom_Admin admin;
	JavascriptExecutor js;

	@Test(priority =-1)
	public void adminModule() throws InterruptedException {
		admin = new Pom_Admin(driver);
		js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		admin.getAdminBtn().click();

		// Add Job in Organization Structure flow
		admin.getOrganizationDrpDown().click();
		admin.getStructureOption().click();
		admin.getEditToggle().click();
		admin.getEngineeringDrpDwn().click();
		js.executeScript("arguments[0].click()", admin.getAddJob());
		admin.getUnitId().sendKeys("2703");
		admin.getJobName().sendKeys("Automation Test Engineer");
		admin.getJobDescription().sendKeys(
				"Design and develop automated testing solutions to ensure software quality, using programming languages and testing frameworks to identify and report defects.");
		admin.getJobSaveBtn().click();
		Thread.sleep(3000);
		admin.getEngineeringDrpDwn().click();
		wait.until(ExpectedConditions.visibilityOf(admin.getNewJobDrpdwn()));
		if (admin.getNewJobDrpdwn().isDisplayed()) {
			admin.getNewJobDrpdwn().click();
			System.out.println("New Job Added in Organization structure");
		} else {
			System.out.println("New Job didn't get Added in Organization structure");
		}

		// Add Admin Skills
		admin.getQualificationDrpDown().click();
		admin.getSkillsOption().click();
		
		wait.until(ExpectedConditions.visibilityOf(admin.getAddSkillsBtn()));
		admin.getAddSkillsBtn().click();
		admin.getSkillName().sendKeys("Selenium");
		admin.getSkillDescription().sendKeys("Proficient in Selenium WebDriver for automating web application testing");
		admin.getSkillSaveBtn().click();

		// Delete Language
		admin.getQualificationDrpDown().click();
		admin.getLanguagesOption().click();
		admin.getDeleteBtn().click();
		wait.until(ExpectedConditions.visibilityOf(admin.getAlertAccept()));
		js.executeScript("arguments[0].click()", admin.getAlertAccept());

		// Edit Membership Details
		admin.getQualificationDrpDown().click();
		admin.getMembershipOption().click();
		admin.getEditBtn().click();
		
		admin.getMemberShipName().sendKeys(Keys.CONTROL, "a");
		admin.getMemberShipName().sendKeys(Keys.DELETE);
		admin.getMemberShipName().sendKeys("AGB");
		admin.getMembershipSaveBtn().click();
	}
}
