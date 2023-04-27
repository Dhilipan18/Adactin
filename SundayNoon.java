package sharmi.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SundayNoon {
	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Sharmilaa\\eclipse-workspace\\Deepu\\Driver\\msedgedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("www.facebook.com");
	
	}
}

