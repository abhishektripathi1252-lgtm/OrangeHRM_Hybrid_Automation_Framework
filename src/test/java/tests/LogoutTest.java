package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import driverfactory.DriverFactory;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseTest {

    @Test
    public void verifyLogout() {

        LoginPage login =
                new LoginPage(
                        DriverFactory.getDriver());

        login.login(
                "Admin",
                "admin123");

        LogoutPage logout =
                new LogoutPage(
                        DriverFactory.getDriver());

        logout.logout();
    }
}