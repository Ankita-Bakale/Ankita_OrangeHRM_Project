package BusinessLogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
    private String browser;
    private String url;
    public static WebDriver driver;
    private static boolean browserLaunched = false;

    @Parameters({ "browser", "url" })
    @BeforeClass
    public void launchBrowser( String browser, String url) {
        if (browserLaunched) {
        	System.out.println("Browser Already Launched");
        	
        }else {
        	this.browser = browser;
            this.url = url;
            if (browser.equalsIgnoreCase("CHROME")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("EDGE")) {
                driver = new EdgeDriver();
            } else {
                driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            browserLaunched=true;
        }
    }
}

//	public void TempLogin() {
//		login = new Pom_Login(driver);
//		login.getUname().sendKeys("Admin");
//		login.getPass().sendKeys("admin123");
//		login.getLogInBtn().click();
//	}
