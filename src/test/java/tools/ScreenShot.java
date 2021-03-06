package tools;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public void take(WebDriver webDriver, String fileName) {
        try {
            File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
            String pathname = System.getProperty("user.dir") + File.separatorChar + fileName +".jpg";
            FileUtils.copyFile(scrFile, new File(pathname));
            System.out.println("File Saved at: " + pathname);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void tt(WebDriver driver){
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:/selenium/error.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
