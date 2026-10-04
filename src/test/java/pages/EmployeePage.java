package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    WebDriver driver;

    public EmployeePage(WebDriver driver) {

        this.driver = driver;
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

        pimMenu.click();

        addEmployee.click();

        firstName.sendKeys(fname);

        lastName.sendKeys(lname);

        saveButton.click();
    }
}