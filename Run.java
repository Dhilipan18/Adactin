package sharmi.org;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Run {
	 static WebDriver driver;
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	
	 public static  void webDriver() {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Sharmilaa\\eclipse-workspace\\Deepu\\Driver\\msedgedriver.exe");
	 driver = new EdgeDriver();
}
	 public static void getURL(String URL) {
		 driver.get(URL);
	 }
	 public static void max() {
		 driver.manage().window().maximize();
	 }
	 public static void findElement(WebElement a , String b) {
		 a.sendKeys(b);
	 }
	 public static void clickOnElement(WebElement b) {
		 b.click();
	 }
	 public static  void click() {
driver.quit();
	}
	 public static void snap(String s ) {
		 TakesScreenshot tk = (TakesScreenshot)driver;
		 File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\Sharmilaa\\Pictures\\Screenshots"+s+".png");
		 
	 }
	 
//	 public static  void javaScript(WebElement d,String v ) {
//d.
//	}
	 
}

