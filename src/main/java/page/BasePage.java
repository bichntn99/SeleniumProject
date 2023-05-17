package page;

import constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage{
    public WebDriver driver;
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(Constant.TIME_OUT));

    }
    public void senKey(By by, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(value);
    }

    public void clear(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).clear();
    }

    public void click(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }
}
