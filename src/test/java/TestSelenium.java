import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;

import java.time.Duration;

public class TestSelenium extends BaseSetup {
    @Test
    public void loginSucess() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.loginSucess();
    }

}
