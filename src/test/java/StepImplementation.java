import com.thoughtworks.gauge.Step;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepImplementation {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private  static Actions actions;

    @Step("Open browser and go to <url>")
    public void openBrowserAndGoTo(String url) {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        }

        driver.get(url);
        driver.manage().window().maximize();
    }


    @Step("Click element with XPath <xpath>")
    public void clickElementWithXPath(String xpath) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.click();
    }

    @Step("Type <text> into input with XPath <xpath>")
    public void typeIntoInputWithXPath(String text, String xpath) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.click();
        element.sendKeys(text);
    }


    @Step("Verify element with Xpath <xpath> contains text <expectedText>")
    public void verifyElementWithXPathContains(String xpath, String expectedText) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        String actualText = element.getText();

        Assert.assertTrue("Expected text not found Actual"+ actualText, actualText.contains(expectedText));

    }

    @Step("Wait for element Xpath  <xpath> to be visible")
    public void waitForElementXpathToBeVisible(String xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    @Step("Hover mouse over element with Partial Link Text <partialText>")
    public void hoverMouseOverElementWithPartialLinkText(String partialText) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(partialText)));
        actions.moveToElement(element).perform();
    }


  @Step("Type <text> into input with XPath <xpath> and  press Enter")
  public void typeIntoInputWithXPathAndPressEnter(String text, String xpath) {
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    element.clear();
    element.sendKeys(text);
    element.sendKeys(Keys.ENTER);
  }

    @Step("Type <text> into input with XPath <xpath> and  press Tab")
    public void typeIntoInputWithXPathAndPressTab(String text, String xpath) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.clear();
        element.sendKeys(text);
        element.sendKeys(Keys.TAB);
    }

    @Step("Clear input with XPath <xpath> and  press Backspace")
    public void clearInputWithXPathAndPressBackspace(String xpath) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        String existingText = element.getText();
        element.click();
       // for (int i = 0; i < existingText.length(); i++) { element.sendKeys(Keys.BACK_SPACE);}
        element.sendKeys(Keys.BACK_SPACE);
    }



    @Step("Close browser")
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
