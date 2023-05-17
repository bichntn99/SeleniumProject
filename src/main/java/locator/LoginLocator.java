package locator;

import com.google.auto.common.SimpleTypeAnnotationValue;
import org.openqa.selenium.By;

public class LoginLocator {
    public static final By EMAIL_FIELD = By.xpath("//div[@class='form-fields']//input[@class='email']");
    public static final By PASSWORD_FIELD = By.xpath("//div[@class='form-fields']//input[@class='password']");
    public static final By LOGIN_BUTTON = By.xpath("//button[contains(@class, 'login-button')]");
}
