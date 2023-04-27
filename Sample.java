package sharmi.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends Run {
public static void main(String[] args){
webDriver();
getURL("https://www.amazon.in/");
max();
WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
findElement(findElement, "Iphone13");
WebElement findElement2 = driver.findElement(By.id("nav-search-submit-button"));
clickOnElement(findElement2);
WebElement findElement3 = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 14 (128 GB) - (Product) RED')]"));
javaScript(findElement3);
}
}
