package helper;

import imp.BrowserImp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocatorReader;

import java.time.Duration;

import  static  imp.BrowserImp.wait;
public class VerifyHelper {

public void  verifyElementTextContains(String elementName, String expectedText) {

    try {

        String type = LocatorReader.getLocatorType(elementName);
        String value = LocatorReader.getLocatorValue(elementName);
        By by = getBy(type, value);

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        String actualText = element.getText();
        if (!actualText.equals(expectedText)) {
            throw new AssertionError("Element text doesn't match expected text" + actualText);
        }


    } catch (Exception e) {
        throw new RuntimeException("Text verification failed for: " + elementName,  e);
    }

}



public  void  waitUntilElementIsVisible(String elementName, int timeoutInSeconds) {
    try {

        String type = LocatorReader.getLocatorType(elementName);
        String value = LocatorReader.getLocatorValue(elementName);
        By by = getBy(type, value);  // By.xpath("//a[@class='test']"

        WebDriverWait dynmaicWait = new WebDriverWait(BrowserImp.driver, Duration.ofSeconds(timeoutInSeconds));
        dynmaicWait.until(ExpectedConditions.visibilityOfElementLocated(by));

    } catch (Exception e) {
        throw new RuntimeException("Element not visible:" +timeoutInSeconds + elementName + e);
    }
}


private By getBy(String type, String value) throws IllegalAccessException {
    switch (type.toUpperCase()) {
        case "ID": return By.id(value);
        case "XPATH": return By.xpath(value);
        case "CSS_SELECTOR": return By.cssSelector(value);
        case "NAME": return By.name(value);
        case "LINK_TEXT": return By.linkText(value);
        case "PARTIAL_LINK_TEXT": return By.partialLinkText(value);
        case "CLASS_NAME": return By.className(value);
        default: throw  new IllegalAccessException("Invalid locator type: " + type);
       }
    }






}
