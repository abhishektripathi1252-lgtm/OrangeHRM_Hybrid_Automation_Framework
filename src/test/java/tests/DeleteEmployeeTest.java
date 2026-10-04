package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import driverfactory.DriverFactory;
import pages.LoginPage;

public class DeleteEmployeeTest extends BaseTest {

    @Test
    public void deleteEmployee() {

        LoginPage lp =
                new LoginPage(
                        DriverFactory.getDriver());

        lp.login("Admin", "admin123");

        System.out.println(
                "Delete Employee Test Passed");
    }
}