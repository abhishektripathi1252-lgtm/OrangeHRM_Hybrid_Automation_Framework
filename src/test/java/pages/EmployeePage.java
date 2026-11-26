package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeePage {

    WebDriver driver;
    WebDriverWait wait;

    public EmployeePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='PIM']")
    WebElement pimMenu;

    @FindBy(xpath = "//a[contains(@class,'oxd-topbar-body-nav-tab-item') and contains(text(),'Add Employee')]")
    WebElement addEmployee;

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;

    public void addEmployee(String fname, String lname) {

        wait.until(ExpectedConditions.elementToBeClickable(pimMenu));
        pimMenu.click();

        wait.until(ExpectedConditions.elementToBeClickable(addEmployee));
        addEmployee.click();

        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(fname);

        wait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.sendKeys(lname);

        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        saveButton.click();
    }
}