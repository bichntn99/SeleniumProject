package page;
import locator.LoginLocator;
import constant.DataLogin;

import org.openqa.selenium.WebDriver;

import javax.xml.crypto.Data;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }
    public HomePage loginSucess() {
        this.clear(LoginLocator.EMAIL_FIELD);
        this.senKey(LoginLocator.EMAIL_FIELD, DataLogin.USERNAME);
        this.clear(LoginLocator.PASSWORD_FIELD);
        this.senKey(LoginLocator.PASSWORD_FIELD, DataLogin.PASSWORD);
        this.click(LoginLocator.LOGIN_BUTTON);
        return new HomePage(this.driver);
    }
}
