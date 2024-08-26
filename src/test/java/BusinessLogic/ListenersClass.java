package BusinessLogic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.BaseClassFinder;

public class ListenersClass extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname + " Excecution started.");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname + " Excecution Pass.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String methodname = result.getMethod().getMethodName();
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Orange_HRM_Project\\TestFail_SS\\"+methodname+".jpeg");
		File dest2 = new File("C:\\Users\\hp\\Pictures\\TestFail_SS\\"+methodname+".jpeg");
		try {
	        FileUtils.copyFile(src, dest);
	        FileUtils.copyFile(src, dest2);
	        System.out.println("Screenshot saved to: TestFail_SS" );
	    } catch (IOException e) {
	        System.out.println("Error saving screenshot: " + e.getMessage());
	    }
	    System.out.println(methodname + " Execution Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname + " Excecution Skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		String methodname = context.getName();
		System.out.println(methodname + " Excecution Finished");
	}
}
