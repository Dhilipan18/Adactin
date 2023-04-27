package sharmi.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ControlSttatements {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Sharmilaa\\eclipse-workspace\\Deepu\\Driver\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.get("https://www.facebook.com/");


}
}
