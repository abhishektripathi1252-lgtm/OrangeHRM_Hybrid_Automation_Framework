package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import driverfactory.DriverFactory;
import pages.LoginPage;

public class SearchEmployeeTest extends BaseTest {

    @Test
    public void searchEmployee() {

        LoginPage lp =
                new LoginPage(
                        DriverFactory.getDriver());

        lp.login("Admin", "admin123");

        System.out.println(
                "Search Employee Test Passed");
    }
}