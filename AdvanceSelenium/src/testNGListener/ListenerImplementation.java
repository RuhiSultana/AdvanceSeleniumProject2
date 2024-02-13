package testNGListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import configurationAnnotation.BaseClass;

public class ListenerImplementation extends BaseClassListener  implements ITestListener{

	public static int i=1;
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test execution started ",true);	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test execution sucess ",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test execution failed",true);
		 
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./errorshots/"+i+"errors.png");
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
		
		
	}
}
