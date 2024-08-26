package BusinessLogic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomPages.Pom_Login;
import PomPages.Pom_Logout;

@Listeners(BusinessLogic.ListenersClass.class)
public class Login_Page extends BaseClass{
	Pom_Login login;
	Pom_Logout logout;
	//PIM_Page pim;
	String filePath = "C:\\Users\\hp\\eclipse-workspace\\Orange_HRM_Project\\src\\test\\resources\\OrangeHRM_Data.xlsx";
	public FileInputStream fis;
	public FileOutputStream fos;;
	public XSSFWorkbook workbook;

	@DataProvider(name = "logInData")
	public Object[][] logInData() {
		Object data[][] = new Object[5][2];
		data[0][0] = "Admi";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "admin12";

		data[2][0] = "admin123";
		data[2][1] = "Admin";

		data[3][0] = "@Admin";
		data[3][1] = "admin@123";

		data[4][0] = "Admin";
		data[4][1] = "admin123";
		return data;
	}

	@Test(priority = 1, dataProvider = "logInData")
	public void logIn(String username, String password) {
		login = new Pom_Login(driver);
		login.getUname().sendKeys(username);
		login.getPass().sendKeys(password);
		login.getLogInBtn().click();
	}

	@Test(priority = 2)
	public void loginByDDF() throws IOException, InterruptedException {
		logout = new Pom_Logout(driver);
		logout.getProfileDrpdwn().click();
		logout.getLogOutBtn().click();
		
		SoftAssert soft = new SoftAssert();
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Login_data");

		int rows = sheet.getLastRowNum();
		for (int i = 1; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell uname = row.getCell(0);
			XSSFCell pass = row.getCell(1);
			XSSFCell res = row.createCell(2);

			login.getUname().sendKeys(uname.toString());
			login.getPass().sendKeys(pass.toString());
			login.getLogInBtn().click();
			Thread.sleep(3000);
			try {
				String expTitle = "Dashboard";
				String actualTitle = login.getPageName().getText();
				soft.assertEquals(actualTitle, expTitle, "Dashboard/Home Page is not launched!");

				soft.assertAll();
				res.setCellValue("Login Successfull");
			} catch (Exception e) {
				res.setCellValue("Login Unsuccessfull");
			}
		}
		fis.close();
		fos = new FileOutputStream(filePath);
		workbook.write(fos);
	}
}
