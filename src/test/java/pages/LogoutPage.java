package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
    WebElement profile;

    @FindBy(linkText="Logout")
    WebElement logout;

    public void logout() {

        profile.click();
        logout.click();
    }
}
