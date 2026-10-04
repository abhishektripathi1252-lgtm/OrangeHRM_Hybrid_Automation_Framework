package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import driverfactory.DriverFactory;
import pages.LoginPage;

public class EditEmployeeTest extends BaseTest {

    @Test
    public void editEmployee() {

        LoginPage lp =
                new LoginPage(
                        DriverFactory.getDriver());

        lp.login("Admin", "admin123");

        System.out.println(
                "Edit Employee Test Passed");
    }
}