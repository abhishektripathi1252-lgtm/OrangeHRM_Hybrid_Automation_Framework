package pages;

import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver){

        this.driver = driver;
    }

    public String getPageTitle(){

        return driver.getTitle();
    }

}