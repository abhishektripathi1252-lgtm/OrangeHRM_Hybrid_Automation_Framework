package base;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driverfactory.DriverFactory;

public class BaseTest {

    @BeforeMethod
    public void setup() {

        DriverFactory.initDriver();

        DriverFactory.getDriver()
                .manage()
                .window()
                .maximize();

        DriverFactory.getDriver()
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        DriverFactory.getDriver()
                .get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}