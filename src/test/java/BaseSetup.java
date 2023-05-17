import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import constant.Constant;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseSetup {
    protected static WebDriver driver;
    protected Log log;

    public BaseSetup() {
        log = LogFactory.getLog(getClass());
    }
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(Constant.URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterClass() {
        driver.quit();
    }
}
