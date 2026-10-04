package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driverfactory.DriverFactory;
import pages.LoginPage;
import base.BaseTest;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        return new Object[][] {

                {"Admin", "admin123"},
                {"Admin", "admin123"}

        };
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String username,
                            String password) {

        LoginPage login =
                new LoginPage(
                        DriverFactory.getDriver());

        login.login(username, password);

        System.out.println(
                "Login Successful for: "
                        + username);
    }
}