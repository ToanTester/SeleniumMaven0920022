package anhtester.com.Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    //Khởi tạo Browser
    public static void CreateDriver() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //Đóng tạo Browser
    public static void closeDriver() {

        driver.quit();
    }

    public static void sleep(double Seconds) {
        try
        {
            Thread.sleep((long) (1000 * Seconds));
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

    }

}
