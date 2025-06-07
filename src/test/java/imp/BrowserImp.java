package imp;

import com.thoughtworks.gauge.Step;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.time.Duration;

public class BrowserImp {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Step("Brazueri aç və keçid et <url>")
    public void openBrowser(String url) {
        if (DriverManager.getDriver() == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            DriverManager.setDriver(driver); //  driver-i global managerə qeyd et
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            driver.manage().window().maximize();
        } else {
            driver = DriverManager.getDriver(); //  Mövcud driver-i götür
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        }
        driver.get(url); //  İstənilən səhifəyə keç
    }

    @Step("Brauze bagla")
    public void closeBrowser() {
        DriverManager.quitDriver(); //  driver-i bağla və null et
    }
}
