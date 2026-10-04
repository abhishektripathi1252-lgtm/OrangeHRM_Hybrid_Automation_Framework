package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

    public static void captureScreenshot(
            WebDriver driver,
            String fileName) {

        try {

            File src =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(
                    src,
                    new File(
                            "screenshots/"
                                    + fileName
                                    + ".png"));

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}