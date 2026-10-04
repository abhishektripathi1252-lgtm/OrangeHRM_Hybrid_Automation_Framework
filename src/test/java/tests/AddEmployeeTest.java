package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import driverfactory.DriverFactory;
import pages.EmployeePage;
import pages.LoginPage;

public class AddEmployeeTest extends BaseTest {

    @Test
    public void addEmployee() {

        LoginPage lp =
                new LoginPage(
                        DriverFactory.getDriver());

        lp.login("Admin", "admin123");

        EmployeePage emp =
                new EmployeePage(
                        DriverFactory.getDriver());

        emp.addEmployee(
                "Rahul",
                "Sharma");
    }
}